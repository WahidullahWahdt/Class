
public class Main {
    public static void main(String[] args) {
       Vehicle mersedes = new LuxuryVechile(new LuxuryDrive());
       mersedes.drive();

       Vehicle audi = new SportsVehicle(new LuxuryDrive());
       audi.drive();

       Vehicle bmw=new LuxuryVechile(new NormalDrive());
       bmw.drive();
    }
}