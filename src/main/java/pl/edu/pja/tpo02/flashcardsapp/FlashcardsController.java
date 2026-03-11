package pl.edu.pja.tpo02.flashcardsapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class FlashcardsController implements CommandLineRunner {
    Scanner scanner = new Scanner(System.in);
    private final FlashCardService flashCardService;

    public FlashcardsController(FlashCardService flashCardService) {
        this.flashCardService = flashCardService;
    }


    @Override
    public void run(String... args) throws Exception {
        startMenu();
    }

    private void startMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean menuStatus = true;
        while (menuStatus) {
            System.out.println();
            System.out.println("------ MENU ------");
            System.out.println("1. Add new word");
            System.out.println("2. Display all words");
            System.out.println("3. Start test");
            System.out.println("4. Quit");
            System.out.println("------------------");
            System.out.println();
            System.out.println("Choose your option: ");

            String usersChoice = scanner.nextLine();

            switch (usersChoice) {
                case "1":
                    addNewWord();
                case "2":
                    displayAllWords();
                case "3":
                    startTest();
                case "4":
                    System.out.println("Bye");
                    menuStatus = false;
                    break;
                default:
                    System.out.println("Invalid input, try again");
            }
        }
    }

    private void startTest() {
    }

    private void displayAllWords() {
        flashCardService.displayAll();
    }

    private void addNewWord() {
        System.out.println("Enter word in Polish: ");
        String polish = scanner.nextLine();
        System.out.println("Enter word in English: ");
        String english = scanner.nextLine();
        System.out.println("Enter word in German: ");
        String german = scanner.nextLine();
        flashCardService.addWord(polish, english, german);
        System.out.println("Word successfully added");
    }
}
