package ua.ithillel.lesson3;

public class StringMethods {
    public static int findSymbolOccurance(String source, char target) {
        int count = 0;
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }
    public static String stringReverse(String source) {
        char[] charArray = source.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - i - 1];
            charArray[length - i - 1] = temp;
        }
        return String.copyValueOf(charArray);
    }
    public static boolean isPalindrome(String source) {
        int length = source.length();
        for (int i = 0; i < length / 2; i++) {
            if (source.charAt(i) != source.charAt(length - i - 1))
                return false;
        }
        return true;
    }
}