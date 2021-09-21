// Switch statements are mostly used for certain values rather than conditions like in IF Else statements.

#include <stdio.h>

int main(int argc, char *argv[])
{
    int slicesOfPizza;
    int numberOfCalories = 250;

    printf("Enter the slices of pizza you have eaten to day: \n");
    scanf("%d", &slicesOfPizza);

    switch (slicesOfPizza)
    {
    case 0:
        printf("You are doing a great job!\n");
        break;
    case 1:
        printf("You are doing ok don't eat too much!\n");
        break;
    case 2:
        printf("Eat one slice of pizza next time!\n");
        break;
    case 3:
        printf("You are a disappointment cook a healthy meal at home next time!\n");
        break;
    default:
        printf("Go to the GYM you lazy bum!\n");
        break;
    }

    printf("Number of calories eaten today %d\n", numberOfCalories * slicesOfPizza);

    return 0;
}