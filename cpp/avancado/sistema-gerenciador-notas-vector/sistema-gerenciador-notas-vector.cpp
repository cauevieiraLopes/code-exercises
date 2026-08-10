#include <iostream>
#include <vector>

void menu (std::vector<double>&l){
	int opcao{};
	double nota{};
	bool v{}; //verificar se a lista não tem nota
	
	std::cout<<"============================"<<std::endl;
	std::cout<<"    GERENCIADOR DE NOTAS"<<std::endl;
	std::cout<<"============================"<<std::endl;
	std::cout<<"[1] Adicionar nota\n[2] Remover ultima nota\n[3] Ver primeira nota\n[4] Ver ultima nota\n[5] Total de notas\n[6] Lista esta vazia?\n[7] Limpar todas as notas\n[0] Sair"<<std::endl;
	std::cout<<"----------------------------"<<std::endl;
	
	do{
		do{
			std::cout<<"opção: ";
			std::cin>>opcao;
			if((opcao > 7)||(opcao < 0)){
				std::cout<<"Opção inválida, tente novamente!"<<std::endl;
			}	
		}while((opcao > 7)||(opcao < 0));
		
			//verificar se quer adicionar nota
			if(opcao == 1){
				do{
					std::cout<<"Digite a nota: ";
					std::cin>>nota;
					if((nota > 10)||(nota < 0)){
						std::cout<<"Adicione a nota em um intervalo válido (0 - 10)!"<<std::endl;
					}
				}while((nota > 10)||(nota < 0));
				std::cout<<"Nota "<<nota<<" adicionada."<<std::endl;
				l.push_back(nota);
			}
				//remover a ultima nota
				else if(opcao == 2){
					
					v = l.empty();
					
					if(v == 1){
						std::cout<<"A lista está vazia e não possui nenhum valor para remover!"<<std::endl;
					}
						else{
							std::cout<<"Ultima nota "<<l.back()<<" removida."<<std::endl;
							l.pop_back();
						}			
				}
					//ver a primeira nota
					else if(opcao == 3){
						v = l.empty();
						
						if(v == 1){
							std::cout<<"A lista está vazia e não possui nenhuma nota para exibir!"<<std::endl;
						}
							else{
								std::cout<<"Primeira nota: "<<l.front()<<std::endl;
							}
					}
						//ver a ultima nota
						else if(opcao == 4){
							v = l.empty();
							
							if(v == 1){
								std::cout<<"A lista está vazia e não possui nenhuma nota para exibir!"<<std::endl;
							}
								else{
									std::cout<<"ultima nota: "<<l.back()<<std::endl;
								}
						}
							//exibir o total de notas
							else if(opcao == 5){
								std::cout<<"Total de notas na lista: "<<l.size()<<std::endl;
							}
								//verificar se a lista está vazia
								else if(opcao == 6){
									v = l.empty();
									
									if(v == 1){
										std::cout<<"A lista está vazia? SIM"<<std::endl;
									}
										else{
											std::cout<<"A lista está vazia? NÃO"<<std::endl;
										}
								}
									//lIMPAR TODA A LISTA
									else if(opcao == 7){
										std::cout<<"Todas as notas foram removidas"<<std::endl;
										l.clear();
									}		
	}while(opcao != 0);
	
	std::cout<<"Encerrando programa. Até logo!";
}

int main(){
	int opcao{};
	
	std::vector<double>lista;
	
	menu(lista);
	
	return 0;
}
