import java.util.HashMap;

public class Exercise10 {
    public static void main(String[] args) {

        final String[] LETTERS = {"B", "A", "B", "C", "A", "C", "D", "C", "C", "C", "D", "A", "C", "D", "E", "S","S", "R", "R", "S"};

        HashMap<String, Integer> map = new HashMap();
        
        for (int i = 0; i < LETTERS.length; i++) {
            String letter = LETTERS[i];
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
            } else {
                map.put(letter, 1);
            }
        }

        int higherNumber = 0;
        String key = "";
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > higherNumber) {
                higherNumber = entry.getValue();
                key = entry.getKey();
            }
        }
        System.out.println("The most frequent item is: " + key + " that appears " + map.get(key) + " times.");
    }
}