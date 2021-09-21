#include <stdio.h>

int main()
{

    for (int i = 0; i < 11; i++)
    {
        for (int j = i; j >= 0; j--)
        {
            printf("%d ", j);
        }
        printf("\n");
    }

    for (int x = 10; x >= 0; x--)
    {
        for (int y = x; y >= 0; y--)
        {
            printf("%d ", y);
        }
        printf("\n");
    }

    return 0;
}