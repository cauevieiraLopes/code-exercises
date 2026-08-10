#include <iostream>
#include <string>

//Função de boas vindas
std::string boasvindas(){
	std::string name;
	std::cout<<"===== SISTEMA DE MÉDIA ====="<<std::endl;
	std::cout<<"Insira o nome do aluno: ";
	std::getline(std::cin, name);
	return name;
}

//receber as notas
float notas(float n){
	std::cout<<std::endl;
	std::cout<<"Insira a nota do aluno no campo abaixo."<<std::endl;
	
	do{
		if((n < 0) || (n > 10)){
			std::cout<<"A nota deve estar no intervalo de 0 e 10!"<<std::endl;		
		}
		std::cout<<"Nota: ";
		std::cin>>n;	
	}while((n < 0) || (n > 10));	
	
	return n;
}

//Campo de seleção de média
float media(float n1,float n2,float n3){
	char tipo;
	float resultado;
	
	std::cout<<"========== MÉDIA =========="<<std::endl;
	std::cout<<"Selecione o tipo de média:\n\n[A] - Média aritmética\n[P] - Ponderada\n[H] - Média harmônica"<<std::endl;
	std::cout<<std::endl;
	do{
		std::cout<<"Média: ";
		std::cin>>tipo;	
		if((tipo != 'A')&&(tipo != 'P')&&(tipo != 'H')){
			std::cout<<"Escolha uma opção válida!"<<std::endl;
		}
	}while((tipo != 'A')&&(tipo != 'P')&&(tipo != 'H'));
	
	switch(tipo){
		case 'A':
			resultado = (n1 + n2 + n3)/3;
			std::cout<<"Média selecionada: Média aritmética"<<std::endl;
			break;
			
		case 'P':
			n1 = n1 * 5;
			n2 = n2 * 3;
			n3 = n3 * 2;
			resultado = (n1 + n2 + n3)/10;
			std::cout<<"Média selecionada: Média Ponderada"<<std::endl;
			break;
			
		case 'H':
			resultado = (1/n1) + (1/n2) + (1/n3);
			resultado = 3 / resultado;
			std::cout<<"Média selecionada: Média harmônica"<<std::endl;
			break;
	}
	return resultado;
}

//exibição do resultado
void exibicao(float resultado, std::string name){
	std::cout<<std::endl;
	std::cout<<"===== RESULTADO ====="<<std::endl;
	std::cout<<"Nome do aluno: "<<name<<std::endl;
	std::cout<<"Resultado da média: "<<resultado;
}

//código principal
int main(){
	float nota1{}, nota2{}, nota3{}, mediaFinal{};
	std::string nome{};
	
	nome = boasvindas();
	std::cout<<std::endl<<"===== 1° UNIDADE =====";
	nota1 = notas(nota1);
	std::cout<<std::endl<<"===== 2° UNIDADE =====";
	nota2 = notas(nota2);
	std::cout<<std::endl<<"===== 3° UNIDADE =====";
	nota3 = notas(nota3);
	mediaFinal = media(nota1, nota2, nota3);
	exibicao(mediaFinal, nome);
	
	return 0;
}//final do int main
