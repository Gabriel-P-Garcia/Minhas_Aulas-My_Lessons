#include <stdio.h>
#include <locale.h>


int main(){
//Variaveis
    int largura = 4;
    int altura = 6;
    int area;

//Cálculo de area
    area = largura * altura;

//Os prints
    printf("A largura é: %d\n", largura, setlocale(LC_ALL, "Portuguese") );
    printf("A altura é; %d\n", altura);
    printf("O valor da area é: %d", area);
    return 0;

}
