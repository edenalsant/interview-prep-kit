package Hashmaps;

import java.util.HashMap;

public class RansomNote {

    static void checkMagazine(String[] magazine, String[] note) {

        HashMap<String, Integer> availableWords = new HashMap<>();
        int currentAmount = 0;

        for (int i = 0; i < magazine.length; i ++) {
            if (availableWords.containsKey(magazine[i])) {
                currentAmount = availableWords.get(magazine[i]);
                availableWords.put(magazine[i], currentAmount+1);
            } else {
                availableWords.put(magazine[i], 1);
            }
        }

        for (int i = 0; i < note.length; i++) {
            System.out.println(note[i]+": "+availableWords.get(note[i]));
            if (availableWords.containsKey(note[i]) && availableWords.get(note[i]) > 0) {
                availableWords.replace(note[i], availableWords.get(note[i])-1);
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {

        String magazine[] = {"o", "l", "x", "imjaw", "bee", "khmla", "v", "o", "v", "o", "imjaw", "l", "khmla", "imjaw", "x"};
        String note[] = {"imjaw" ,"l", "khmla", "x", "imjaw", "o", "l", "l", "o", "khmla", "v", "bee", "o", "o", "imjaw", "imjaw", "o"};

        checkMagazine(magazine,note);

    }
}
