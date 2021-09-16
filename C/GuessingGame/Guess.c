#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <time.h>

int main() {
    // Guess a number from 0 - maxValue
    
    int maxValue = 5;
    int randomNumber;
    int incorrectGuess = true;
    int numberInput;

    srand(time(NULL));
    randomNumber = rand() % (maxValue + 1);
//    printf("%d", randomNumber);

    while (incorrectGuess)
    {
        printf("Guess the number between 0 - %d: \n", maxValue);
        scanf("%d", &numberInput);

        if (numberInput == randomNumber)
        {
            printf("You win!\n");
            incorrectGuess = false;
        } else if (numberInput > randomNumber) {
            printf("Too high!\n");
        } else if (numberInput < randomNumber) {
            printf("Too Low!\n");
        } else {
            printf("Enter a number next time!\n");
            break;
        }
        
    }
    printf("Thank you for playing!\n");

    return 0;
}
