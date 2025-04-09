
import java.util.Scanner;

public class Cars extends Showroom implements utility{
    String vehicle_name;
    String car_exterior_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission_mode;


    public void get_details(){
        System.out.println("NAME: "+vehicle_name);
        System.out.println("COLOR: "+car_exterior_color);
        System.out.println("FUEL TYPE: "+car_fuel_type);
        System.out.println("PRICE: "+car_price);
        System.out.println("CAR TYPE: "+car_type);
        System.out.println("TRANSMISSION MODE: "+car_transmission_mode);
    }


    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.println();
        System.out.print("CAR NAME: ");
        vehicle_name = sc.nextLine();
        System.out.print(("CAR COLOR: "));
        car_exterior_color = sc.nextLine();
        System.out.print("CAR FUEL TYPE(PETROL/DIESEL): ");
        car_fuel_type = sc.nextLine();
        System.out.print("CAR PRICE: ");
        car_price = sc.nextInt();
        sc.nextLine();
        System.out.print("CAR TYPE(BMW/MERCEDES/HATCHBACK): ");
        car_type = sc.nextLine();
        System.out.print("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        car_transmission_mode = sc.nextLine();
        total_cars_in_stock++;
    }
}