#include <iostream>
#include <cstdlib>

int main() {
	int *valores = {};
	int *valores2 = {};
	
	valores = (int*) malloc(3 * sizeof(int));
	
	if(valores == NULL){
		std::cout<<"Falha na alocação de memória"<<std::endl;
		return 1;
	}
		else{
			
			for(int i = 0; i < 3; i++){
				std::cout<<i + 1<<" Número: ";
				std::cin>>valores[i];
			}
		}
		
	for(int i = 0; i < 3; i++){
		std::cout<<valores[i]<<"	";
	}
	
	int opcao = {};
	
	std::cout<<"\n\nDeseja adicionar mais dois valores? [0 = não / qualquer número para sim]: ";
	std::cin>>opcao;
	
	std::cout<<std::endl<<std::endl;
	
	if(opcao == 0){
		
		free(valores); 
		
		return 2;
	}
		else{

			valores2 = (int*) realloc(valores, 5 * sizeof(int));
			
			for(int i = 3; i < 5; i ++){
				std::cout<<i<<" Número: ";
				std::cin>>valores2[i];
			}
			
			std::cout<<std::endl<<std::endl;
		
			for(int i = 0; i < 5; i++){
				std::cout<<valores2[i]<<"	";
			}
			
			free(valores2);
		}
			
	return 0;
}
