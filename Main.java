import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Number Enter :");
        int number = inp.nextInt();
        int tempNumber = number;
        int basNumber = 0;
        int basValue;
        int result =0;
        int basPow;

        while (tempNumber!=0) {
            tempNumber /= 10;
            basNumber++;

        }
        if (basNumber != 3) {
            System.out.println("Bu bir üç basamaklı sayı değildir");
        }
        tempNumber=number;
        while (tempNumber!=0){
            basValue=tempNumber%10;
            basPow=1;
             for(int i=1;i<=basNumber;i++){
                 basPow*=basValue;
             }
             result +=basPow;
            tempNumber/=10;
        }
        if (number==result){
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        }else{
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        }

    }
}