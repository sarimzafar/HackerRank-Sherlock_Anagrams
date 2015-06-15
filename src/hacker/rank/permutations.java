package hacker.rank;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by sarim on 15-06-14.
 */
public class permutations {

    HashMap<String, String> hashMap = new HashMap<String, String>();


    int count = 0;

    public void permutation(String prefix, String str)
    {
        int n = str.length();
        if(n == 0)
            hashMap.put(prefix, prefix);

        else
        {
            for(int i = 0; i<n ; ++i)
            {
                permutation(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1));
            }
        }
    }

    public int findAnswer(String word, distinct dst)
    {
        int count = 0;
        permutation("", word);
        int size = hashMap.size();
        ArrayList<String> arrayList = new ArrayList<String>(hashMap.values());
        while (size > 0) {
            System.out.println(arrayList.get(size - 1));
            boolean ans = dst.checkifAnagram(arrayList.get(size - 1));
            if (ans) count++;
            size--;
        }
        return count;
    }

    public static int main(String word) {
        permutations pr = new permutations();
        distinct dst = new distinct();
        // pr.findAnswer("abba",dst);
        int value = pr.findAnswer(word, dst);
        return value;
    }

}
