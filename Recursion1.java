/*
Problem Statement
Implement pow(X, N), which calculates x raised to the power N i.e. (X^N).
Try using a recursive approach
Input
The first line contains T, denoting the number of test cases. Each test case contains a single line containing X, and N.

Constraints:
1 ≤ T ≤ 100
-10.00 ≤ X ≤10.00
-10 ≤ N ≤ 10
Output
For each test case, you need to print the value of X^N. Print up to two places of decimal.

Note:
Please take care that the output can be very large but it will not exceed double the data type value.
Example
Input:
1
2.00 -2

Output:
0.25
*/
mport java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static double pow(double X,int N){
			if(N==0){
				return 1;
			}else if(N>0){
				return X*pow(X,N-1);
			}else if(N<0){
				return (1/X)*pow(X,N+1);
				}else{
					return 0;
				}
	
			
		}

	public static void main (String[] args) {
    Scanner scan=new Scanner(System.in);
	int test=scan.nextInt();
    for(int i=0;i<test;i++){
		double X=scan.nextDouble();
		int N=scan.nextInt();
		System.out.printf("%.2f",pow(X,N));
		System.out.println();
	}
	}
	
}