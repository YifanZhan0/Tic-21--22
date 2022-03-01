#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(){
	//reserva dinamica de memoria
	char aux[100];//reservo una variable axiliar para guardar provisionalmente una palabra 
	int longitud;//defino el tamaño 
	printf("\ndime una palabra: ");
	scanf("%s",aux);
	longitud= strlen(aux);
	char *palabra;//palabra es un puntero (variable que contiene una dirección de memoria de algo quee es una letra 
	palabra=(char*)malloc(longitud*sizeof(char));/*memory allocation*/
	strcpy(palabra,aux);
	printf("\nresultado: ");
	printf("%s",palabra);	
	return(0);
}
