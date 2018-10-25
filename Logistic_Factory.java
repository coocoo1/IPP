import java.util.Scanner;

//Factory Pattern

public class Logistic_Factory {

     public Transport doOrder() {

         Transport obj= null;

         System.out.println("Select logistic :");
         Scanner in = new Scanner(System.in);
         System.out.println("1  - Plane \n" +
                 "2  - Truck \n" +
                 "3  - Ship \n");

         Scanner inn = new Scanner(System.in);

         int numL = inn.nextInt();

         if (numL == 1)
             obj = new Plane();
         else if (numL == 2)
             obj = new Truck();
         else if (numL == 3)
             obj = new Ship();

         return obj;
     }

    //Singleton Pattern

    public static Logistic_Factory obj;

     private Logistic_Factory(){

           System.out.println("Order created");

     }

     public static Logistic_Factory getInstance()
     {
         if(obj == null)
         {
             obj = new Logistic_Factory();
         }
         return obj;
     }
}
