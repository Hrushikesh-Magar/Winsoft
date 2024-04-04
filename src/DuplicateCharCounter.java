import java.util.HashMap;

public class DuplicateCharCounter {
    public static void main(String[] args) {
        String str = "JavaJ2EE";
        countDuplicateCharacters(str);
    }

    public static void countDuplicateCharacters(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] strArray = str.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Char " + entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}