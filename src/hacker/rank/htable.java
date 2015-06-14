package hacker.rank;

import com.sun.xml.internal.ws.handler.HandlerException;

import java.util.Hashtable;

/**
 * Created by sarim on 15-06-13.
 */
public class htable {

    public static void main(String a[])throws HandlerException
    {
        Hashtable<Character,Integer> hashtable = new Hashtable<Character,Integer>();

        hashtable.put('a',4);
        hashtable.put('b',5);
        hashtable.put('a',6);

        System.out.println(hashtable.get('a'));

    }

}
