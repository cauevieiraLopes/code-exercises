#include <iostream>

int main(){
	
	int* numptr = nullptr;
	int num = 100;

	while(true){
		if(numptr == nullptr){
		
		std::cout << "O ponteiro vazio está sem nenhum valor e é seguro!" << std::endl << std::endl;
		std::cout << "Atribuindo valor 100 no ponteiro!" << std::endl << std::endl;
		
		numptr = &num;
		}
			else{
				
				std::cout << "O ponteiro tem um valor em seu endereço!" << std::endl;
				std::cout << "Valor no ponteiro: " << *numptr << std::endl;
				std::cout << "Endereço no ponteiro: " << numptr << std::endl;
				
				break;
			}
	}	
	
	return 0;
}
