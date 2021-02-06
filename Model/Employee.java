package Model;

public class Employee {

    private  String employeeName;
    private  int employeeId;
    private  byte age;
    private  int salary;



    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public byte getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Model.Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    static int i=1;
    public Employee(String employeeName, byte age, int salary) {
        this.employeeName = employeeName;
        this.age = age;
        this.salary = salary;
        this.employeeId=i++;
    }
    public void update(String employeeName, int salary, byte age){
        this.employeeName = employeeName;
        this.salary=salary;
        this.age=age;

    }

}
