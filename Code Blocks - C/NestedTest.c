#include <stdio.h>

int main(){
    int i, j;

    //Outer loop
    for (i = 1; i <= 2; ++i){
        printf("Outer: %d\n", i); //Vai ser executado 2 vezes

    //Inner loop
    for (j = 1; j<= 3; ++j){
        printf("Inner: %d\n", j);
        }
    }
return 0;
}
