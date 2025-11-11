enum TaskStatus {
    NEW, IN_PROGRESS, COMPLETED
}

 class Task {
    private String description;
    private TaskStatus status = TaskStatus.NEW;
    
    public Task(String d) {
        description = d;
    }

    public void setDescription(String s) {
        this.description = s;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setStatus(TaskStatus s) {
        this.status = s;
    }
    
    public TaskStatus getStatus() {
        return this.status;
    }
}
public class TodoList {
    private Task[] tasks;
    private int capacity;
    private int c;

    public TodoList(int capacity) {
        this.tasks = new Task[capacity];
        this.capacity =capacity;
        this.c=0;
    }

    public void addTask(String description){
        if (tasks.length > c){
            tasks[c] = new Task(description);
            this.c++;
        }
    }

    public void setStatus(int index, TaskStatus status){          //[todo1,todo2,todo3,todo4,todo5]  todo[i]{status,description}
    
        if (index <= c) {
            tasks[index].setStatus(status);
        }



    }

    public void setDescription(int index, String newDescription){
             if (index <= c) {
            tasks[index].setDescription(newDescription);
        }
    }

    public void displayTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.length;i++){
            if (tasks[i] != null){
            System.out.println(String.format("%-34s| %s",tasks[i].getDescription(),tasks[i].getStatus()));
            }
   // for (int i=0; i<c; i++) System.out.println(String.format("%-34s| %s", tasks[i].getDescription(), tasks[i].getStatus()));
        }
    }
}

// expected: 
//   "Tasks:
//   Go grocery shopping               | COMPLETED
//   Pay all utility bills             | NEW
//   "
//  but was: 
//   "tasks:
//   Go grocery shopping               | COMPLETED
//   Pay all utility bills             | NEW
//   "
// org.opentest4j.AssertionFailedError: 
// expected: 
//   "Tasks:
//   Go grocery shopping               | COMPLETED
//   Pay all utility bills             | NEW
//   "
//  but was: 
//   "tasks:
//   Go grocery shopping               | COMPLETED
//   Pay all utility bills             | NEW
//   "