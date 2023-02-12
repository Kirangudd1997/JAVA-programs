/*Problem Statement
There are N trees in Terry's front yard. He is supposed to measures the height of each tree and find the average height of trees in his yard. What is the average height of a tree in Terry's front yard?

Note:- Print your answer as floor value (average height)
Input
The first line contains N: numbers of tree.
Then follows N lines represents the height of each tree.

Constraint:-
1 <= n <= 100000
1 <= a[i] <= 100000
Output
Print the average height of all the trees in the yard
Example
Input
5
6
8
34
9
3

Output
12

Explanation:-
Sum of heights =60
Average of heights =60/5
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		double sum=0,result;
		
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
			
		}
		result=sum/n;
		int k=(int)result;
		
		System.out.println(Math.round(k));
		
	}
}