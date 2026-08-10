#include <iostream>
#include <vector>
#include <string>

//função para o registro da fila
void registro (std::vector<std::string> &l){
	int contador = 1;
	std::string nome{};
	
	std::cout<< "Digite o nome do paciente (ou 'fim' para encerrar):"<<std::endl;
	do{
		std::cout<<"Paciente "<<contador<<": ";
		std::getline(std::cin, nome);
		
		if(nome == "fim"){
			break;
		}
		
		l.push_back(nome);
		contador++;
	}while(nome != "fim");
	
	
	//exibir o inicio da fila
	int contagem = 1;
	
	std::cout<<"\n\n=== Fila atual ("<<l.size()<<" pacientes) ==="<<std::endl;
	for(std::string n : l){
		std::cout<<contagem<<". "<<n<<" ";
		contagem++;
	}
	contagem = 1;	
	
	//exibir a atendimento e a progressão da fila
	for(int i = 0; i < contador -1; i++){
		std::cout<<"\n\nAtendendo "<<l.back()<<"..."<<std::endl;
		l.pop_back();
		
		std::cout<<"=== Fila atual ("<<l.size()<<" pacientes) ==="<<std::endl;
		
		for(std::string n : l){
			std::cout<<contagem<<". "<<n<<" ";
			contagem++;
		}
		contagem = 1;
	}//for principal
	
	if(contador == 1){
		std::cout<<"\nNão teve nimenhum paciente registrado na fila de atendimento!";
	}
		else{
			std::cout<<"\nTodos foram atendidos com sucesso!";
		}
}

//função principal
int main(){
	std::vector<std::string> lista_Nomes;
	registro(lista_Nomes);
	
	return 0;
}
