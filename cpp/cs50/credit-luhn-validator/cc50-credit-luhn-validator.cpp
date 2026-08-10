#include <iostream>
#include <string>

int main(){
	
	int prefixo{}, num1{}, num2{}, num3{}, num4{}, num5{}, num6{},num7{}, num8{}, r1{}, r2{}, r3{}, r4{}, r5{}, r6{}, r7{}, r8{}, validador{};
	long long cartao{};
	std:: string tipo_cartao{};
	
	std::cout<<"Insira o número do cartão (mínimo de 13 digitos): ";
	std::cin>>cartao;
	
	//verificar se o cartão tem 13 digitos para visa
	if((cartao > 1000000000000)&&(cartao < 10000000000000)){//se o cartão for maior que 13 digitos e menor que 14 digitos
		prefixo = cartao % 10000000000000 / 1000000000000;
		if(prefixo == 4){//verificar se o último número é 4 para ser visa
			tipo_cartao = "VISA";
		}
			else{
				tipo_cartao = "INVÁLIDO";
			}
			
			//separar os 2° números e multiplicar por 2
			num1 = cartao % 100 / 10 * 2;
			num2 = cartao % 10000 / 1000 * 2;
			num3 = cartao % 1000000 / 100000 * 2;
			num4 = cartao % 100000000 / 10000000 * 2;
			num5 = cartao % 10000000000 / 1000000000 * 2;
			num6 = cartao % 1000000000000 / 100000000000 * 2;
			
			//separar o restante dos números
			r1 = cartao % 10;
			r2 = cartao % 1000 / 100;
			r3 = cartao % 100000 / 10000;
			r4 = cartao % 10000000 / 1000000;
			r5 = cartao % 1000000000 / 100000000;
			r6 = cartao % 100000000000 / 10000000000;
			r7 = cartao % 10000000000000 / 1000000000000;
			
			//verificar se os números multiplicados por 2 é maior que 9 e somar suas unidades
			if(num1 > 9){
				num1 = (num1 % 10) + (num1 % 100 / 10);
			}
			if(num2 > 9){
				num2 = (num2 % 10) + (num2 % 100 / 10);
			}
			if(num3 > 9){
				num3 = (num3 % 10) + (num3 % 100 / 10);
			}
			if(num4 > 9){
				num4 = (num4 % 10) + (num4 % 100 / 10);
			}
			if(num5 > 9){
				num5 = (num5 % 10) + (num5 % 100 / 10);
			}
			if(num6 > 9){
				num6 = (num6 % 10) + (num6 % 100 / 10);
			}
			
			//validar se o cartão é válido
			validador = num1 + num2 + num3 + num4 + num5 + num6 + r1 + r2 + r3 + r4 + r5 + r6 + r7;
			
			if(validador % 10 == 0){
				std::cout<<tipo_cartao<<std::endl;
				std::cout<<"Cartão Válido";
			}
				else{
					std::cout<<tipo_cartao<<std::endl;
					std::cout<<"Cartão Inválido";
				}
			
	}//final da verificação visa
	
	if((cartao > 100000000000000)&&(cartao < 1000000000000000)){//verificar se é maior que 15 digitos e menor que 16 digitos (American Express)
		prefixo = cartao % 1000000000000000 / 10000000000000; //validar os 2 primeiros números (esquerda para direita)
		if((prefixo == 34) || (prefixo == 37)){ //VALIDAR SE O CARTÃO É DO AMERICAN EXPRESS
			tipo_cartao = "AMERICAN EXPRESS";
		}
			else{
				tipo_cartao = "INVÁLIDO";
			}
			
		//separar os dois primeiros números e multiplicar
		num1 = cartao % 100 / 10 * 2;
		num2 = cartao % 10000 / 1000 * 2;
		num3 = cartao % 1000000 / 100000 * 2;
		num4 = cartao % 100000000 / 10000000 * 2;
		num5 = cartao % 10000000000 / 1000000000 * 2;
		num6 = cartao % 1000000000000 / 100000000000 * 2;
		num7 = cartao % 100000000000000 / 10000000000000 * 2;
		
		//separar o restante dos números
		r1 = cartao % 10;
		r2 = cartao % 1000 / 100;
		r3 = cartao % 100000 / 10000;
		r4 = cartao % 10000000 / 1000000;
		r5 = cartao % 1000000000 / 100000000;
		r6 = cartao % 100000000000 / 10000000000;
		r7 = cartao % 10000000000000 / 1000000000000;
		r8 = cartao % 1000000000000000 / 100000000000000;
		
		//verificar se os números multiplicados por 2 é maior que 9 e somar suas unidades
		if(num1 > 9){
			num1 = (num1 % 10) + (num1 % 100 / 10);
		}
		if(num2 > 9){
			num2 = (num2 % 10) + (num2 % 100 / 10);
		}
		if(num3 > 9){
			num3 = (num3 % 10) + (num3 % 100 / 10);
		}
		if(num4 > 9){
			num4 = (num4 % 10) + (num4 % 100 / 10);
		}
		if(num5 > 9){
			num5 = (num5 % 10) + (num5 % 100 / 10);
		}
		if(num6 > 9){
			num6 = (num6 % 10) + (num6 % 100 / 10);
		}
		if(num7 > 9){
			num7 = (num7 % 10) + (num7 % 100 / 10);
		}		
		
		//validar se o cartão é válido
		validador = num1 + num2 + num3 + num4 + num5 + num6 + num7 + r1 + r2 + r3 + r4 + r5 + r6 + r7 + r8;
		
		if(validador % 10 == 0){
			std::cout<<tipo_cartao<<std::endl;
			std::cout<<"Cartão Válido";
		}
			else{
				std::cout<<tipo_cartao<<std::endl;
				std::cout<<"Cartão Inválido";
			}
			
	}//final do american express
	
	if((cartao >1000000000000000) && (cartao < 10000000000000000)){//verificar se o cartão é maior de 16 digitos e menor que 17 (Master card ou Visa)
		if((prefixo = cartao % 10000000000000000 / 100000000000000 == 51) || (prefixo = cartao % 10000000000000000 / 100000000000000 == 52) || (prefixo = cartao % 10000000000000000 / 100000000000000 == 53) || (prefixo = cartao % 10000000000000000 / 100000000000000 == 54) || (prefixo = cartao % 10000000000000000 / 100000000000000 == 55)){
			tipo_cartao = "MASTER CARD";
		}//final da validação master card
			else if((prefixo = cartao % 10000000000000000 / 1000000000000000 == 4)){
				tipo_cartao = "VISA";
			}//final da validação Visa
				else{
					tipo_cartao = "INVÁLIDO";
				}
		
		//separar os dois primeiros números e multiplicar
		num1 = cartao % 100 / 10 * 2;
		num2 = cartao % 10000 / 1000 * 2;
		num3 = cartao % 1000000 / 100000 * 2;
		num4 = cartao % 100000000 / 10000000 * 2;
		num5 = cartao % 10000000000 / 1000000000 * 2;
		num6 = cartao % 1000000000000 / 100000000000 * 2;
		num7 = cartao % 100000000000000 / 10000000000000 * 2;
		num8 = cartao % 10000000000000000 / 1000000000000000 * 2;
		
		//separar o restante dos números
		r1 = cartao % 10;
		r2 = cartao % 1000 / 100;
		r3 = cartao % 100000 / 10000;
		r4 = cartao % 10000000 / 1000000;
		r5 = cartao % 1000000000 / 100000000;
		r6 = cartao % 100000000000 / 10000000000;
		r7 = cartao % 10000000000000 / 1000000000000;
		r8 = cartao % 1000000000000000 / 100000000000000;
		
		//verificar se os números multiplicados por 2 é maior que 9 e somar suas unidades
		if(num1 > 9){
			num1 = (num1 % 10) + (num1 % 100 / 10);
		}
		if(num2 > 9){
			num2 = (num2 % 10) + (num2 % 100 / 10);
		}
		if(num3 > 9){
			num3 = (num3 % 10) + (num3 % 100 / 10);
		}
		if(num4 > 9){
			num4 = (num4 % 10) + (num4 % 100 / 10);
		}
		if(num5 > 9){
			num5 = (num5 % 10) + (num5 % 100 / 10);
		}
		if(num6 > 9){
			num6 = (num6 % 10) + (num6 % 100 / 10);
		}
		if(num7 > 9){
			num7 = (num7 % 10) + (num7 % 100 / 10);
		}
		if(num8 > 9){
			num8 = (num8 % 10) + (num8 % 100 / 10);
		}	
		
		//validar se o cartão é válido
		validador = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + r1 + r2 + r3 + r4 + r5 + r6 + r7 + r8;
		
		if(validador % 10 == 0){
			std::cout<<tipo_cartao<<std::endl;
			std::cout<<"Cartão Válido";
		}	
			else{
				std::cout<<tipo_cartao<<std::endl;
				std::cout<<"Cartão Inválido";
			}
		
	}// final da verificação de 16 digitos
	return 0;
}//Final da linha MAIN
