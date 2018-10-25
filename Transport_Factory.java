
// Abstract Factory Pattern

public abstract class Transport_Factory {

    public abstract Model_Transport getModelTransport(String modelType);

    public static Transport_Factory getTypeTransport(String transportType)
    {
        Transport_Factory trType =  null;
        if("1".equals(transportType))
        {
            trType = new Plane();
        }
        else if ("2".equals(transportType))
        {
            trType = new Truck();
        }
        else if ("3".equals(transportType))
        {
            trType = new Ship();
        }
        return trType;
    }

}

