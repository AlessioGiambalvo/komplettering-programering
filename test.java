import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void testgetChoice() {
        //arrange

        choice test = new choice();

        //act

        int actual = test.getChoice();


        //assert

        int expected = 0;

        assertEquals(expected, actual);
    }

    private static class choice {
        public int getChoice() {
            return 0;
        }
    }

    @Test
    public void testMorseToEnglish1() {

        MorseMain morse = new MorseMain();

        String input = "...--";

        String output = morse.MorseToEnglish(input);

        assertEquals(output, "3");
    }

    @Test
    public void testMorseToEnglish2() {

        MorseMain morse = new MorseMain();

        String input = "...-- -...";

        String output = morse.MorseToEnglish(input);

        assertEquals(output, "3b");
    }

    @Test
    public void testEnglishToMorse() {

        MorseMain morse = new MorseMain();

        String input = "3b";

        String output = morse.englishToMorse(input);

        assertEquals(output, "...-- -...");
    }
}



