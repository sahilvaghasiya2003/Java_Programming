import java.util.*;

public class pr_04_02 {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.calculation();
        employee e2 = new employee();
        e2.calculation();
        employee e3 = new employee();
        e3.calculation();
    }
}

class employee {
    String name;
    int code;
    String designation;
    int basic_pay;
    Scanner sc = new Scanner(System.in);

    employee() {
        System.out.println("Enter Employee name: ");
        name = sc.nextLine();
        System.out.println("Enter Employee designation: ");
        designation = sc.nextLine();
        System.out.println("Enter Employee code: ");
        code = sc.nextInt();
        System.out.println("Enter Employee basic pay: ");
        basic_pay = sc.nextInt();

    }

    void calculation() {
        double HRA;
        double DA;
        HRA = (basic_pay * 10) / 100;
        DA = (basic_pay * 45) / 100;
        double totle_pay = basic_pay + HRA + DA;
        System.out.println("HRA of " + name + " :" + HRA);
        System.out.println("DA of " + name + " :" + DA);
        System.out.println("totle pay of " + name + " :" + totle_pay);

    }

}