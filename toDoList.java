import java.util.ArrayList;
import java.util.Scanner;

class toDoList {

    static ArrayList<String> taskList = new ArrayList<String>();
    String task;

    public static void main(String[] args) {
        System.out.println("Welcome To Your To-Do List!");
        Scanner scanner = new Scanner(System.in);
        int menuNum = 0;
        String newTask;
        int remTask;

        while (menuNum != 4) {
            System.out.println(
                    "1. Display To-Do List \n2. Add New Task To Do \n3. Remove Task From To-Do List\n4. Exit To-Do List ");
            menuNum = scanner.nextInt();

            switch (menuNum) {
                case 1:
                    if (taskList.size() != 0) {
                        System.out.println("=================================");
                        System.out.println("To-Do List:");
                        for (int i = 0; i < taskList.size(); i++) {
                            System.out.println((i + 1) + ". " + taskList.get(i));
                        }
                        System.out.println("=================================");
                    } else {
                        System.out.println("Your To-Do List is Empty!");
                    }
                    break;
                case 2:
                    System.out.print("Add Your New Task: ");
                    newTask = scanner.next();
                    addTask(newTask);
                    break;
                case 3:
                    System.out.print("Which Task Do You Want To Remove? ");
                    remTask = scanner.nextInt();
                    taskList.remove(remTask - 1);
                    System.out.println("Task number " + remTask + " has been removed successfully!");
                    break;

            }

        }
        System.out.println("Goodbye! See You Soon.");

    }

    public static void addTask(String task) {
        taskList.add(task);
        System.out.println("New Task Has Been Added Successfully!");

    }

}