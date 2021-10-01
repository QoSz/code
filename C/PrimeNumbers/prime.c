#include <stdio.h>
#include <stdbool.h>
#include <math.h>

bool isPrime(int input)
{

    for (int i = sqrt(input); i > 1; i--)
    {
        if (input % i == 0)
        {
            return false;
        }
    }
    return true;
}

int main()
{

    printf("Enter a max number to check if the numbers below it are prime: ");
    int input;
    scanf("%d", &input);

    for (int i = input; i > 1; i--)
    {
        bool prime = isPrime(i);

        if (prime)
        {
            printf("%d is prime.\n", i);
        }
    }

    return 0;
}