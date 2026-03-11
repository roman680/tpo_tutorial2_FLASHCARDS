package pl.edu.pja.tpo2.flashcardsapp;

public class Entry {
    private String polish;
    private String english;
    private String german;

    public Entry() {
    }

    public String getPolish() {
        return polish;
    }

    public void setPolish(String polish) {
        this.polish = polish;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getGerman() {
        return german;
    }

    public void setGerman(String german) {
        this.german = german;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "polish='" + polish + '\'' +
                ", english='" + english + '\'' +
                ", german='" + german + '\'' +
                '}';
    }
}
