#include <iostream>

int main(){
	
	double* preco = new double;
	
	*preco = 99.90;
	
	std::cout << "Valor no ponteiro: " << *preco << std::endl;
	std::cout << "Endereço no ponteiro: " << preco << std::endl;
	
	delete preco;
	
	preco = nullptr;
	
	//-----------------------------------------------------------------
	//para limpar um valor em um ponteiro devemos passar "nullptr"
	//para o mesmo, se não ele aponta para um valor de lixo na memória
	//-----------------------------------------------------------------
	
	if(preco == nullptr){
		
		std::cout << "A memória foi limpa com sucesso!";
	}
		else{
			std::cout << "Existe um valor presente na memória!" << std::endl;
			std::cout << "Valor no ponteiro: " << *preco << std::endl;
			std::cout << "Endereço no ponteiro: " << preco << std::endl;
		}
		
	return 0;
}
