import java.util.HashMap;
import java.util.Map;

public abstract class Utils {

    private static final Map<Character, String> map = new HashMap<>();

    static {

        map.put('A', "._");
        map.put('B', "_...");
        map.put('C', "_._.");
        map.put('D', "_..");
        map.put('E', ".");
        map.put('F', ".._.");
        map.put('G', "__.");
        map.put('H', "....");
        map.put('I', "..");
        map.put('J', ".___");
        map.put('K', "_._");
        map.put('L', "._..");
        map.put('M', "__");
        map.put('N', "_.");
        map.put('O', "___");
        map.put('P', ".__.");
        map.put('Q', "__._");
        map.put('R', "._.");
        map.put('S', "...");
        map.put('T', "_");
        map.put('U', ".._");
        map.put('V', "..._");
        map.put('W', ".__");
        map.put('X', "_.._");
        map.put('Y', "_.__");
        map.put('Z', "__..");

        map.put('0', "_____");
        map.put('1', ".____");
        map.put('2', "..___");
        map.put('3', "...__");
        map.put('4', "...._");
        map.put('5', ".....");
        map.put('6', "_....");
        map.put('7', "__...");
        map.put('8', "___..");
        map.put('9', "____.");

        map.put(' ', "");

    }


    public static final String[] convertText(String text) {

        String[] morse = new String[text.length()];

        char[] characters = text.toUpperCase().toCharArray(); 

        for (int i = 0 ; i < characters.length ; i++) {

            morse[i] = map.get(characters[i]);

        }

        return morse;

    }
    
}
