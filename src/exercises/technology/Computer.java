package exercises.technology;

public class Computer extends AbstractEntity {
    public String brand;
    public String model;
    public int ram; //gigabytes of memory
    public boolean firewallProtected = false;
    public int idNumber;

    public Computer() {}

    public Computer(String aBrand, String aModel, int aRam) {
        this.brand = aBrand;
        this.model = aModel;
        this.ram = aRam;
        idNumber = getIdNumber();
    }

    public void installFirewall() {
        this.firewallProtected = true;
    }

    public void addRam(int moreRam) {
        this.setRam(Integer.sum(ram, moreRam));
    }

    @Override
    public String toString() {
        return "Tech ID Number: " + idNumber + ", Your " + brand + " " + model + " computer, has " + ram + " GB's of memory. To say it is firewall protected would be " + firewallProtected + ".";
    }

    //getters and setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isFirewallProtected() {
        return firewallProtected;
    }

    public void setFirewallProtected(boolean firewallProtected) {
        this.firewallProtected = firewallProtected;
    }

}
