package hacker.rank;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by shassanzafar on 6/12/2015.
 */
public class Solution {


    public static void main(String[] a) throws StringIndexOutOfBoundsException {
        Scanner obj = new Scanner(System.in);

        permutations prm = new permutations();
        distinct dst = new distinct();
        Solution sln = new Solution();

        int c = obj.nextInt();

        while (c > 0) {
            String s = obj.next();
            System.out.println(prm.main(s));
            c--;
        }


    }
}
