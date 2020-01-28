package exercises.technology;


public class Program {
    public static void main(String[] args) {
        System.out.println("Technology:");
        Computer firstComputer = new Computer("HP", "Envy 32", 16);
        System.out.println(firstComputer);

        Laptop firstLaptop = new Laptop("Apple", "MacBook Pro", 16, true, 10, false);
        System.out.println(firstLaptop);

        SmartPhone firstSmartPhone = new SmartPhone("Samsung", "Galaxy Note 10", 8, 6.3, false );
        System.out.println(firstSmartPhone);


        System.out.println("\nMy Methods:");
        firstComputer.installFirewall();
        firstComputer.addRam(8);
        System.out.println(firstComputer);

        firstLaptop.useLaptop(3);
        firstLaptop.installFirewall();
        System.out.println(firstLaptop);
        //laptop is not changing to firewall protected by entering laptop info, only by using install firewall method...

        firstSmartPhone.installFacebook(true);
        System.out.println(firstSmartPhone);
    }
}
