
// Builder Pattern

public class CargoRegistrationBuilder {
    private String name;
    private int weight;
    private double value;
    private int number;
    private String destination;

    public CargoRegistrationBuilder setName(String name){
        this.name = name;
        return this;
    }

    public CargoRegistrationBuilder setWeight(int weight){
        this.weight = weight;
        return this;
    }

    public CargoRegistrationBuilder setValue(double value){
        this.value = value;
        return this;
    }

    public CargoRegistrationBuilder setNumber(int number){
        this.number = number;
        return this;
    }

    public CargoRegistrationBuilder setDestination(String destination){
        this.destination = destination;
        return this;
    }

    public CargoRegistration getCargoRegistration()
    {
        return new CargoRegistration(name, weight, value, number, destination);
    }


}
