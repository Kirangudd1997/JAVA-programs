/*Problem Statement
Given an array A of size N (N is always even), you need to find exactly (N/2) numbers where each number represents the pair-wise product of consecutive elements of the array A.

In simple terms print (A[1]*A[2]), (A[3]*A[4]), ..., (A[N-1]*A[N]).


(Use long long int to avoid overflow)
Input
For each test case, the first line of the input contains an integer N (even number) denoting the number of elements in the array. The next line contains N (white-space separated) integers.

Constraints
1 <= N <= 10^2
1 <= A[i] <= 1000000000
Output
For each test case, output N/2 elements representing the pairwise product of adjacent elements in the array.
Example
Input-1
10
2 1 4 1 6 2 2 6 4 1

Output-1
2 4 12 12 4
*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		int n;
		//long prod=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i=i+2)
		{
			
			System.out.print(a[i]*a[i+1]+" ");
		}
                      // Your code here
	}
}
