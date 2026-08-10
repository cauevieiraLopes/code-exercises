#include <iostream>
#include <array>
#include <algorithm>

void receber_numeros(std::array<int, 5>&l){
	std::cout<<"Escreva 5 números para adiconar na lista:\n";
	
	for(int i = 0; i < 5; i++){
		std::cout<<"N°"<<i+1<<": ";
		std::cin>>l[i];	
	}
}

void exibir_lista_desordenada(std::array<int, 5>&l){
	std::cout<<"\nLista desordenada: ";
	
	for(const int& i : l){
		std::cout<<i<<" ";
	}
}

void ordenar_lista(std::array<int, 5>&l){
	
	for(int i = 0; i < l.size() - 1; i++){ 	/*std::sort(l.begin(), l.end());*/ //forma simplificada
		for(int j = 0; j < l.size() - 1 - i; j++){
			if(l[j] > l[j+1]){
				std::swap(l[j], l[j+1]);
			}
		}
	}
	
	std::cout<<"\nLista ordenada: ";
	
	for(const int& i : l){
		std::cout<<i<<" ";
	}
}

int main(){
	std::array<int, 5>lista_de_numeros;
	
	receber_numeros(lista_de_numeros);
	exibir_lista_desordenada(lista_de_numeros);
	ordenar_lista(lista_de_numeros);
	
	return 0;
}
