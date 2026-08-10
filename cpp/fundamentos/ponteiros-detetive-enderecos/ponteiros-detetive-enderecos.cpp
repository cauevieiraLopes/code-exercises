#include <iostream>

int main(){
	
	//---------------------------------------------------------------------------
	//O ponteiro "*" antes da variável indica que ele está guardando um espaço
	//na memória para outra váriavel
	//já o "&" fala qual o endereço da variável
	//---------------------------------------------------------------------------
	
	int valor = 20;
	int* pvalor = &valor; //reservando um espaço na memória e colocando o endereço de "valor"
	
	std::cout << "Valor atual: " << *pvalor << std::endl;
	std::cout << "Endereço atual: " << pvalor << std::endl << std::endl;
	
	std::cout << "Caso altere o valor da variável para 25" << std::endl;
	
	*pvalor = 25; //alterando o valor dentro da memória do ponteiro
	
	std::cout << "Valor atual: " << *pvalor << std::endl;
	std::cout << "Endereço atual: " << pvalor << std::endl << std::endl;
	
	//---------------------------------------------------------------------------
	//CASO EU ALTERE O VALOR NA VARÍAVEL ORIGINAL É TROCADO O VALOR DO PONTEIRO
	//POR ESTAR LIGADO AO ENDEREÇO DA VARIÁVEL E VICE VERSA
	//---------------------------------------------------------------------------
	
	return 0;
}
