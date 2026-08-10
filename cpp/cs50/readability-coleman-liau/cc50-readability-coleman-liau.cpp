#include <iostream>
#include <cctype>
#include <string>
#include <cmath>

/*
	Fazer a solicitação do texto e realizar a contagem de
	letras, frases e palavras
*/
void verificarTexto (double &letras, double &palavras, double &frases, std::string &texto){
	std::cout<<"===== índice Coleman-Liau ====="<<std::endl;
	std::cout<<"Aviso: O índice Coleman-Liau foi desenvolvido para textos em inglês."<<std::endl;
	std::cout<<"Resultados em português podem não refletir com precisão a legibilidade."<<std::endl;
	std::cout<<"\nText: ";
	std::getline(std::cin, texto);
	
	for(char i : texto){
		if(isalpha(i)){
			letras++;
			
		}
			else if(isspace(i)){
				palavras++;
			}
				else if((i == '?')||(i == '!')||(i == '.')){
					frases++;
				}
	}
	
	/*
		após alguns teste foi notado que o código so consegue contar as palavras
		caso tenha um espaço " ". com isso, ele acaba ignorando a primeira palavra
		sendo assim precisamos verificar se ele está vazio, se estiver não faremos nada
		caso contrário adicionamos +1 em palavra.
	*/
	
	if(texto.empty() == false){
		palavras += 1;
	}
}

void indice (double letras, double palavras, double frases){
	double Coleman_Liau{};
	double L{}, S{};
	
	L = (letras / palavras) * 100;
	S = (frases / palavras) * 100;
	
	Coleman_Liau = 0.0588 * L - 0.296 * S - 15.8;
	
	if(Coleman_Liau <= 0){
		Coleman_Liau = 1;
		std::cout<<"\nGrade: "<<Coleman_Liau;
	}
		else if(Coleman_Liau >= 16){
			Coleman_Liau = 16;
			std::cout<<"\nGrade: "<<Coleman_Liau<<"+";
		}
			else{
				std::cout<<"\nGrade: "<<std::round(Coleman_Liau);
			}
}

int main(){
	double letras{}, palavras{}, frases{};
	std::string texto{};
	
	verificarTexto(letras, palavras, frases, texto);
	indice(letras, palavras, frases);
	
	return 0;
}
