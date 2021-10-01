#include <stdio.h>

int main()
{

    double money = 20;
    double price = 25;

    // Below is the ternary operator work similar to the if else statement that is below it.
    money > price ? printf("You can buy the item.\n") : printf("You do not have enough money to purchase the item you need $%lf more to buy the item\n", price - money);

    if (money > price)
    {
        printf("You can buy the item.\n");
    }
    else
    {
        printf("You do not have enough money to purchase the item you need $%lf more to buy the item\n", price - money);
    }

    return 0;
}