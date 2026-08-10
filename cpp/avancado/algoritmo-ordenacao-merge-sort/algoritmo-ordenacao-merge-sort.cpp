#include <iostream>
#include <vector>

void merge (std::vector<int>& lista, int esquerda, int meio, int direita){
	
	int i, j, k;
	int n1 = meio - esquerda + 1;
	int n2 = direita - meio;
	
	std::vector<int> esquerdaVec(n1), direitaVec(n2);
	
	for(int i = 0; i < n1; i++){
		esquerdaVec[i] = lista[esquerda + i];
	}
	for(int j = 0; j < n2; j++){
		direitaVec[j] = lista[meio + 1 + j];
	}
	
	i = 0;
	j = 0;
	k = esquerda;
	
	while(i < n1 && j < n2){
		
		if(esquerdaVec[i] <= direitaVec[j]){
			lista[k] = esquerdaVec[i];
			i++;
		}
			else{
				lista[k] = direitaVec[j];
				j++;
			}
		k++;
	}
	
	while(i < n1){
		lista[k] = esquerdaVec[i];
		i++;
		k++;
	}
	
	while(j < n2){
		lista[k] = direitaVec[j];
		j++;
		k++;
	}
}

void mergeSort (std::vector<int>& lista, int esquerda, int direita){
	
	if (esquerda < direita){
		int meio = esquerda + (direita - esquerda) / 2;
		
		mergeSort (lista, esquerda, meio);
		mergeSort (lista, meio + 1, direita);
		
		merge(lista, esquerda, meio, direita);
	}
}

void insercaoNumeros (std::vector<int>& lista){
	
	std::cout<<"Insira os números da lista no campo abaixo:"<<std::endl;
	std::cout<<"Digite '0' após o 2° número para encerrar a lista!"<<std::endl;
	
	int num, contador = 1;
	
	while (true){
		
		if (contador >= 3){
			std::cout<<"(Digite '0' para encerrar a lista)"<<std::endl;
		}
		
		std::cout<<contador<<"° Número: ";
		std::cin>>num;
		
		if (num == 0 && contador < 3){
			std::cout<<"\nVocê precisa inserir mais números na lista!\n";
			continue;
		}
			else if (num == 0 && contador >= 3){
				break;
			}
				else{
					lista.push_back(num);
					contador++;
				}
	}
	
	std::cout<<"\nLista atual: ";
	
	for(auto i : lista){
		std::cout<<i<<"    ";
	}
	
	mergeSort(lista, 0, lista.size() - 1);
}

int main (){
	
	std::vector<int> lista;
	
	insercaoNumeros(lista);
	
	std::cout<<"\n\nLista com merge sort: ";
	
	for(auto i : lista){
		std::cout<<i<<"    ";
	}
	
	return 0;
}
