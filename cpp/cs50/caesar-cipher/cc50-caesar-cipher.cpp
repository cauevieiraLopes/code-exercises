#include <iostream>
#include <string>
#include <vector>
#include <cctype>

//receber o texto para cifra
void receberTexto (std::string &texto, int &chave){
	std::cout<<"Texto: ";
	std::getline(std::cin, texto);
	
	do{
		std::cout<<"Qual a chave?: ";
		std::cin>>chave;
		if(chave <= 0){
			std::cout<<"A chave deve ser um número positivo!"<<std::endl;
		}
	}while(chave <= 0);
}

//percorrer os caracteres e verificar se são letras e separar por maiusculas e minusculas
//reaLizar a formula
void cifra (std::string texto, int chave){
	std::cout<<"\ntexto cifrado: ";
	for(char i : texto){
		if(isalpha(i)){
			if(isupper(i)){
				i = ((i - 'A') + chave) % 26 + 'A';
				std::cout<<i;
			}
				else if(islower(i)){
					i = ((i - 'a') + chave) % 26 + 'a';
					std::cout<<i;
				}
		}
			else{
				std::cout<<i;
			}
	}
}

int main(){
	std::string texto{};
	int chave{};
	
	receberTexto(texto, chave);
	cifra(texto, chave);
	
	return 0;
}
