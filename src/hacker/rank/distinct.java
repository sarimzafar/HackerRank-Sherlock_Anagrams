package hacker.rank;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by shassanzafar on 6/15/2015.
 */
public class distinct {
    boolean arr[] = new boolean[26];

    public boolean check(String word) {
        Arrays.fill(arr, false);
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int len = (int) (c) - 97;
            //System.out.println(len);
            if (!arr[len])
                arr[len] = true;
            else
                return false;
        }
        return true;
    }

    public boolean checkifAnagram(String word) {
        String temp = "";
        for (int i = 0; i < word.length(); i++)
            temp = word.charAt(i) + temp;
        if (temp.equals(word))
            return true;
        return false;

    }
}
