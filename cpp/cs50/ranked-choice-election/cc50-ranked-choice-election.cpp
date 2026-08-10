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

void eleicao (const std::array<std::string, 3>& l, std::array<int, 3>& v, const int &e){
	std::array<std::string, 3> lista_rank = {"0", "0", "0"};
	bool continuar;
	std::string nome{};
	
	for(int i = 0; i < e; i++){
		lista_rank[0] = "0"; //"esvaziar" a lista para a votação do próximo eleitor
		lista_rank[1] = "0";
		lista_rank[2] = "0";
		
		for(int rank = 1; rank < 4; rank++){
			do{
				std::cout<<"Rank "<<rank<<": ";
				std::cin>>nome;
				
				if(nome == "0"){ //impedir erro no sistema, pois o array vazio no sistema é considerado como "0"
					nome = "#";
				}
				
				if((nome == l[0] || nome == l[1] ||nome == l[2]) && !(nome == lista_rank[0] || nome == lista_rank[1] || nome == lista_rank[2])){
						continuar = true;
						lista_rank[rank - 1] = nome;
					}
						else{
							continuar = false;
							std::cout<<"Nome inválido ou candidato já votado\n";
						}
			}while(continuar == false);
						
			switch(rank){
				case 1:
					for(int i = 0; i < 3; i++){
						if(nome == l[i]){
							v[i] += 3;
						}
					}
					break;
				case 2:
					for(int i = 0; i < 3; i++){
						if(nome == l[i]){
							v[i] += 2;
						}
					}
					break;
				case 3:
					for(int i = 0; i < 3; i++){
						if(nome == l[i]){
							v[i] += -1;
						}
					}
					break;
			}
		}
		std::cout<<std::endl;
	}	
}

void vencedor_da_eleicao (std::array<std::string, 3>& l, std::array<int, 3>& v){
	//organizar em ordem crescente
	for(int i = 0; i < l.size() - 1; i++){
		for(int j = 0; j < l.size() - 1; j++){
			if(v[i] > v[j + 1]){
			std::swap(v[i], v[j + 1]);
			std::swap(l[i], l[j + 1]);
			}
		}
	}
	std::cout<<"Vencedor: "<<l.back();
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
