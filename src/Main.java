import java.util.HashMap;
import java.util.Map;

public class Main {
    protected static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        char[] simbols = text.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : simbols) {
            if (Character.isLetter(ch)) {
                char letter = ch;
                Integer repeat = map.get(letter);
                if (repeat == null) {
                    map.put(letter, 1);
                } else {
                    map.put(letter, ++repeat);
                }
            }
        }
        int max = -1;
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            int r = kv.getValue();
            if (max <= r) {
                max = r;
            }
            if (min >= r) {
                min = r;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
