import java.util.Scanner;

//Factory Pattern

public class Plane extends Transport_Factory implements Transport{

    public int createOrder(){

        int pr;

        System.out.println("Enter the distance");

        Scanner inn1 = new Scanner(System.in);

        int dis = inn1.nextInt();

        System.out.println("Enter the cargo weight");

        int weight = inn1.nextInt();

        if (weight < 30000){

             pr =  20 * dis;
        }
        else {
             pr = 25 * dis;
        }
        return pr;
    }
// Abstract Factory Pattern

    public Model_Transport getModelTransport(String modelType)
    {
        Model_Transport transport = null;

        if ("1".equals(modelType))
        {
            transport = new AH132();
        }
        else if ("2".equals(modelType))
        {
            transport = new Boing474();
        }
        return transport;
    }

}
