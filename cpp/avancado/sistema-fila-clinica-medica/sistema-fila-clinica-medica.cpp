#include <iostream>
#include <string>

int main(){
	int prioridade{};
	char registro{};
	std::string nome{},sobrenome{};
	
	std::cout<<"===========================================\n";
	std::cout<<"       SISTEMA DE FILA - CLÍNICA MÉDICA\n";
	std::cout<<"===========================================\n\n";
	std::cout<<"----------- REGISTRO DE PACIENTE ---------\n";
	std::cout<<"Nome do Paciente: ";
	std::cin>>nome>>sobrenome;
	
	std::cout<<std::endl<<std::endl;
	
	std::cout<<"NÍVEIS DE PRIORIDADE:\n1. Urgência\n2. Preferencial\n3. Normal\n";
	do{
	
		std::cout<<"Selecione a prioridade (1-3): ";
		std::cin>>prioridade;
		if(prioridade > 3 || prioridade < 1){
			std::cout<<"Opção inválida! Tente novamente.\n\n";
		}
	}while(prioridade > 3 || prioridade < 1);
	
	switch(prioridade){
		case 1:
			std::cout<<"-------------------------------------------\n";
			std::cout<<"           REGISTRO CONFIRMADO\n";
			std::cout<<"-------------------------------------------\n";
			std::cout<<"Paciente: "<<nome<<" "<<sobrenome<<std::endl;
			std::cout<<"Prioridade: Urgência\n";
			std::cout<<"Tempo estimado: Atendimento Imediato\n";
			std::cout<<"-------------------------------------------\n";
			break;	
		case 2:
			std::cout<<"-------------------------------------------\n";
			std::cout<<"           REGISTRO CONFIRMADO\n";
			std::cout<<"-------------------------------------------\n";
			std::cout<<"Paciente: "<<nome<<" "<<sobrenome<<std::endl;
			std::cout<<"Prioridade: Preferencial\n";
			std::cout<<"Tempo estimado: 15 a 30 minutos\n";
			std::cout<<"-------------------------------------------\n";
			break;
		case 3:
			std::cout<<"-------------------------------------------\n";
			std::cout<<"           REGISTRO CONFIRMADO\n";
			std::cout<<"-------------------------------------------\n";
			std::cout<<"Paciente: "<<nome<<" "<<sobrenome<<std::endl;
			std::cout<<"Prioridade: Normal\n";
			std::cout<<"Tempo estimado: 45 a 60 minutos\n";
			std::cout<<"-------------------------------------------\n";
			break;			
	}
	
	do{
		std::cout<<"Deseja registrar outro paciente? (S/N): ";
		std::cin>>registro;
	}while((registro != 'S')&&(registro != 'N'));
	
	if(registro == 'S'){
		for(int i = 2; i <= 20; i++){
			std::cout<<"--- NOVO ATENDIMENTO ("<<i<<"/20) ---\n";
			std::cout<<"Nome do Paciente: ";
			std::cin>>nome>>sobrenome;
			
			std::cout<<std::endl<<std::endl;
	
			std::cout<<"NÍVEIS DE PRIORIDADE:\n1. Urgência\n2. Preferencial\n3. Normal\n";
			do{
			
				std::cout<<"Selecione a prioridade (1-3): ";
				std::cin>>prioridade;
				if(prioridade > 3 || prioridade < 1){
					std::cout<<"Opção inválida! Tente novamente.\n\n";
				}
			}while(prioridade > 3 || prioridade < 1);
			
			switch(prioridade){
				case 1:
					std::cout<<"-------------------------------------------\n";
					std::cout<<"           REGISTRO CONFIRMADO\n";
					std::cout<<"-------------------------------------------\n";
					std::cout<<"Paciente: "<<nome<<" "<<sobrenome<<std::endl;
					std::cout<<"Prioridade: Urgência\n";
					std::cout<<"Tempo estimado: Atendimento Imediato\n";
					std::cout<<"-------------------------------------------\n";
					break;	
				case 2:
					std::cout<<"-------------------------------------------\n";
					std::cout<<"           REGISTRO CONFIRMADO\n";
					std::cout<<"-------------------------------------------\n";
					std::cout<<"Paciente: "<<nome<<" "<<sobrenome<<std::endl;
					std::cout<<"Prioridade: Preferencial\n";
					std::cout<<"Tempo estimado: 15 a 30 minutos\n";
					std::cout<<"-------------------------------------------\n";
					break;
				case 3:
					std::cout<<"-------------------------------------------\n";
					std::cout<<"           REGISTRO CONFIRMADO\n";
					std::cout<<"-------------------------------------------\n";
					std::cout<<"Paciente: "<<nome<<" "<<sobrenome<<std::endl;
					std::cout<<"Prioridade: Normal\n";
					std::cout<<"Tempo estimado: 45 a 60 minutos\n";
					std::cout<<"-------------------------------------------\n";
					break;			
			}
			
				do{
					std::cout<<"Deseja registrar outro paciente? (S/N): ";
					std::cin>>registro;
				}while((registro != 'S')&&(registro != 'N'));	
			
			if(registro == 'N'){
					std::cout<<"encerrando o sistema...\n";
					std::cout<<"===========================================\n";
				break;
			}
		}
	}
		else{
			std::cout<<"encerrando o sistema...\n";
			std::cout<<"===========================================\n";
		}
	return 0;
}
