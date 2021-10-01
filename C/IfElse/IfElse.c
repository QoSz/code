// Docotors office
// 1. Enter patients details
// 2. View a patient
// 3. Search a patient
// 4. Exit

#include <stdio.h>

int main(int argc, char *argv[]) {

    printf("Choose a menu option (1 - 4): \n");
    printf("1. Enter patients details.\n");
    printf("2. View a patient\n");
    printf("3. Search a patient\n");
    printf("4. Exit\n");

    int input;
    scanf("%d", &input);

    if (input == 1) {
        printf("Entering patients details\n");
    } else if (input == 2) {
        printf("Viewing a patient\n");
    } else if (input == 3) {
        printf("Searching for a patients records\n");
    } else if (input == 4) {
        printf("Exiting....\n");
    } else {
        printf("Incorrrect input\n");
    }

    return 0;
}