import java.util.HashMap;

public class Largest {
    public static void main(String[] args) {
        String s = "Google Doc";
        int max1 = Integer.MIN_VALUE;
        int count = 0;
        String str = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && count != 0) {
                max1 = Math.max(max1, count);
                map.put(str, count);
                str = "";
                count = 0;
            } else if (s.charAt(i) != ' ') {
                str = str + s.charAt(i);
                count++;
            }
        }

        if (count != 0) {
            max1 = Math.max(max1, count);
            map.put(str, count);
        }

        for (String ele : map.keySet()) {
            if (map.get(ele) == max1) {
                System.out.println(ele);
            }
        }
    }
}