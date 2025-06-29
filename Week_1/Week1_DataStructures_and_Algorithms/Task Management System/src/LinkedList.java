public class LinkedList {

    Node head = null, dummy = head;
    int length = 0;
    class Node {
        Task data;
        Node next;

        Node(Task data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addTask(int taskID, String taskName, String status) {
        Task task = new Task(taskID, taskName, status);
        Node node = new Node(task);

        if(head == null) {
            head = node;
            dummy = head;
        } else {
            dummy.next = node;
            dummy = dummy.next;
        }
        length++;

    }

    public void deleteTask(int taskID) {
        Node temp = head, prev = null;

        while(temp != null) {
            if(temp.data.taskID == taskID) {
                // delete it
                if(prev == null) {
                    head = temp;
                } else {
                    prev.next = temp.next;
                }

                // If it is deleted then break out
                break;
            }

            // traverse the other nodes
            prev = temp;
            temp = temp.next;
            length--;
        }
    }

    public void findTask(int taskID) {
        Node temp = head;

        while(temp != null) {
            if(temp.data.taskID == taskID) {
                System.out.println("Task with task ID " + taskID + " is found.\n");
                break;
            }

            temp = temp.next;
        }

        System.out.println("Task with task ID " + taskID + " is not found.\n");
    }

    public void viewAllTasks() {
        Node temp = head;

        while(temp != null) {
            System.out.println(temp.data.getTaskDetails());
            temp = temp.next;
        }
    }
}