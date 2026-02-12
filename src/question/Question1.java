package question;

public class Question1 {

    static int getIntValue(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;   // (should be 1000, not 10000)
            default -> 0;
        };
    }


    public static void main() {
//        MCMXCIV
        int val = romanToInt("MCMXCIV");
        System.out.println(val);
    }

    public static int romanToInt(String s) {
        int sum = 0, i = 0;
        while (i != s.length()) {
//            read the first character
            char ch = s.charAt(i);
//            If only one character is present in value
            if (ch == 'I') {
                if (i + 1 < s.length()) {
                    char c = s.charAt(i + 1);
                    if (c == 'V' || c == 'X') {
                        int val = getIntValue(s.charAt(i + 1)) - getIntValue(s.charAt(i));
                        sum += val;
                        i += 2;
                        continue;
                    }
                }
            } else if (ch == 'X') {
                if (i + 1 < s.length()) {
                    char c = s.charAt(i + 1);
                    if (c == 'L' || c == 'C') {
                        int val = getIntValue(s.charAt(i + 1)) - getIntValue(s.charAt(i));
                        sum += val;
                        i += 2;
                        continue;
                    }
                }
            } else if (ch == 'C') {
                if (i + 1 < s.length()) {
                    char c = s.charAt(i + 1);
                    if (c == 'D' || c == 'M') {
                        int val = getIntValue(s.charAt(i + 1)) - getIntValue(s.charAt(i));
                        sum += val;
                        i += 2;
                        continue;
                    }
                }
            }
            sum += getIntValue(s.charAt(i));
            i++;
        }
        return sum;
    }
}