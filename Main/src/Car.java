
public class Car {
    String colour;
    String manufacturer;
    int fuelConsumption;
    int carWeight;
    int horsePowers;

    public Car() {
    }

    public Car(String colour, String manufacturer, int fuelConsumption, int carWeight, int horsePowers) {
        this.colour = colour;
        this.manufacturer = manufacturer;
        this.fuelConsumption = fuelConsumption;
        this.carWeight = carWeight;
        this.horsePowers = horsePowers;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    public  void  voice() {
        System.out.print(" Beeep beeep ");
    }

    public  void  carStarted() {
        System.out.println("Car started ");
    }

    public  void  carSoped() {
        System.out.println("Car stopped ");
    }
}