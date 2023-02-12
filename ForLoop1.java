/*Given an integer n, For each i (1<=i<=n) if i is even print "even" else print "odd".
Input
User task:
Since this will be a functional problem, you don't have to take input. You just have to complete the functions For_Loop() that takes the integer n as parameter.

Constraints:
1 <= n <= 100
Output
Print even or odd for each i, separated by white spaces.
Example
Sample Input:
5

Sample Output:
odd even odd even odd

Sample Input:
2

Sample Output:
odd even
*/
public static void For_Loop(int n){
	//int a=n;
	 for(int i=1;i<=n;i++)
	 {
	 if(i%2==0)
	 {
		System.out.print("even ");
	 }
	 else
	 {
		 System.out.print("odd ");
	 }
	 
	 
	 }
//Enter your code here
}