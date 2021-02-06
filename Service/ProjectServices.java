package Service;
import java.util.*;
/* add project
list
add employees
remove employees
 delete project
 list employees in given project
 */
import Menu.Menu;
import Model.Employee;
import Model.Project;

public class ProjectServices {
    public static boolean wantToContinue=true;
    private static final Scanner scanner=new Scanner(System.in);
    public static ArrayList<Project> projects = new ArrayList<>();

    public static void createProject(){
        while(wantToContinue) {
            System.out.println("enter name: ");
            String projectName = scanner.next();
            System.out.println("enter starting date:");
            String startingDate = scanner.next();
            System.out.println("enter ending date: ");
            String endDate = scanner.next();
            Project project = new Project(projectName, startingDate, endDate);
            projects.add(project);

            System.out.println("Want to continue!!(true or false)");
            wantToContinue = scanner.nextBoolean();
        }
        Menu.mainMenu();
    }

    public static void deleteProject(int projectId){
        for(int i=0; i<= projects.size(); i++) {
            boolean isEmployeeFound = (projects.get(i).getProjectId() == projectId);
            if (isEmployeeFound) {
                projects.remove(i);
                System.out.println("Deleted successfully!!!");
                break;
            }
        }

        Menu.mainMenu();

    }
    public static void listProject(){
        for (Project proj : projects)
            System.out.println(proj);
        
        Menu.mainMenu();
    }
    public static void addEmployees(Project project, Employee employee){
         Map<Integer, Map<Integer, Project>> projectData=new HashMap<>();

        public static void save(Employee employee){
            projectData.put((project.getProjectId()
                    employee.getEmployeeId(),employee);
        }
        Menu.mainMenu();
    }
    public static void removeEmployees(){
        Menu.mainMenu();
    }
    public static void listEmployees(){
        Menu.mainMenu();
    }
}
