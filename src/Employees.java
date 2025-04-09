import java.util.Scanner;
import java.util.UUID;
public class Employees extends Showroom implements utility{
    String staff_id;
    String staff_name;
    int staff_age;
    String staff_department;


    public void get_details() {
        System.out.println("ID: "+staff_id);
        System.out.println("Name: "+staff_name);
        System.out.println("Age: "+staff_age);
        System.out.println("Department: "+staff_department);
        System.out.println("Showroom Name: "+showroom_name);

    }
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        staff_id = String.valueOf(uuid);
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("EMPLOYEE NAME: ");
        staff_name = sc.nextLine();
        System.out.print(("EMPLOYEE AGE: "));
        staff_age = sc.nextInt();
        sc.nextLine();
        System.out.print("EMPLOYEE DEPARTMENT: ");
        staff_department = sc.nextLine();
        System.out.print("SHOWROOM NAME: ");
        showroom_name = sc.nextLine();


    }
}