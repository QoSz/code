#include <stdio.h>

int main()
{

    int i = 0, j;

    while (i < 11)
    {
        j = i - 1;
        printf("%d ", i);
        i++;

        while (j >= 0)
        {
            printf("%d ", j);
            j--;
        }

        printf("\n");
    }
}