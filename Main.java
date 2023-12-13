// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            MoodAnalyser mood = new MoodAnalyser("angry mood");
            mood.analyseMood();
        } catch (InvalidMoodException i) {
            System.out.println("This is a exception handled block from Main class.");
            System.out.println("Message from Main class: " + i.getMessage());
        }
    }
}