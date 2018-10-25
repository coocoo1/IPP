// Builder Pattern

public class CargoRegistration implements Cloneable{
    private String name;
    private int weight;
    private double value;
    private int number;
    private String destination;

public  CargoRegistration(String name, int weight, double value, int number, String destination)
{
    super();
    this.name = name;
    this.weight = weight;
    this.value = value;
    this.number = number;
    this.destination = destination;

}

public void printCargoRegistration(){

    System.out.println("Name = " + name +"\n" + "Weight  = " + weight + "\n" + "Value = " + value + "\n" + "Number =" + number + "\n" + "Destination =" + destination );
}


    // Prototype Pattern

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}
