public class TaskManagement {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();

        // Add tasks to the list
        linkedlist.addTask(101, "Design UI", "Pending");
        linkedlist.addTask(102, "Develop Backend", "In Progress");
        linkedlist.addTask(103, "Write Tests", "Pending");
        linkedlist.addTask(104, "Deploy App", "Not Started");
        linkedlist.addTask(105, "Review Code", "Completed");

        // View all the tasks
        linkedlist.viewAllTasks();

        // delete task 104
        linkedlist.deleteTask(104);

        // view all tasks after deletion
        System.out.println("Tasks after deletion.\n");
        linkedlist.viewAllTasks();

        // search for task 101
        linkedlist.findTask(101);
    } 
}
