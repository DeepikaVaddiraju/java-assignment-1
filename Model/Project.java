package Model;

import java.util.Date;

public class Project {
    private final String projectName;
    private final String startingDate;
    private final String endDate;
    private int projectId;

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", startingDate=" + startingDate +
                ", endDate=" + endDate +
                ", projectId=" + projectId +
                '}';
    }
    static int i=1;
    public Project(String projectName, String startingDate, String endDate) {
        this.projectName = projectName;
        this.startingDate = startingDate;
        this.endDate = endDate;
        this.projectId = i++;
    }

    public int getProjectId() {
        return projectId;
    }
}
