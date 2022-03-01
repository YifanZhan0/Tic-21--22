#include<stdio.h>

int main (){

int x[10]							;	
int cont							;
float suma=0						;
float media; 

	for (cont=0;cont<10;cont++){
		printf("dame un numero: ")	;
		scanf("%d",&x[cont]);
	}

	for (cont=0;cont<10;cont++){
		printf("\n%d",x[cont])		;
		suma=+x[cont]				;
	}
	media=suma/10;	
	printf("\nla media vale=%f",media);
	return 0						;
}
