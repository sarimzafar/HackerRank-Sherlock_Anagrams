package hacker.rank;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by shassanzafar on 6/12/2015.
 */
public class Solution {

    Hashtable<Character, Integer> source = new Hashtable<Character, Integer>();


    public int factorial(int n) {
        return n > 2 ? n * factorial(n - 1) : 1;
    }

    public int permutation(int a, int b) {
        return factorial(a) / factorial(a - b);
    }

    public boolean checkifPalindrome(String value) {
        String newValue = "";
        for (int i = 0; i < value.length(); i++) {
            newValue = value.charAt(i) + newValue;
        }
        if (value.equalsIgnoreCase(newValue))
            return true;

        return false;
    }

    public int frequency(String s, char v) {
        if (s.length() == 0)
            return 0;
        else if (s.charAt(0) == v)
            return 1 + frequency(s.substring(1, s.length()), v);

        return frequency(s.substring(1, s.length()), v);
    }

    public void findFrequency(String temp) {
        for (int i = 0; i < temp.length(); i++) {
            if (!source.containsKey(temp.charAt(i)))
                source.put(temp.charAt(i), frequency(temp, temp.charAt(i)));
        }
    }

    public void mainSoln(String temp)
    {

    }

    public static void main(String[] a) throws StringIndexOutOfBoundsException {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for (int i = 0; i < n; i++) {
            String temp = obj.next();
        }
    }
}
