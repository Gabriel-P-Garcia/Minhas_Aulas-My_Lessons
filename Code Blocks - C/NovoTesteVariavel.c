#include <stdio.h>
#include <locale.h>

int main(){
    //Novas Variaveis, lembra de sempre dar nomes descritivos pras variaveis
    int idDoAluno = 405;
    int idadeDoAluno = 23;
    float taxaDoAluno = 305.25;
    char mencaoDoAluno = 'S';
    double testinho = 2055535.467494842;
    char mytext[] = "Bom dia!";

    printf("ID do Aluno: %d\n", idDoAluno, setlocale(LC_ALL, "Portuguese") );
    printf("Idade do Aluno: %d\n", idadeDoAluno);
    printf("Taxa do Aluno: %.2f\n", taxaDoAluno);
    printf("Menção do Aluno: %c\n", mencaoDoAluno);
    printf("Novo valor: %.4lf\n", testinho);
    printf("%s", mytext);
    return 0;

}
