import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Bir Sayı Giriniz = ");
        number = input.nextInt();
        int tempNumber = number;
        int basNumber = 0;
        int basValue;
        int basPow;
        int result = 0;
        // girilen sayının basamak değerini bulunması.
        while (tempNumber != 0){
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;
        //basamak değerlerinin ne olduğunu ve bu değerlerinin basamak sayısı kadar üssünün alınması.
        while (tempNumber != 0){
          basValue=  tempNumber %10;

          basPow =1;
          for (int i=1; i<=basNumber; i++){
              basPow *= basValue;
          }
            result += basPow;
            tempNumber/=10;
        }
        if (result == number){
            System.out.println(number + " sayısı bir armstrong sayıdır");
        }else{
            System.out.println(number + " sayısı bir armstrong sayısı değildir.");
        }


    }
}
