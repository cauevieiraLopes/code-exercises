#include <iostream>
#include <string>
#include <vector>

//função para receber as palavras dos jogadores
void inicializacao (std::string p[2][1]){
	//menu e explicação
	std::cout<<"===== Scrabble ====="<<std::endl;
	std::cout<<"No jogo Scrabble, os jogadores criam palavras para marcar pontos e o número de pontos é a soma dos valores dos pontos de cada letra da palavra (só pode ser usado uma palavra)."<<std::endl;
	std::cout<<"\nA | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q  | R | S | T | U | V | W | X | Y | Z"<<std::endl<<"1 | 3 | 3 | 2 | 1 | 4 | 2 | 4 | 1 | 8 | 5 | 1 | 3 | 1 | 1 | 3 | 10 | 1 | 1 | 1 | 1 | 4 | 4 | 8 | 4 | 10"<<std::endl;
	
	//partida
	int j = 1; //número do jogador
	std::string s{}; //receber as palavras dos jogadores;
	
	for(int i = 0; i <= 1; i++){
		std::cout<<"\nJogador "<<j<<std::endl;
		std::cout<<"Palavra: ";
		std::cin>>s;
		p[i][0] = s;
		j++;
	}	
}

//função para converter as palavras em caracteres e depois somar os pontos
void pontos (std::string palavra[2][1], int pontos[2][1]){
	
	//jogador 1
	std::vector<char>letras(palavra[0][0].begin(), palavra[0][0].end()); //ler a palavra do array e separar por caracter
	
	for(char i : letras){
		if((i == 'A' || i == 'a')||(i == 'E' || i == 'e')||(i == 'I' || i == 'i')||(i == 'L' || i == 'l')||(i == 'N' || i == 'n')||(i == 'O' || i == 'o')){
			pontos[0][0] += 1;
		}
			else if((i == 'R' || i == 'r')||(i == 'S' || i == 's')||(i == 'T' || i == 't')||(i == 'U' || i == 'u')){
				pontos[0][0] += 1;
			}
				else if((i == 'D' || i == 'd')||(i == 'G' || i == 'g')){
					pontos[0][0] += 2;
				}
					else if((i == 'C' || i == 'c')||(i == 'B' || i == 'b')||(i == 'M' || i == 'm')||(i == 'P' || i == 'p')){
						pontos[0][0] += 3;
					}
						else if((i == 'F' || i == 'f')||(i == 'H' || i == 'h')||(i == 'V' || i == 'v')||(i == 'W' || i == 'w')||(i == 'Y' || i == 'y')){
							pontos[0][0] += 4;
						}
							else if((i == 'K' || i == 'k')){
								pontos [0][0] += 5;
							}
								else if((i == 'J' || i == 'j')||(i == 'X' || i == 'x')){
									pontos[0][0] += 8;
								}
									else if((i == 'Q' || i == 'q')||(i == 'Z' || i == 'z')){
										pontos[0][0] += 10;
									}
	}
	
	//jogador 2
	
	std::vector<char>letras2(palavra[1][0].begin(), palavra[1][0].end()); //ler a palavra do array e separar por caracter
	
	for(char i : letras2){ //letras de 1 ponto
		if((i == 'A' || i == 'a')||(i == 'E' || i == 'e')||(i == 'I' || i == 'i')||(i == 'L' || i == 'l')||(i == 'N' || i == 'n')||(i == 'O' || i == 'o')){
			pontos[1][0] += 1;
		}
			else if((i == 'R' || i == 'r')||(i == 'S' || i == 's')||(i == 'T' || i == 't')||(i == 'U' || i == 'u')){
				pontos[1][0] += 1;
			}
				else if((i == 'D' || i == 'd')||(i == 'G' || i == 'g')){
					pontos[1][0] += 2;
				}
					else if((i == 'C' || i == 'c')||(i == 'B' || i == 'b')||(i == 'M' || i == 'm')||(i == 'P' || i == 'p')){
						pontos[1][0] += 3;
					}
						else if((i == 'F' || i == 'f')||(i == 'H' || i == 'h')||(i == 'V' || i == 'v')||(i == 'W' || i == 'w')||(i == 'Y' || i == 'y')){
							pontos[1][0] += 4;
						}
							else if((i == 'K' || i == 'k')){
								pontos [1][0] += 5;
							}
								else if((i == 'J' || i == 'j')||(i == 'X' || i == 'x')){
									pontos[1][0] += 8;
								}
									else if((i == 'Q' || i == 'q')||(i == 'Z' || i == 'z')){
										pontos[1][0] += 10;
									}
	}
	
	//verificar vencedor
	std::cout<<"\n===== RESULTADO ====="<<std::endl;
	std::cout<<"Jogador 1: ";
	for(char i : letras){
		std::cout<<i<< " ";
	}
	std::cout<<"\nPontos: "<<pontos[0][0];
	
	std::cout<<"\n\nJogador 2: ";
	for(char i : letras2){
		std::cout<<i<< " ";
	}
	std::cout<<"\nPontos: "<<pontos[1][0]<<std::endl<<std::endl;
	
	if(pontos[0][0] > pontos[1][0]){
		std::cout<<"Vencedor: Jogador 1";
	}
		else if(pontos[0][0] < pontos[1][0]){
			std::cout<<"Vencedor: Jogador 2";
		}
			else if(pontos[0][0] == pontos[1][0]){
				std::cout<<"Vencedor: EMPATE !";
			}	
}//final da função

int main(){
	std::string palavra[2][1];
	int ponto[2][1] = {{0},{0}};

	inicializacao(palavra);//Obter as palavras
	pontos(palavra, ponto);//receber os pontos
	
	return 0;
}
