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

        while (menuNum != 4) {
            System.out.println(
                    "1. Display To-Do List \n2. Add New Task To Do \n3. Remove Task From \n4. Exit To-Do List ");
            menuNum = scanner.nextInt();

            switch (menuNum) {
                case 1:
                    break;
                case 2:
                    System.out.print("Add Your New Task: ");
                    newTask = scanner.next();
                    addTask(newTask);
                    break;
                case 3:
                    break;

            }

        }

    }

    public static void addTask(String task) {
        taskList.add(task);
        System.out.println("New Task Has Been Added Successfully!");

    }

}