#include <iostream>
#include <cstdlib>

int main(){
	double *volume = (double*) malloc(11 * sizeof(double));
	
	//verificar se ocorreu erro na alocação
	if(volume == nullptr){
		std::cout<<"Falha na alocação"<<std::endl;
		
		return 1;
	}
		else{
			//criar o sistema de volume de 0 até 100
			for(int i = 0; i <= 10; i++){
				volume[i] = 10 * i;
			}
			
			std::cout<<"Volume atual:"<<std::endl;
			
			for(int i = 0; i <= 10; i++){
				std::cout<<volume[i]<<"	";
			}
			
			//modificar os valores na memória 
			double modificador = {};
			
			std::cout<<"\n\nQual o multiplicador de aúdio desejado: ";
			std::cin>>modificador;
			
			for(int i = 0; i <= 10; i++){
				volume[i] = volume[i] * modificador;
			}
		}
	
	//exibir os novos valores e liberar a memória
	for(int i = 0; i <= 10; i++){
		std::cout<<volume[i]<<"	";
	}
	
	free(volume);
	
	return 0;
}
