import java.util.HashMap;

public class MorseMain {

    final HashMap<String, Character> morseToEng = new HashMap<>();
    final HashMap<Character, String> engToMorse = new HashMap<>();

    public MorseMain() {
        engToMorse.put('a', ".-");
        engToMorse.put('b', "-...");
        engToMorse.put('c', "-.-.");
        engToMorse.put('d', "-..");
        engToMorse.put('e', ".");
        engToMorse.put('f', "..-.");
        engToMorse.put('g', "--.");
        engToMorse.put('h', "....");
        engToMorse.put('i', "..");
        engToMorse.put('j', ".---");
        engToMorse.put('k', "-.-");
        engToMorse.put('l', ".-..");
        engToMorse.put('m', "--");
        engToMorse.put('n', "-.");
        engToMorse.put('o', "---");
        engToMorse.put('p', ".--.");
        engToMorse.put('q', "--.-");
        engToMorse.put('r', ".-.");
        engToMorse.put('s', "...");
        engToMorse.put('t', "-");
        engToMorse.put('u', "..-");
        engToMorse.put('v', "...-");
        engToMorse.put('w', ".--");
        engToMorse.put('x', "-..-");
        engToMorse.put('y', "-.--");
        engToMorse.put('z', "--..");
        engToMorse.put('1', ".----");
        engToMorse.put('2', "..---");
        engToMorse.put('3', "...--");
        engToMorse.put('4', "....-");
        engToMorse.put('5', ".....");
        engToMorse.put('6', "-....");
        engToMorse.put('7', "--...");
        engToMorse.put('8', "---..");
        engToMorse.put('9', "----.");
        engToMorse.put('0', "-----");
        engToMorse.put('.', ".-.-.-");
        engToMorse.put(',', "--..--");
        engToMorse.put('?', "..--..");
        engToMorse.put(' ', " ");

        engToMorse.forEach((key, value) -> morseToEng.put(value, key));
    }

    public String englishToMorse(String s) {
        if (s.isEmpty()) return "";

        char[] arr = s.toLowerCase().toCharArray();
        StringBuilder result = new StringBuilder();

        result.append(getEngToMorse(arr[0]));
        for (int i = 1; i < arr.length; i++) {
            String morsekod = getEngToMorse(arr[i]);
            result.append(" ");
            result.append(morsekod);
        }

        return result.toString();
    }

    public String MorseToEnglish(String s) {

        StringBuilder result = new StringBuilder();
        String[] arr = s.split(" ");
        for (String m : arr) {
            result.append(getMorseToEng(m));
        }

        return result.toString();
    }

    private String getMorseToEng(String m) {
        if (!morseToEng.containsKey(m)) {
            throw new IllegalArgumentException(" ogiltig bokstav");
        }
        return morseToEng.get(m) + "";
    }

    private String getEngToMorse(char m) {
        if (!engToMorse.containsKey(m)) {
            throw new IllegalArgumentException("ogiltig bokstav");
        }
        return engToMorse.get(m);
    }
}
