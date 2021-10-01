#include <stdio.h>

int main()
{
    printf("What number would you like to count down from? ");
    int max;
    scanf("%d", &max);

    for (max; max > 0; max--)
    {
        printf("%d\n", max);
    }

    printf("What times table would you like? ");
    int timesTable;
    scanf("%d", &timesTable);

    for (int i = 1; i < 20 + 1; i++)
    {
        printf("%d * %d = %d\n", i, timesTable, i * timesTable);
    }

    printf("Incrementing by a certain number\n");
    printf("What number would you like to increment by? ");
    int increment;
    scanf("%d", &increment);

    for (int i = 1; i < 100 + 1; i += increment)
    {
        printf("%d\n", i);
    }
}