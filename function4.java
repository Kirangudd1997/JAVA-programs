/*
Problem Statement
Sherlock is a great detective but he is weak in maths. On one day Sherlock wants to divide N apples into M people but he is not sure whether he can divide them equally or not. Your task is to help Sherlock to solve the problem.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function Help() that takes integers N and M as arguments.

Constraints:-
1 <= N M <= 1000
Output
Return 1 if it is possible to divide N apple among M people else return 0.
Example
Sample Input:-
6 2

Sample Output:-
1
*/


static int Help(int N, int M){
    int count=0;
    if(N%M==0)
    {
        count++;
    }
    else
    {
        count=0;
    }
    return count;
//Enter your code here
}