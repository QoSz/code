#include <stdio.h>
#include <string.h>

int main(int argc, char **argv[])
{
    printf("Enter your first name: ");
    char first[50];
    scanf("%49s", first);

    printf("Enter you last name: ");
    char last[50];
    scanf("%49s", last);

    printf("%s %s\n", first, last);

    int firstCount = strlen(first);
    int lastCount = strlen(last);

    printf("First name count: %d\n", firstCount);
    printf("Last name count: %d\n", lastCount);

    return 0;
}