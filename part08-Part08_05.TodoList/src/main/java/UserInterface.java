/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hamzah Raihan
 */
import java.util.*;

public class UserInterface {

    private TodoList task;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.task = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.println("To add:");
                String todo = scanner.nextLine();
                this.task.add(todo);
            }

            if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int removeTask = scanner.nextInt();
                this.task.remove(removeTask);
            }

            if (command.equals("list")) {
                this.task.print();
            }
        }
    }
}
