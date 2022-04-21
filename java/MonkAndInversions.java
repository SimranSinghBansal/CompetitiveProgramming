/**
 * Problem: Monk and Inversions
 * Type: Practice
 * Event: Code Monk
 * Link: https://www.hackerearth.com/problem/algorithm/monk-and-inversions-arrays-strings-e5aaa427/
 * Solved on: 22/04/22 
 * Test Cases Passed: 10/10
 */
import java.util.*;
class MonkAndInversions {
    public static int checkInversion(int matrix[][])
    {
        int count=0;
 
        for(int i=0;i<matrix.length; i++)
        {
            for(int j=0;j<matrix.length; j++)
            {
                for(int p=0;p<matrix.length; p++)
                {
                    for(int q=0; q<matrix.length; q++)
                    {
                        if(
                            (matrix[i][j]>matrix[p][q])
                                &&
                            (i<=p)
                                &&
                            (j<=q)
                        )
                        {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    public static void main(String args[] ) throws Exception {
        int matrix[][], size, tests;
        Scanner sc;
        sc=new Scanner(System.in);
        tests=sc.nextInt();
        for(int test=0; test<tests; test++)
        {
            size=sc.nextInt();
            matrix=new int[size][size];
            for(int row=0; row<size; row++)
            {
                for(int col=0; col<size; col++)
                {
                    matrix[row][col]=sc.nextInt();
                }
            }
            System.out.println(checkInversion(matrix));
        }
        sc.close();
    }
}