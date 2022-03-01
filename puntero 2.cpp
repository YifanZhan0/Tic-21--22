#include<stdio.h>

int main(){
	char palabra [];
	int cont;
	printf("escribe una palabra: ");
	scanf("%s",palabra);		
	printf("\nhas escrito la palabra %S",palabra);
	printf("\n boy a deletreartela: ");
	for(cont=0;cont<5;cont++){
		printf("\n%c",palabra[cont]);
	}
	palabra[1]='u';
	printf("\npalabra cambiada: %s",palabra);
	printf("\nquien es quien?: "),
	printf("palabra[2]=%x",&palabra);	
	
	return(0);
	
}
