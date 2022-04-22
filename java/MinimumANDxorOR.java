/**
 * Problem: Minimum AND xor OR
 * Type: Practice
 * Event: Code Monk
 * Link: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/minimum-and-xor-or-6a05bbd4/
 * Solved on: 22/04/22 
 * Test Cases Passed: 10/10
 */
import java.util.*;
class MinimumANDxorOR {
    public static void main(String args[] ) throws Exception {
        int arr[],min,size,temp,tests;
        Scanner in;
        in=new Scanner(System.in);
        tests=in.nextInt();
        for(int test=0; test<tests; test++)
        {
            size=in.nextInt();
            arr=new int[size];
            for(int idx=0; idx<size; idx++)
            {
                arr[idx]=in.nextInt();
            }
            Arrays.sort(arr);
            min=arr[0]^arr[1];
            for(int i=1; i<size-1; i++)
            {
                temp=arr[i]^arr[i+1];
                if(temp<min)
                {
                    min=temp;
                }
            }
            System.out.println(min);
        }
        in.close();
    }
}
