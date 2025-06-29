public class Task {
    int taskID;
    String taskName, status;

    public Task(int taskID, String taskName, String status) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.status = status;
    }

    public String getTaskDetails() {
        return "Task ID : " + this.taskID +
                "\n Task Name : " + this.taskName + 
                "\n Task Status : " + this.status + "\n";
    }
}
