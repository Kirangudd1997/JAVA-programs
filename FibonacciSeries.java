/*
Problem Statement
Given an integer N, find the Nth number in the fibonacci series. Consider 0 and 1 to be the seed values.

In the fibonacci series, each number (Fibonacci number) is the sum of the two preceding numbers. The series with 0 and 1 as seed values will go like -
0, 1, 1, 2, 3, 5 and so on..
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Fibonacci() that takes the integer N as a parameter.

Constraints:
1 ≤ T ≤ 10
1 ≤ N ≤ 30
Output
Return the Nth Fibonacci number.
Example
Sample Input
2
3
5

Sample Output
2
5
*/
static long  Fibonacci(long  n) 
    { 
      if(n == 1 || n == 2){
			return 1;
		}
    else
    {
	return Fibonacci(n-2) + Fibonacci(n-1);
	}
  //Enter your code here
    }