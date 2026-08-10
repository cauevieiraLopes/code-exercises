#include <iostream>

//função para o título do código
void titulo(){
	std::cout<<"===== CRESCIMENTO POPULACIONAL ====="<<std::endl;
}

//int main
int main(){
	int inicial{}, final{}, anos{};
	
	//titulo com a solicitação do tamanho inicial
	titulo();
	std::cout<<"(O tamanho inicial mínimo para população é 9)"<<std::endl;
	do{
		std::cout<<"Tamanho inicial da população: ";
		std::cin>>inicial;
	}while(inicial < 9);
	
	//solicitar a quantidade desejada
	std::cout<<std::endl;
	std::cout<<"(O tamanho final deve ser maior que o inicial!)"<<std::endl;
	do{
		std::cout<<"Qual o tamanho esparado?: ";
		std::cin>>final;
	}while(final <= inicial);
	
	//contagem de crescimento em anos
	for(anos = 0; inicial < final; anos++){
		inicial = inicial + (inicial /3) - (inicial / 4);
	}
	
	//final
	std::cout<<std::endl;
	titulo();
	if(anos == 1){
		std::cout<<"Será necessário apenas "<<anos<<" ano para alcançar a quantidade desejada!";
	}
		else{
		std::cout<<"Será necessário "<<anos<<" anos para alcançar a quantidade desejada!";	
		}
		
	return 0;	
}//final do int main
