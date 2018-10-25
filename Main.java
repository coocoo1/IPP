import java.io.IOException;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) throws InterruptedException, IOException, CloneNotSupportedException{

      // Factory Pattern

      System.out.println("Singleton Pattern :");

      Logistic_Factory lf = Logistic_Factory.getInstance(); //Singleton Pattern

      System.out.println("Factory Pattern :");

      Transport tr = lf.doOrder();

      System.out.println("Price :" + tr.createOrder());

      // Abstract Factory Pattern

        Model_Transport modTransport = null;
        Transport_Factory tranFactory = null;
        String tranMaxWeight = null;

        while (true)
        {
          System.out.println("Abstract Factory Pattern :");
          System.out.println("Write '1' - for 1 st type transport\n" +
                             "Write '2' - for 2 nd type transport\n" +
                             "Write '3' - for 3 st type transport\n");

          Scanner scan = new Scanner(System.in);
          String st;
          st = scan.nextLine();

          tranFactory = Transport_Factory.getTypeTransport(st);

          System.out.println("Type transport: " + tranFactory.getClass().getName());

          System.out.println();

          System.out.println("Write '1' - for 1 st model transport\n" +
                  "Write '2' - for 2 nd model transport\n");

          st = scan.nextLine();

          modTransport = tranFactory.getModelTransport(st);

          System.out.println("Model transport : " + modTransport.getClass().getName());

          tranMaxWeight = modTransport.maxValueWeight();

          System.out.println(tranMaxWeight);

          System.out.println("hit an Enter key to exit");
          Thread.sleep(3000);
          if (System.in.available() !=0) {
            System.out.println("I'm quitting! Bye!");
            break;
          }

        }

      // Builder Pattern

      System.out.println("Builder Pattern :");

      System.out.println();

      CargoRegistration cr = new CargoRegistrationBuilder().setName("Bananas").setWeight(5000).setDestination("Moldova").getCargoRegistration();

      cr.printCargoRegistration();

      // Prototype Pattern

      System.out.println("Prototype Pattern :");

      System.out.println();

      CargoRegistration cr1 = (CargoRegistration) cr.clone();

      cr1.printCargoRegistration();

    }

}
