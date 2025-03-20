#include <stdio.h>

int main(){
    int i;

/*Break serve para sair de um loop mas tambem de um switch, Continue quebra
apenas uma instancia do loop (da segunda afirmativa), depois continua o loop*/
    for (i = 0; i < 10; i++){
        if (i == 4){
            continue;
        }
        printf("%d\n", i);
    }
return 0;
}
