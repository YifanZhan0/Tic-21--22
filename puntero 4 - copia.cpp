#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main (){

	char aux[10];
	int longitud;
	char *lista[3];
	int cont;
	for(cont=0;cont<3;cont++){
	
		printf("\n dime el nombre del rey: ",cont);
		scanf("%s",aux);
		longitud=strlen(aux);
		lista[cont]=(char*)malloc(longitud*sizeof(char));
		strcpy(lista[cont],aux);
	}
	printf("\n los tres reyes magos son: ");
	for(cont=0;cont<3;cont++){
		printf("\n %s",lista[cont]);
	}
	
	return(0);
}
