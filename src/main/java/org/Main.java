package org.csu.cpsc;

public class Main {
    public static void main(String[] args) {
        Task t1 = new Task("Dishes", 30, "Wash the dishes");
        Task t2 = new Task("Prep for class", 90, "Prep for Data Structures");

        System.out.println("Task 1 Details:");
        System.out.println(t1.toString());
        System.out.println("\nTask 2 Details:");
        System.out.println(t2.toString());

        t1.setName("Clean Dishes");
        t1.setDescription("Wash and dry the dishes thoroughly");
        t1.setOriginalDuration(45);
        t1.setTimeLogged(15);

        System.out.println("\nUpdated Task 1 Details:");
        System.out.println("Name: " + t1.getName());
        System.out.println("Description: " + t1.getDescription());
        System.out.println("Original Duration: " + t1.getOriginalDuration());
        System.out.println("Time Logged: " + t1.getTimeLogged());

        TaskManager manager = new TaskManager();

        System.out.println("\nAdding Tasks to TaskManager:");
        System.out.println("Add Task 1: " + manager.addTask(t1));
        System.out.println("Add Task 2: " + manager.addTask(t2));
        
        for (int i = 3; i <= 6; i++) {
            boolean added = manager.addTask(new Task("Task " + i, i * 30, "Description for Task " + i));
            System.out.println("Add Task " + i + ": " + added);
        }

        System.out.println("\nTask List:");
        System.out.println(manager.printTaskList());

        System.out.println("\nRemoving Task at Index 2:");
        Task removedTask = manager.removeTask(2);
        if (removedTask != null) {
            System.out.println("Removed Task: " + removedTask.toString());
        } else {
            System.out.println("No Task found at index 2.");
        }

        System.out.println("\nTask List After Removal:");
        System.out.println(manager.printTaskList());

        System.out.println("\nUpdating Time Logged for Task at Index 1:");
        boolean updated = manager.updateTaskTimeLogged(1, 30);
        System.out.println("Time Logged Update Success: " + updated);

        System.out.println("\nDetailed Task List:");
        System.out.println(manager.printTaskListDetailed());
    }
}
