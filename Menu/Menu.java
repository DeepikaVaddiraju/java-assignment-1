package Menu;


import Service.EmployeeServices;
import Service.ProjectServices;
import Service.Sorting;

import java.util.Scanner;

public class Menu {
   public static Scanner scanner = new Scanner(System.in);

    public static void mainMenu() {

        System.out.println("Select the option!");
        System.out.println("1. Employee");
        System.out.println("2. Project");
        System.out.println("3. Exit");
        int menuChoice = scanner.nextInt();
        switch (menuChoice) {
            case 1:
                employeeMenu();
                break;
            case 2:
                projectMenu();
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
    public static void employeeMenu() {
        System.out.println("1. Create Employees");
        System.out.println("2. Update Employees");
        System.out.println("3. Delete Employees");
        System.out.println("4. Display Employees");
        System.out.println("5. Sorting of employees");
        int employeeMenuChoice = scanner.nextInt();
        switch (employeeMenuChoice){
            case 1:
                EmployeeServices.createEmployee();
                break;
            case 2:
                System.out.println("Enter the Id of the employee that need to be updated!");
                EmployeeServices.updateEmployee(scanner.nextInt());
                break;
            case 3:
                System.out.println("Enter the Id of the employee that need to be removed!");
                EmployeeServices.deleteEmployee(scanner.nextInt());
                break;
            case 4:
                EmployeeServices.listEmployee();
                break;
            case 5:
                listMenu();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
    public static void listMenu(){
        System.out.println("1. Sort by name ");
        System.out.println("2. Sort by Id");
        System.out.println("3. Sort by age");
        System.out.println("4. Sort by salary");
        int listMenuChoice = scanner.nextInt();
        switch(listMenuChoice){
            case 1:
                System.out.println("1. Ascending Order");
                System.out.println("2. Descending Order");
                int ascDsc = scanner.nextInt();
                switch (ascDsc){
                    case 1:
                        Sorting.sortByName();
                        break;
                    case 2:
                        Sorting.sortByNameDescending();
                        break;
                }
                break;
            case 2:
                System.out.println("1. Ascending Order");
                System.out.println("2. Descending Order");
                int ad = scanner.nextInt();
                switch (ad){
                    case 1:
                        Sorting.sortById();
                        break;
                    case 2:
                        Sorting.sortByIdDescending();
                        break;
                }
                break;
            case 3:
                System.out.println("1. Ascending Order");
                System.out.println("2. Descending Order");
                int aD = scanner.nextInt();
                switch (aD){
                    case 1:
                        Sorting.sortByAge();
                        break;
                    case 2:
                        Sorting.sortByAgeDescending();
                        break;
                }
                break;
            case 4:
                System.out.println("1. Ascending Order");
                System.out.println("2. Descending Order");
                int asDs = scanner.nextInt();
                switch (asDs){
                    case 1:
                        Sorting.sortBySalary();
                        break;
                    case 2:
                        Sorting.sortBySalaryDescending();
                        break;
                }
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
         mainMenu();
    }
/* add project
list
add employees
remove employees
 delete project
 list employees in given project
 */

    public static void projectMenu(){
        System.out.println("1. Create Project");
        System.out.println("2. List Project");
        System.out.println("3. Add employees to the  Project");
        System.out.println("4.Remove employees from the  Project");
        System.out.println("5. Delete project");
        System.out.println("6. List employees in given project");
        int projectMenuChoice = scanner.nextInt();
        switch (projectMenuChoice){
            case 1:
                ProjectServices.createProject();
                break;
            case 2:
                 ProjectServices.listProject();
                break;
            case 3:
                ProjectServices.addEmployees();
                break;
            case 4:
                ProjectServices.removeEmployees();
            case 5:
                ProjectServices.deleteProject(scanner.nextInt());
                break;
            case 6:
                ProjectServices.listEmployees();
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
