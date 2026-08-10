#include <iostream>
#include <algorithm>
#include <array>

int quantidade_eleitores (int &e){
	std::cout<<"====== Candidatos ======\n";
	std::cout<<" Alice | Charlie | Bob\n\n";
	
	do{
		std::cout<<"Qual a quantidade de eleitores: ";
		std::cin>>e;
		
		if(e < 1){
			std::cout<<"A quantidade mínima de eleitores é 1.\n\n";
		}
			else if(e > 9){
				std::cout<<"A quantidade máxima de eleitores é 9.\n\n";
			}
	}while((e < 1) || (e > 9));
	
	return e;
}

void eleicao (const std::array<std::string, 3>& l, std::array<int, 3>& v, const int e){
	std::string nome{};
	
	for(int i = 0; i < e; i++){
		do{
			std::cout<<"Voto: ";
			std::cin>>nome;
			
			if((nome != l[0]) && (nome != l[1]) && (nome != l[2])){
				std::cout<<"\nCandidato Inválido\n";
			}
		}while((nome != l[0]) && (nome != l[1]) && (nome != l[2]));
			
		for(int j = 0; j < 3; j++){
			if(nome == l[j]){
				v[j] += 1;
			}
		}	
	}
}

void vencedor_da_eleicao (std::array<std::string, 3>& l, std::array<int, 3>& v){
	if(v[0] == v[1] && v[0] == v[2]){
		std::cout<<"\nEmpate! todos os candidatos tiveram a mesma quantidade de votos\n";
		
		return;
	}
	
	//organizar em ordem crescente
	for(int i = 0; i < l.size() - 1; i++){
		for(int j = 0; j < l.size() - 1; j++){
			if(v[i] > v[j + 1]){
			std::swap(v[i], v[j + 1]);
			std::swap(l[i], l[j + 1]);
			}
		}
	}
	
	if(v[1] == v.back()){
		std::cout<<"\nEmpate entre: "<<l[1]<<" e "<<l.back();
		return;
	}
		else{
			std::cout<<"\nVencedor: "<<l.back();
			return;
		}
}
	

int main(){
    std::array<std::string, 3> lista_candidados = {"Alice", "Charlie", "Bob"};
    std::array<int, 3> votos_candidatos = {0, 0, 0};
    int eleitores {};
    
    eleitores = quantidade_eleitores(eleitores);
    eleicao(lista_candidados, votos_candidatos, eleitores);
    vencedor_da_eleicao(lista_candidados, votos_candidatos);
    
    return 0;
}
