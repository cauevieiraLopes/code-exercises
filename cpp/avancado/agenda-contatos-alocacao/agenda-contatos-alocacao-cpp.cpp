#include <iostream>
#include <cstdlib>
#include <string>

struct Contato {
	char inicial_nome = {};
	std::string nome = {};
	int idade = {};
};

int main(){
	int quantidade, idade;
	std::string inicial = {};
	
	std::cout<<"Quantos contatos deseja adicionar?"<<std::endl<<"Quantidade: ";
	std::cin>>quantidade;
	
	Contato* agenda = new Contato[quantidade];
	
	for(int i = 0; i < quantidade; i++){
		std::cin.ignore();
		
		std::cout<<"\nQual o nome do contato?"<<std::endl<<"Nome: ";
		std::getline(std::cin, inicial);
		
		std::cout<<"\nQual a idade do contato?"<<std::endl<<"idade: ";
		std::cin>>idade;
		
		agenda[i].inicial_nome = inicial[0];
		agenda[i].nome = inicial;
		agenda[i].idade = idade;
	}
	
	std::cout<<"\n----- E X I B I Ç Ã O -----"<<std::endl<<std::endl;
	
	for(int i = 0; i < quantidade; i++){
		std::cout<<agenda[i].inicial_nome<<std::endl;
		std::cout<<agenda[i].nome<<std::endl;
		std::cout<<	agenda[i].idade<<std::endl<<std::endl;
	}
	
	delete[] agenda;
	
	return 0;
}
