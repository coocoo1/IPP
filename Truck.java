import java.util.Scanner;

//Factory Pattern

public class Truck extends Transport_Factory implements Transport{

    public int createOrder(){

        int pr;

        System.out.println("Enter the distance");

        Scanner inn1 = new Scanner(System.in);

        int dis = inn1.nextInt();

        System.out.println("Enter the cargo weight");

        int weight = inn1.nextInt();

        if (weight < 3500){

            pr =  5 * dis;
        }
        else {
            pr = 8 * dis;
        }
        return pr;
    }

    // Abstract Factory Pattern

    public Model_Transport getModelTransport(String modelType)
    {
        Model_Transport transport = null;

        if ("1".equals(modelType))
        {
            transport = new Scania();
        }
        else if ("2".equals(modelType))
        {
            transport = new DAF();
        }
        return transport;
    }


}
