package pl.edu.pja.tpo2.flashcardsapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class FlashcardsController implements CommandLineRunner {

    private final Scanner scanner;

    public FlashcardsController(Scanner scanner) {
        this.scanner = scanner;
    }


    @Override
    public void run(String... args) throws Exception {
        startMenu();
    }

    private void startMenu() {
        while (true) {
            System.out.println();
            System.out.println("------ MENU ------");
            System.out.println("1. Add new word");
            System.out.println("2. Display all words");
            System.out.println("3. Start test");
            System.out.println("4. Quit");

            String usersChoice = scanner.nextLine();
        }
    }
}
