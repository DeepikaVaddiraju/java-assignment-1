package Service;

import Model.Employee;


import java.util.Collections;
import java.util.Comparator;
public abstract class Sorting {
    public static void sortByName(){
        Collections.sort(EmployeeServices.employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEmployeeName().compareTo(o2.getEmployeeName());
            }
        });
        for(int i=0; i<EmployeeServices.employees.size(); i++){
            System.out.println(EmployeeServices.employees.get(i).getEmployeeName()+", "+
                                EmployeeServices.employees.get(i).getEmployeeId()+", "+
                                 EmployeeServices.employees.get(i).getAge()+", "+
                                 EmployeeServices.employees.get(i).getSalary());
        }

    }
    public static void sortById() {
        Collections.sort(EmployeeServices.employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getEmployeeId() > o2.getEmployeeId())
                    return 1;
                else if (o1.getEmployeeId() < o2.getEmployeeId())
                    return -1;
                else
                    return 0;
            }
        });
        for (int i = 0; i < EmployeeServices.employees.size(); i++) {
            System.out.println(EmployeeServices.employees.get(i).getEmployeeName() + ", " +
                    EmployeeServices.employees.get(i).getEmployeeId() + ", " +
                    EmployeeServices.employees.get(i).getAge() + ", " +
                    EmployeeServices.employees.get(i).getSalary());
        }
    }
    public static void sortByAge(){
        Collections.sort(EmployeeServices.employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getAge()>o2.getAge())
                    return 1;
                else if(o1.getAge()< o2.getAge())
                    return -1;
                else
                    return 0;
            }
        });
        for(int i=0; i<EmployeeServices.employees.size(); i++) {
            System.out.println(EmployeeServices.employees.get(i).getEmployeeName() + ", " +
                    EmployeeServices.employees.get(i).getEmployeeId() + ", " +
                    EmployeeServices.employees.get(i).getAge() + ", " +
                    EmployeeServices.employees.get(i).getSalary());
        }

    }
    public static void sortBySalary(){
        Collections.sort(EmployeeServices.employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getSalary()>o2.getSalary())
                    return 1;
                else if(o1.getSalary()< o2.getSalary())
                    return -1;
                else
                    return 0;
            }
        });
        for(int i=0; i<EmployeeServices.employees.size(); i++) {
            System.out.println(EmployeeServices.employees.get(i).getEmployeeName() + ", " +
                    EmployeeServices.employees.get(i).getEmployeeId() + ", " +
                    EmployeeServices.employees.get(i).getAge() + ", " +
                    EmployeeServices.employees.get(i).getSalary());
        }

    }

    public static void sortByNameDescending(){
        Collections.sort(EmployeeServices.employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEmployeeName().compareTo(o2.getEmployeeName());
            }
        });
        for(int i=EmployeeServices.employees.size()-1; i>=0; i--){
            System.out.println(EmployeeServices.employees.get(i).getEmployeeName()+", "+
                    EmployeeServices.employees.get(i).getEmployeeId()+", "+
                    EmployeeServices.employees.get(i).getAge()+", "+
                    EmployeeServices.employees.get(i).getSalary());
        }

    }
    public static void sortByIdDescending() {
        Collections.sort(EmployeeServices.employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getEmployeeId() > o2.getEmployeeId())
                    return 1;
                else if (o1.getEmployeeId() < o2.getEmployeeId())
                    return -1;
                else
                    return 0;
            }
        });
        for(int i=EmployeeServices.employees.size()-1; i>=0; i--){
            System.out.println(EmployeeServices.employees.get(i).getEmployeeName() + ", " +
                    EmployeeServices.employees.get(i).getEmployeeId() + ", " +
                    EmployeeServices.employees.get(i).getAge() + ", " +
                    EmployeeServices.employees.get(i).getSalary());
        }
    }
    public static void sortByAgeDescending(){
        Collections.sort(EmployeeServices.employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getAge()>o2.getAge())
                    return 1;
                else if(o1.getAge()< o2.getAge())
                    return -1;
                else
                    return 0;
            }
        });
        for(int i=EmployeeServices.employees.size()-1; i>=0; i--){
            System.out.println(EmployeeServices.employees.get(i).getEmployeeName() + ", " +
                    EmployeeServices.employees.get(i).getEmployeeId() + ", " +
                    EmployeeServices.employees.get(i).getAge() + ", " +
                    EmployeeServices.employees.get(i).getSalary());
        }

    }
    public static void sortBySalaryDescending(){
        Collections.sort(EmployeeServices.employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getSalary()>o2.getSalary())
                    return 1;
                else if(o1.getSalary()< o2.getSalary())
                    return -1;
                else
                    return 0;
            }
        });
        for(int i=EmployeeServices.employees.size()-1; i>=0; i--){
            System.out.println(EmployeeServices.employees.get(i).getEmployeeName() + ", " +
                    EmployeeServices.employees.get(i).getEmployeeId() + ", " +
                    EmployeeServices.employees.get(i).getAge() + ", " +
                    EmployeeServices.employees.get(i).getSalary());
        }

    }
}
