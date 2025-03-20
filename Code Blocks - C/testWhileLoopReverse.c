#include <stdio.h>

int main(){
//Variavel com alguns numeros especificos
    int numbers = 12345;

//Variavel para armazenar o numero inverso
    int revNumbers = 0;

//Para reverter e reordenar os numeros
    while (numbers){
//Pega o ultimo numero de "numbers" e adiciona ao "revnumber
    revNumbers  = revNumbers * 10 + numbers % 10;
//Remove o ultimo numero de "numbers"
    numbers /= 10;
    }
printf ("%d", revNumbers);

return 0;
}
