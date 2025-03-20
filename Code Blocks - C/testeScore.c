#include <stdio.h>
#include <locale.h>

int main(){
//Score máximo (variavel)
    const int MAXSCORE = 500; //const vai fazer esse score imutável

//O score do usuário
    int userScore = 423;

/*Bora calcular o percentual do score do usuário em relação ao score
máximo, lembrando de usar o (float) depois do igual pra divisão ficar certa*/
    float percentage = (float) userScore / MAXSCORE * 100.0;

//Agora o print
    printf("O percentual do usuário é: %.2f", percentage, setlocale(LC_ALL, "Portuguese"));

return 0;


}
