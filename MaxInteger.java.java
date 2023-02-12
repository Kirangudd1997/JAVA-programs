/*Max Integer
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given three integers your task is to calculate the maximum integer among the given integers.
Input
The input contains three integers a, b, and c

Constraint:
1<=integers<=10000
Output
Print the maximum integer among the given integers.
Example
Sample Input:-
2 6 3

Sample Output:-
6

Sample Input:-
48 100 100

Sample Output:
100 */

static int  MaxInteger(int a ,int b, int c)
{
 if(a>b && a>c)
    {
       
       return a;
     }
    else
    {
        if(b>c)
        {
            return b;
        
        }
        else{

            return c;
        }
    }
}

