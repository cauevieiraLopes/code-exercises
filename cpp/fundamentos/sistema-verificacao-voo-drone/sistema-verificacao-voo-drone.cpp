#include <iostream>

struct drone{
	int bateria{};
	int vento{};
};

void porcentagem_da_bateria (drone &d){
	std::cout<<"Qual a porcentagem atual da bateria?\n";
	
	do{
		std::cout<<"Porcentagem: ";
		std::cin>>d.bateria;
		
		if(d.bateria > 100 || d.bateria < 0){
			std::cout<<"A porcentagem da bateria deve estar no intervalo de 0 a 100!\n";
		}
	}while(d.bateria > 100 || d.bateria < 0);
}

void velocidade_do_vento(drone &d){
	std::cout<<"Qual a velocidade do vento\n";
	
	do{
		std::cout<<"Velocidade: ";
		std::cin>>d.vento;
		
		if(d.vento < 0){
			std::cout<<"A velocidade do vento mínima aceita é de 1Km/h\n";
		}
	}while(d.vento < 0);
}

void manter_voo (drone d){
	if(d.bateria > 30 && d.vento < 20){ 
		std::cout<<"\nRecomendação: Situação favorável para manter ou realizar voo!";
	}
		else if(!(d.bateria > 30) || !(d.vento < 20)){ //negação do sistema com a lei de De Morgan
			std::cout<<"\nRecomendação: Não manter ou realizar voo!";
		}
}

int main(){
	drone droneAtivo;
	
	porcentagem_da_bateria(droneAtivo);
	velocidade_do_vento(droneAtivo);
	manter_voo(droneAtivo);
	
	return 0;
}
