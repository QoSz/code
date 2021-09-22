#include <stdio.h>

int main()
{
    // Using the while loop

    int i = 0;

    while (i < 10)
    {
        printf("%d ", i);
        i++;
    }
    printf("\n");

    // The while loop is similar to the for loop.
    // But while loops are mostly used for repeating code where as for loops are used for iteration.
    for (int i = 0; i < 10; i++)
    {
        printf("%d ", i);
    }
    printf("\n");
}