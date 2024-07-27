#include "stdio.h"
#include "stdlib.h"

// change of the cash
// input: amount
// output: in cash [1,2,5,10,20,50,100]

int main() {
    int amount;
    printf("Enter the amount: ");
    scanf("%d", &amount);
    int cash[7] = {100, 50, 20, 10, 5, 2, 1};
    int i = 0;
    while (amount > 0) {
        if (amount >= cash[i]) {
            printf("%d ", cash[i]);
            amount -= cash[i];
        } else {
            i++;
        }
    }
    return 0;
}