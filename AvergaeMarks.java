Problem Statement
Given the marks of N students, your task is to calculate the average of the marks obtained.
Input
/*First line of input contains a single integer N. The next line contains N space separated integers containing the marks of the students.

Constraints:-
1 <= N <= 1000
1 <= marks <= 1000
Output
Print the floor of the average of marks obtained.
Example
Sample Input:-
4
1 2 3 4

Sample Output:-
2

Sample Input:-
3
5 5 5

Sample Output:-
5 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        int add=0,a;
        Scanner n=new Scanner(System.in);
        a=n.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=n.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            add=add+b[i];
            
        }
        System.out.print(add/a);

                      // Your code here
	}
    
}