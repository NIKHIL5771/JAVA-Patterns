/*
Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*
*/

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("*"); 

        for (int i=1;i<= n;i++){
            System.out.print("*");
            int val=1;
        for (int j=0;j<i;j++) {
            System.out.print(val); val++;

        } val--;
        for (int j=1;j<i;j++) {
            --val;
            System.out.print(val);
        }
            System.out.println("*");

        }
        for (int i=0;i<n;i++) {
            System.out.print("*"); 
            int val=1;
        for (int j=0;j<(n-i-1);j++){
            System.out.print(val);
            val++;
        }
        val=val-2;
        for (int j = val;j>=1;j--){
             System.out.print(j);
        }
        if (i<n-1){
            System.out.println("*");
        }
        else
        {
            System.out.println(" ");
        }

     }
     if (n == 0)
     {
       System.out.println("*");
    }
        
    }
}
