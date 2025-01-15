package org.csu.cpsc;

public class TaskManager implements TaskManagerInterface {

    private Task[] tasks; 
    private int taskCount; 

    public TaskManager() {
        tasks = new Task[10]; 
        taskCount = 0;        
    }

    @Override
    public boolean addTask(Task task) {
        if (taskCount < tasks.length) { 
            tasks[taskCount] = task;    
            taskCount++;                
            return true;                
        }
        return false;                   
    }

   @Override
    public Task removeTask(int index) {
        if (index >= 0 && index < taskCount) { 
            Task removedTask = tasks[index]; 
            
            for (int i = index; i < taskCount - 1; i++) {
                tasks[i] = tasks[i + 1];
            }
            tasks[taskCount - 1] = null; 
            taskCount--;                 
            return removedTask;          
        }
        return null; 
    }

    @Override
    public String printTaskList() {
        String taskList = "Task List:\n";
        for (int i = 0; i < taskCount; i++) {
            taskList += (i + 1) + ". " + tasks[i].getName() + "\n";
        }
        return taskList; 
    }

    @Override
    public String printTaskListDetailed() {
        String taskDetails = "Detailed Task List:\n";
        for (int i = 0; i < taskCount; i++) {
            Task task = tasks[i];
            taskDetails += (i + 1) + ". " + task.getName() + " - " + task.getTimeLogged() + " mins - " + task.getDescription() + "\n";
        }
        return taskDetails; 
    }

    @Override
    public boolean updateTaskTimeLogged(int index, int time) {
        if (index >= 0 && index < taskCount) { 
            tasks[index].setTimeLogged(time); 
            return true; 
        }
        return false; 
    }
}
