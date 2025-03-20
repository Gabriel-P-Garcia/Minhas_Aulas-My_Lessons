#include <stdio.h>
#include <locale.h>

int main(){
    int day = 9;

    switch (day){
    case 1:
        printf("Segunda-Feira", setlocale(LC_ALL, "Portuguese"));
        break;
    case 2:
        printf("Terça-Feira", setlocale(LC_ALL, "Portuguese"));
        break;
    case 3:
        printf("Quarta-Feira", setlocale(LC_ALL, "Portuguese"));
        break;
    case 4:
        printf("Quinta-Feira", setlocale(LC_ALL, "Portuguese"));
        break;
    case 5:
        printf("Sexta-Feira", setlocale(LC_ALL, "Portuguese"));
        break;
    case 6:
        printf("Sábado", setlocale(LC_ALL, "Portuguese"));
        break;
    case 7:
        printf("Domingo", setlocale(LC_ALL, "Portuguese"));
        break;
    default:
        printf("Amigo, escolhe um dia que existe.", setlocale(LC_ALL, "Portuguese"));
    }

return 0;

}
