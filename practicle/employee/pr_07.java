package employee;

import java.util.*;

class Employee {
    String name;
    int emp_numb;
    String gender;

    Scanner sc = new Scanner(System.in);
 
    void input_data() {

        System.out.println("Enter Employee name: ");
        name = sc.nextLine();
        System.out.println("Enter Employee gender(male/female): ");
        gender = sc.nextLine();
        System.out.println("Enter Employee code: ");
        emp_numb = sc.nextInt();
        show_data();
    }

    void show_data() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee gender: " + gender);
        System.out.println("Employee emp_code: " + emp_numb);
    }
    Employee(){
        input_data();
    }
}

  class SalariedEmployee extends Employee {

    double salary;
    double DA;
    double HRA;
    double gross_salary;
    SalariedEmployee(){
        super();
    }
    void allowance() {
       

        System.out.println("Enter your salary: ");
        salary = sc.nextDouble();

        DA = 0.5 * salary;
        if (gender.equals("female")) {
            HRA = 0.1 * salary;
            gross_salary = salary + DA + HRA;
        } else if(gender.equals("male")) {
            HRA = 0.09 * salary;
            gross_salary = salary + DA + HRA;
        }
        else{
            System.out.println("enter male/female:");
            
        }

        System.out.println("gross salary: " + gross_salary);

    }

    void increment() {
        salary = (salary) + (0.1 * salary);
        System.out.println("gross salary: " + gross_salary);

    }
    
}
