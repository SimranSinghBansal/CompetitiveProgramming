/**
 * Problem: Monk and Rotations
 * Type: Practice
 * Event: Code Monk
 * Link: https://www.hackerearth.com/problem/algorithm/monk-and-rotation-3-bcf1aefe/
 * Solved on: 22/04/22 
 * Test Cases Passed: 10/10
 */
import java.util.*;
class MonkAndRotations {
    public static void rotate(int [] arr, int shifts,int size)
    {
        int cutpoint;
        StringBuilder builder;
        cutpoint=(size-shifts)%size;
        if(cutpoint<0)
            cutpoint+=size;
        builder=new StringBuilder();
        for(int idx=cutpoint; idx<size; idx++)
        {
            builder.append(arr[idx]+" ");
        }
        for(int idx=0; idx<cutpoint; idx++)
        {
            builder.append(arr[idx]+" ");
        }
        System.out.println(builder);
    }

    public static void main(String args[])
    {
        int arr[],shifts,size,tests;
        Scanner sc;
        sc=new Scanner(System.in);
        tests=sc.nextInt();
        for(int test=0; test<tests; test++)
        {
            size=sc.nextInt();
            shifts=sc.nextInt();
            arr=new int[size];
            for(int idx=0; idx<size; idx++)
            {
                arr[idx]=sc.nextInt();
            }
            rotate(arr,shifts,size);
        }
        sc.close();
    }
}
