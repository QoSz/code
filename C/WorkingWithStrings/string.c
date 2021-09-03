#include <stdio.h>

int main(int argc, char *argv[]) {
    char name[15];

    printf("Enter your name here: ");

    scanf("%s", name);

    printf("Hello, %s I hope you have a great day tomorrow and get a lot of work done!\n", name);

    return 0;
}