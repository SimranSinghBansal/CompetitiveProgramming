/**
 * Problem: Monk and SuffixSort
 * Type: Practice
 * Event: Code Monk
 * Link: https://www.hackerearth.com/problem/algorithm/monk-and-suffix-sort-ebacdaf5/
 * Solved on: 24/04/22 
 * Test Cases Passed: 24/10/22
 */
import java.util.*;
import java.util.Arrays.*;

class MonkandSuffixSort {
    public static void main(String args[] ) throws Exception {
        Scanner sc;
        int key;
        sc=new Scanner(System.in);
        String current;
        String suffix[];
        StringBuilder temp;
        current=sc.next();
        key=sc.nextInt()-1;
        suffix=new String[current.length()];
        temp=new StringBuilder();
        for(int idx=current.length()-1; idx>=0; idx--)
        {
            temp.insert(0,current.charAt(idx));
            suffix[idx]=temp.toString();
        }
        Arrays.sort(suffix, (a,b)->a.compareTo(b));
        System.out.println(suffix[key]);
        sc.close();
    }
}