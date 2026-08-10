#include <iostream>
#include <string>
#include <map>

void receberTexto (std::string& t){
	
	while(true){
		
		std::cout<<"Digite qualquer texto: ";
		std::getline(std::cin, t);
		
		if(t.empty()){
			
			std::cout<<"O texto está vazio, tente novamente...\n\n";
			continue;
		}
			else{
				break;
			}
	}
}

int main(){
	
	std::string texto = {};
	
	receberTexto(texto);
	
	std::map<char, int> caracteres;
	
	for(int i = 0; i < texto.size(); i++){
		caracteres[texto[i]]++;
	}
	
	for(auto itr = caracteres.begin(); itr != caracteres.end(); itr++){
		
		std::cout<<"Letra: "<<itr->first<<" | Quantidade: "<<itr->second<<std::endl;
	}
	
	
	return 0;
}
