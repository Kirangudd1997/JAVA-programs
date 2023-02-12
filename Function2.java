/*Problem Statement
Sara is solving a math problem in which she has been given an integer N and her task is to find the number of operations required to convert N into 1.
Where in one operation you replace the number with its second-highest divisor.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function DivisorProblem() that takes integer N as argument.

Constraints:-
1 <= N <= 100000
Output
Return the number of operations required.
Example
Sample Input:-
100

Sample Output:-
4

Explanation:-
100 - > 50
50 - > 25
25 - > 5
5 - > 1
*/
static int DivisorProblem(int N){
  int count=0;
  int r=N;
  for(int i=N-1;i>=1;i--)
  {
    if(N%i==0)
    {
      N=i;
      count++;
    }
  }
  return count;
//Enter your code here
}
