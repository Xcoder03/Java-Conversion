import java.util.Scanner;

public class TempConversion {
     public  static void menu(){

         Scanner a = new Scanner(System.in);
         Scanner value = new Scanner(System.in);
         System.out.println("Welcome to Temperature Conversion");
         System.out.println("Getting started......");
         int option;
         double temp;


         do {
             System.out.println("Please which temperature would you like to convert to");
             System.out.println(">>>> Enter an option  <<<< \n >> (1) Convert To Celsius\n >> (2) Convert To Fahrenheit\n >> (3) Back To Menu");
              option = a.nextInt();
              switch (option){
                  case 1:
                      System.out.println("Enter a value");
                      temp = value.nextDouble();
                      break;
                  case 2:
                      System.out.println("Enter a value");
                       temp = value.nextDouble();
                      break;

                  case 3:
                      System.out.println("Closing......");
                      break;
                  default:
                      System.out.println("  >>  Enter valid option");

              }
         }while (option != 3);
     }


     public static   double convertToCelsius (double value){
            double ans = (value )
     }
}
