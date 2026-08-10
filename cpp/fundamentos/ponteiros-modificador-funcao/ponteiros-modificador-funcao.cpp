#include <iostream>

void aplicarDesconto (float* produto, int taxa){
	
	std::cout << "Aplicando o desconto...." << std::endl;
	
	*produto = *produto - (*produto * taxa / 100);
	
	std::cout << "Novo valor: R%" << *produto;
}

int main(){
	
	float* produto = new float;
	int taxa = {};
	
	*produto = 149.99;
	
	std::cout << "Valor atual do produto: R$" << *produto << std::endl << std::endl;
	
	//garantir que o desconto não seja menor que 1
	while(true){
		
		std::cout << "Qual a porcentagem do desconto desejado: %";
		std::cin >> taxa;
		
		if((taxa < 1) || (taxa > 100)){
			std::cout << "Taxa de desconto inválida!" << std::endl;
		}
			else{
				break;
			}
	}
	
	aplicarDesconto(produto, taxa);
	
	delete produto;
	produto = nullptr;
	
	return 0;
}
