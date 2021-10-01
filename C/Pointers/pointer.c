#include <stdio.h>

int main()
{

    int number = 2;
    int *p = &number;

    printf("The number is: %d\n", number);
    printf("The number using the pointer is: %d\n", *p);

    number += 5;

    printf("The number is: %d\n", number);
    printf("The number using the pointer is: %d\n", *p);

    *p = 999;
    printf("The number is: %d\n", number);
    printf("The number using the pointer is: %d\n", *p);

    return 0;
}