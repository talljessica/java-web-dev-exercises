package exercises.technology;


public class Laptop extends Computer {
    public double batteryLife; //hours of battery life
    public boolean touchScreen = false;

    public Laptop() {}

    public Laptop(String brand, String model, int ram, boolean firewallProtected) {
        this.brand = brand;
        this.model = model;
        this.ram = ram; //gigabytes of memory
        this.firewallProtected = firewallProtected;
    }

    public Laptop(String brand, String model, int ram, boolean firewallProtected, double batteryLife, boolean touchScreen) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.batteryLife = batteryLife;
        this.touchScreen = touchScreen;
        idNumber = getIdNumber();
    }

    //subtract hours laptop is used to find hours left of battery life

    public double useLaptop(double timeUsed) {
        if (batteryLife > 0.0) {
            batteryLife = batteryLife - timeUsed;
        }
        if (batteryLife == 0.0) {
            System.out.println("No battery life!");
        }
        return batteryLife;
    }

    @Override
    public String toString() {
        return "Tech ID Number: " + idNumber + ", Your " + brand + " " + model + " laptop, has " + ram + " GB's of memory and " + batteryLife + " hours of battery life. To say it is firewall protected would be " + firewallProtected + " and a touch screen would be " + touchScreen + ".";

    }

    //getters and setters

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }
}
