#include <stdio.h>

int main()
{
    // Break keyword is used to break out of an infinite loop once a certain condition is met.

    int passcode = 1021;
    int i = 1;

    while (1)
    {
        printf("%d\n", i);
        if (i == passcode)
        {
            printf("Found the passcode!\n");
            break;
        }
        i++;
    }

    return 0;
}