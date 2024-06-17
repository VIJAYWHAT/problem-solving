#include <stdio.h>

int main() {
    int num, i;
    unsigned long long factorial = 1;

    printf("Enter an integer: ");
    scanf("%d", &num);

    // Negative numbers don't have a factorial
    if (num < 0)
        printf("Factorial of negative numbers is not defined.\n");
    else {
        for (i = 1; i <= num; ++i) {
            factorial *= i;
        }
        printf("Factorial of %d = %llu\n", num, factorial);
    }

    return 0;
}

// Problem: Write a program to find the factorial of a given number.