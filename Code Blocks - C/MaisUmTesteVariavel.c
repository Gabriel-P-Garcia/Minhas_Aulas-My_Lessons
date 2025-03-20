#include <stdio.h>

int main(){
//Testando potencias
    int f1 = 35e3;
    double d1 = 12E4;

//Testando cortar decimais
    double myDouble = 19.99;

//Prints
    printf("%d\n", f1);
    printf("%.0lf\n", d1);
        printf("%.0lf\n\n", myDouble);

    printf("Tamanho das variaveis: \n");
        printf("Tamanho do int: %lu\n", sizeof(f1));
        printf("Tamanho do double: %lu\n", sizeof(d1));
    return 0;

}
