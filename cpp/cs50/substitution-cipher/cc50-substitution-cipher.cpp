#include <iostream>
#include <vector>
#include <cctype>
#include <string>

//Receber o texto e pegar a chave com a mesma quantidade de caracteres do alfabeto
void receber_texto (std::string &texto, std::string &chave){
	std::cout<<"Texto: ";
	std::getline(std::cin, texto);
	
	do{
		std::cout<<"Chave: ";
		std::getline(std::cin, chave);
	}while(chave.size() < 26 || chave.size() > 26);
}

//pegar a posicao exata com base na letra original
int verificar_posicao (char i){
	char k = toupper(i);
	
	switch (k){
		case 'A':
			return 0;
			break;
		case 'B':
			return 1;
			break;
		case 'C':
			return 2;
			break;
		case 'D':
			return 3;
			break;
		case 'E':
			return 4;
			break;
		case 'F':
			return 5;
			break;
		case 'G':
			return 6;
			break;
		case 'H':
			return 7;
			break;
		case 'I':
			return 8;
			break;
		case 'J':
			return 9;
			break;
		case 'K':
			return 10;
			break;
		case 'L':
			return 11;
			break;
		case 'M':
			return 12;
			break;
		case 'N':
			return 13;
			break;
		case 'O':
			return 14;
			break;
		case 'P':
			return 15;
			break;
		case 'Q':
			return 16;
			break;
		case 'R':
			return 17;
			break;
		case 'S':
			return 18;
			break;
		case 'T':
			return 19;
			break;
		case 'U':
			return 20;
			break;
		case 'V':
			return 21;
			break;
		case 'W':
			return 22;
			break;
		case 'X':
			return 23;
			break;
		case 'Y':
			return 24;
			break;
		case 'Z':
			return 25;
			break;
	}
}

//verificar a posição da letra para buscar no texto criptografado
void posicao (std::vector<char> texto_original, std::vector<char> alfabeto_criptografado){
	int j{};
	char k{}, l{};
	
	std::cout<<"Texto criptografado: ";
	for(char i : texto_original){
		j = verificar_posicao(i); //receber posição
		k = alfabeto_criptografado[j]; //buscar
		
		if(isupper(i)){//verificar se é uma letra maiuscula
			char l = toupper(k);
			std::cout<<l;
		}
			else if(islower(i)){//verificar se é minuscula
				char l = tolower(k);
				std::cout<<l;
			}
				else{
					std::cout<<i; //caso não seja uma letra apenas irá imprimir o caracter bruto do vector
				}
	}
}	

int main(){
	std::string texto, chave;
	
	receber_texto(texto, chave); //Oter o texto e alfabeto criptografado
	
	std::vector<char> texto_original (texto.begin(), texto.end());
	std::vector<char> alfabeto_criptografado (chave.begin(), chave.end());
	
	posicao(texto_original, alfabeto_criptografado);
	
	return 0;
}
