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

int main()
{
    int number;
    scanf("%d", &number);

    int fact = factorial(number);

    printf("Factorial of %d is %d\n", number, fact);

    return 0;
}