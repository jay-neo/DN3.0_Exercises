package taskmanagement;

public class Testing {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        Task task1 = new Task("T001", "Design UI", "In Progress");
        Task task2 = new Task("T002", "Develop Backend", "Not Started");
        Task task3 = new Task("T003", "Testing", "Completed");

        // Add Tasks
        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);

        // Traverse Tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Search Task
        System.out.println("\nSearch Task with ID T002:");
        Task foundTask = taskList.searchTask("T002");
        if (foundTask != null) {
            System.out.println(foundTask);
        } else {
            System.out.println("Task not found.");
        }

        // Delete Task
        System.out.println("\nDelete Task with ID T003:");
        boolean isDeleted = taskList.deleteTask("T003");
        if (isDeleted) {
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Task not found.");
        }

        // Traverse Tasks After Deletion
        System.out.println("\nAll Tasks After Deletion:");
        taskList.traverseTasks();
    }
}
