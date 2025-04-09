import java.sql.SQLOutput;
import java.util.Scanner;
public class Showroom implements utility{
    String showroom_name;
    String showroom_location;
    int total_employees;
    int total_cars_in_stock = 0;
    String manager_name;

    public void get_details() {
        System.out.println("Showroom Name: "+showroom_name);
        System.out.println("Showroom LOCATION: "+showroom_location);
        System.out.println("Manager Name: "+manager_name);
        System.out.println("Total Employees: "+total_employees);
        System.out.println("Total Cars In Stock: "+total_cars_in_stock);

    }

    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.print("SHOWROOM NAME: ");
        showroom_name = sc.nextLine();
        System.out.print(("SHOWROOM LOCATION: "));
        showroom_location = sc.nextLine();
        System.out.print("MANAGER NAME: ");
        manager_name = sc.nextLine();
        System.out.print("TOTAL NO OF EMPLOYEES: ");
        total_employees = sc.nextInt();
        System.out.print("TOTAL CARS IN STOCK: ");
        total_cars_in_stock = sc.nextInt();

    }
}