package hacker.rank;

/**
 * Created by sarim on 15-06-14.
 */
public class permutations {

    public static void permutation(String prefix, String str)
    {
        int n = str.length();
        if(n == 0)
            System.out.println(prefix);

        else
        {
            for(int i = 0; i<n ; ++i)
            {
                permutation(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1));
            }
        }
    }

    public static void main(String a[])
    {
        permutation("","ABCD");
    }
}
