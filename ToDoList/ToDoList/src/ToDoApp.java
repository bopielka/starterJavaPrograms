public class ToDoApp {
    public static void main(String[] args) {
        TaskOperations task = new TaskOperations();


        while (task.i<task.tasks.length) {
            task.showMenu();
            task.choice();
            task.showTasks();
        }
        task.input.close();
    }
}