package pl.edu.pja.tpo2.flashcardsapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
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

    }

    private void startTest() {
    }

    private void displayAllWords() {
    }

    private void addNewWord() {
        System.out.println("Enter word in Polish: ");
        String polish = scanner.nextLine();
        System.out.println("Enter word in English: ");
        String english = scanner.nextLine();
        System.out.println("Enter word in German: ");
        String german = scanner.nextLine();
        flashCardService.addWord();

    }
}
