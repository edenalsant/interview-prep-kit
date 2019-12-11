package Hashmaps;

import java.util.HashSet;

public class TwoStrings {

    static String twoStrings(String s1, String s2) {

        HashSet<String> bucket = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            bucket.add(Character.toString(s1.charAt(i)));
        }

        for (int i = 0; i < s2.length(); i++) {
            if (bucket.contains(Character.toString(s2.charAt(i)))) {
                return "YES";
            }

        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(twoStrings("hi", "world"));
    }
}