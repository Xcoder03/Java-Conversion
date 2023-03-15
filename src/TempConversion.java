import java.util.Scanner;

public class TempConversion {
     public   void menu(){

         Scanner a = new Scanner(System.in);
         Scanner value = new Scanner(System.in);
         System.out.println("Welcome to Temperature Conversion");
         System.out.println("Getting started......");
         int option;
         double temp;


         do {
             System.out.println("Please which temperature would you like to convert to");
             System.out.println(">>>> Enter an option  <<<< \n >> (1) Convert To Celsius\n >> (2) Convert To Fahrenheit\n >> (3) Exit");
             option = a.nextInt();
             switch (option) {
                 case 1 -> {
                     System.out.println("Enter a value");
                     temp = value.nextDouble();
                     convertToCelsius(temp);
                 }
                 case 2 -> {
                     System.out.println("Enter a value");
                     temp = value.nextDouble();
                     convertToFahrenheit(temp);
                 }
                 case 3 -> System.out.println("Closing......");
                 default -> System.out.println("  >>  Enter valid option");
             }
         }while (option != 3);
         a.close();
     }


     public static void  convertToCelsius (double valueTemp){
            double ans = (valueTemp - 32 )  * 5/9;
         System.out.println(valueTemp + "°F is " + ans + "°C.");

     }

    public static  void convertToFahrenheit (double valueTemp){
        double ans = (valueTemp *  9/5 ) + 32;
        System.out.println(valueTemp + "°C is " + ans + "°F.");
    }


}
