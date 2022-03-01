#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main (){

	char aux[10];
	int longitud;
	char *mispalabras[5];
	int cont;
	for(cont=0;cont<5;cont++){
		
		printf("\n la palabra %d: ",cont);
		scanf("%s",aux);
		longitud=strlen(aux);
		mispalabras[cont]=(char*)malloc(longitud*sizeof(char));
		strcpy(mispalabras[cont],aux);
	}
	printf("\n las cinco palabras son: ");
	for(cont=0;cont<5;cont++){
		printf("\n %s",*(mispalabras+cont));
		//sustituyo mis palabras[cont] por *((mispalabras+cont)
	}
		
	return(0);
}
