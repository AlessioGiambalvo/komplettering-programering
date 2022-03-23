import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        MorseMain mm = new MorseMain();
        run(mm);
    }
    
    public static void run(MorseMain morse) {

        menu();
        int choice = getChoice();
        try {
            if (choice == 1) {
                System.out.println("Skriv en Engelsk mening: ");
                String engStr = getScanner().nextLine();
                String result = morse.englishToMorse(engStr);
                System.out.println("Engelsk: " + engStr + " Morse code: " + result);
            } else if (choice == 2) {
                System.out.println("skriv morse code, separerat med:");
                String Schoice = "";
                try {
                    Schoice = getScanner().nextLine();
                } catch (Exception d) {
                    System.out.println("Morsecode endast, starta om");
                    System.exit(0);
                }
                String result = morse.MorseToEnglish(Schoice);
                System.out.println("morse  " + Schoice + " eng : " + result);
            } else {
                System.out.println("Fel: välj 1 elr 2. Starta om programet\n");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    public static int getChoice() {
        int choice = 0;
        try {
            choice = getScanner().nextInt();
        } catch (Exception e) {
            System.out.println("Error");
        }
        return choice;
    }

    public static void menu() {
        System.out.println("Morse code Translator\n");
        System.out.println("----------------------\n");
        System.out.println("1.English to Morse\n");
        System.out.println("2. Morse to English\n");
    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
