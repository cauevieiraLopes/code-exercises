#include <iostream>

int main(){
	int alunos=0;
	float n1{},n2{},n3{}, media{}, mediaG{}, ap{}, rep{}, maiorM{}, menorM=10;
	
	std::cout<<"===== SISTEMA DE NOTAS =====\n"<<std::endl;
	do{
	
		std::cout<<"Informe a quantidade de alunos que serão cadastrados: ";
		std::cin>>alunos;
	}while(alunos <= 0); // verificar que tenha pelo menos 1 aluno
	
	for(int i = 1; i <= alunos; i++){
		std::cout<<"--- ALUNO "<<i<<" ---\n";
		do{
			std::cout<<"Nota 1:";
			std::cin>>n1;
			if(n1 > 10 || n1 < 0){
				std::cout<<"Nota inválida! Digite um valor entre 0 e 10.\n";
			}//mensagem para erro de nota
		}while(n1 > 10 || n1 < 0); //final da nota 1
		do{
			std::cout<<"Nota 2:";
			std::cin>>n2;
			if(n2 > 10 || n2 < 0){
				std::cout<<"Nota inválida! Digite um valor entre 0 e 10.\n";
			}//mensagem para erro de nota
		}while(n2 > 10 || n2 < 0); //final da nota 2
		do{
			std::cout<<"Nota 3:";
			std::cin>>n3;
			if(n3 > 10 || n3 < 0){
				std::cout<<"Nota inválida! Digite um valor entre 0 e 10.\n";
			}//mensagem para erro de nota
		}while(n3 > 10 || n3 < 0); //final da nota 3
		
		media = (n1 + n2 + n3)/3; //media do aluno
		mediaG += media; //acrescentar media total
		
		if(media > maiorM){ //verificar a ,maior media
			maiorM = media;
		}
		if(media < menorM) //verifar menor media
		{
			menorM = media;
		}
		
		std::cout<<"Media do aluno: "<<media<<std::endl; //exibir resultado
		if(media < 6){
			std::cout<<"Situação: Reprovado (a)\n"<<std::endl;
			rep++;
		}
			else{
				std::cout<<"Situação: Aprovado (a)\n"<<std::endl;
				ap++;
			}
	}//final do ciclo de repetição
	
	mediaG = mediaG / alunos;
	
	std::cout<<"===== RESULTADO FINAL =====\n";
	std::cout<<"Média geral da turma: "<<mediaG<<std::endl;
	std::cout<<"Total de aprovados: "<<ap<<std::endl;
	std::cout<<"Total de reprovados: "<<rep<<std::endl;
	std::cout<<"Maior média: "<<maiorM<<std::endl;
	std::cout<<"Menor média: "<<menorM<<std::endl;
	
	return 0;
}//Final do int main
