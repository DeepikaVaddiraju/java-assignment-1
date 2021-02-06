package Service;

import Menu.Menu;
import Model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServices {
    /*
    * creating
    * updating
    * delete
    * listing
    */ private static final Scanner scanner=new Scanner(System.in);
    public static ArrayList<Employee> employees = new ArrayList<>();
    public static boolean wantToContinue=true;
    public static void createEmployee(){

        while(wantToContinue) {
            System.out.println("enter name: ");
            String employeeName = scanner.next();
            System.out.println("enter age:");
            byte age = scanner.nextByte();
            System.out.println("enter salary: ");
            int salary = scanner.nextInt();
            Employee employee = new Employee(employeeName, age, salary);
            employees.add(employee);

            System.out.println("Want to continue!!(true or false)");
            wantToContinue = scanner.nextBoolean();
        }
        Menu.mainMenu();
    }
    public static void updateEmployee(int employeeId){
        for(int i=0; i<= employees.size(); i++){
          boolean  isEmployeeFound = (employees.get(i).getEmployeeId() == employeeId);
            if(isEmployeeFound){
                System.out.println("enter name: ");
                String employeeName = scanner.next();
                System.out.println("enter age:");
                byte age = scanner.nextByte();
                System.out.println("enter salary: ");
                int salary = scanner.nextInt();
                employees.get(i).update(employeeName, salary, age);
                System.out.println("Updated successfully!!!");
                 break;
            }
        }

        Menu.mainMenu();
    }
    public static void deleteEmployee(int employeeId){
        for(int i=0; i<= employees.size(); i++) {
            boolean isEmployeeFound = (employees.get(i).getEmployeeId() == employeeId);
            if (isEmployeeFound) {
                employees.remove(i);
                System.out.println("Deleted successfully!!!");
                break;
            }
        }
        Menu.mainMenu();
    }
    public static void listEmployee(){
        for (Employee emp : employees)
            System.out.println(emp);
        Menu.mainMenu();

    }

}
