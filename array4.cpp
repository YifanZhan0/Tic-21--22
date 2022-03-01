#include<stdio.h>

int main (){

	char letras[10];	
	int cont;


	for(cont=0;cont<10;cont++){
		printf("dame una letra %d: ",cont);
		scanf(" %c",&letras[cont]);
	}
	printf("\nHas escrito la palabra: ",);
	for(cont=0;cont<10;cont++){
		printf("%c",letras[cont]);
	}	
	for(cont=4;cont>=0;cont--){
		printf("%c",letras[cont]);
	}
	printf("\n	")
return 0;
}
