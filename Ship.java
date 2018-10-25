import java.util.Scanner;

//Factory Pattern

public class Ship extends Transport_Factory implements Transport{

    public int createOrder(){

        int pr;

        System.out.println("Enter the distance");

        Scanner inn1 = new Scanner(System.in);

        int dis = inn1.nextInt();

        System.out.println("Enter the cargo weight");

        int weight = inn1.nextInt();

        if (weight < 20000){

            pr =  15 * dis;
        }
        else if(weight < 20000 & weight < 50000){
            pr = 18 * dis;
        }
        else
            pr = 25 * dis;

        return pr;
    }

    // Abstract Factory Pattern

    public Model_Transport getModelTransport(String modelType)
    {
        Model_Transport transport = null;

        if ("1".equals(modelType))
        {
            transport = new Titan18();
        }
        else if ("2".equals(modelType))
        {
            transport = new Neptune8();
        }
        return transport;
    }

}
