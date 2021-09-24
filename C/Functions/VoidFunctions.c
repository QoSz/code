#include <stdio.h>
#include <math.h>

int factorial(int n)
{
    int factorial = 1;

    for (int i = n; i > 1; i--)
    {
        factorial *= i;
    }

    return factorial;
}

// Void functions are mainly used for printing where as printing cannot be done in other functions.

void printFactorial(int n)
{
    printf("The factorial of %d is %d\n", n, factorial(n));
}

int main()
{
    for (int i = 1; i < 11; i++)
    {
        printFactorial(i);
    }

    return 0;
}