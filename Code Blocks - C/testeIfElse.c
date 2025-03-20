#include <stdio.h>

int main(){
    int myAge = 25;
    int votingAge = 18;

/*Coloca o if para executar o codigo se a condição for vdd,
coloca o else para executar o codigo caso a primeira condição for falsa*/

    if (myAge >= votingAge){
        printf("Old enough to vote!");
    } else {
        printf ("Too young to vote.");
    }
//Tambem da pra usar (horas < 18) ? printf("Good day!") : printf("Good evening!");
return 0;
}
