package converter;

import java.util.HashMap;
import java.util.Map;

public class RomanCharConverter {

    private Map<String, Integer> table = new HashMap<String, Integer>();

    public RomanCharConverter() {
        table.put("I", 1);
        table.put("V", 5);
        table.put("X", 10);
        table.put("L", 50);
        table.put("C", 100);
        table.put("D", 500);
        table.put("M", 1000);
        table.put("A", 5000);
    }

    public int convert(String romanCharString) {

        int result = 0;

        for (int i = 0; i < romanCharString.length(); i++) {

            int currentNumber = table.get(String.valueOf(romanCharString.charAt(i)));

            if (hasNextChar(romanCharString, i)) {

               int nextNumber = table.get(String.valueOf(romanCharString.charAt(i+1)));

               if (currentNumber < nextNumber) {
                   result += (nextNumber - currentNumber);
                   i++;
               } else {
                   result += currentNumber;
               }

            } else {
                result += currentNumber;
            }
        }

        return result;
    }

    public boolean hasNextChar(String romanCharString, int index) {
        if (index+1 < romanCharString.length()) {
            return true;
        } else {
            return false;
        }
    }
}
