import java.util.Objects;
import java.util.Scanner;

public class TaskOperations {
    Scanner input = new Scanner(System.in);
    Task[] tasks = new Task[5];
    int i = 0;
    int deletedTask;

    void showMenu() {
        if (i > 0) {
            System.out.println(" ");
            System.out.println("New task - 1");
            System.out.println("Delete task - 2");
            System.out.println("Exit - 0");
            System.out.println("________________________________");
        } else {
            System.out.println(" ");
            System.out.println("New task - 1");
            System.out.println("Exit - 0");
            System.out.println("________________________________");
        }
    }
    private Task newTask(){
        input.nextLine();
        System.out.println("Task name:");
        String name = input.nextLine();
        System.out.println("Task description:");
        String description = input.nextLine();
        System.out.println("Task time:");
        String time = input.nextLine();
        int id = i+1;
        return tasks[i] = new Task(name, description, time, id);
    }

    void choice(){
        int choice = input.nextInt();
        if ((choice != 0) &&(choice != 1) && (choice != 2)&&(choice!=3)){
            System.out.println("There is no such choice.");
        } else if (i==0 && choice==2) {
            System.out.println("There are no tasks to delete.");
        }
         else if (choice==0) {
            input.close();
            System.exit(0);
        } else if (choice==1) {
            newTask();
            i++;
        } else if (choice==2) {
            deleteTask();
        }}


    void showTasks(){
        if(i==0){
            System.out.println(" ");
            System.out.println("You have no tasks.");
            System.out.println("Press ENTER to continue.");
            input.nextLine();
            input.nextLine();
        }else{
        System.out.println(" ");
        System.out.println("Your tasks: ");
        for (int a = 0; a < i; a++) {
            System.out.println(" ");
            System.out.println("Task no " + tasks[a].getId());
            System.out.println("Task name: " + tasks[a].getName());
            System.out.println("Planned on: " + tasks[a].getTime());
            System.out.println("Description: " + tasks[a].getDescription());
            }
            System.out.println("Press ENTER to continue.");
            input.nextLine();
        }
    }
    private void deleteTask(){
        System.out.println("Which task would you like to delete?");
        deletedTask = input.nextInt()-1;
        if(deletedTask>i-1){
            System.out.println("There is no task with that number.");
            System.out.println("Press ENTER to continue.");
            input.nextLine();
            input.nextLine();
        }else{
        tasks[deletedTask].setName(null);
        tasks[deletedTask].setTime(null);
        tasks[deletedTask].setDescription(null);
        fixTable();
        i--;
        reassignId();
    }}
    private void fixTable(){
        int a = deletedTask;
        while (a < tasks.length-deletedTask-1){
            tasks[a]=tasks[a+1];
            a++;
        }
    }
    private void reassignId(){
        for (int b = 0; b < i; b++) {
            tasks[b].setId(b+1);
        }
    }
}
