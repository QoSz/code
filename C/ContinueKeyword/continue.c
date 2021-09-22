#include <stdio.h>

int main()
{
    int i = 1;

    while (i < 10)
    {
        if (i == 7)
        {
            printf("7 is awsome ");
            i++;
            continue;
        }
        printf("%d ", i);
        i++;
    }
    printf("\n");
    return 0;
}