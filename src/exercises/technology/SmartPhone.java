package exercises.technology;


public class SmartPhone extends Computer{
    public double display; //size of screen in inches
    public boolean hasFacebook = false;

    public SmartPhone(){}

    public SmartPhone(String brand, String model, int ram, double display, boolean hasFacebook){
        this.brand = brand;
        this.model = model;
        this.ram = ram; //gigabytes of memory
        this.display = display;
        this.hasFacebook = hasFacebook;
        idNumber = getIdNumber();
    }

    @Override
    public String toString() {
        return "Tech ID Number: " + idNumber + ", Your " + brand + " " + model + " smartphone, has " + ram + " GB's of memory and a display size of " + display + " inches. To say it has 'Facebook' installed would be " + hasFacebook + ".";
    }

    //getters and setters

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public boolean isHasFacebook(){
        return hasFacebook;
    }

    public void installFacebook(boolean hasFacebook){
        this.hasFacebook = hasFacebook;
    }

}
