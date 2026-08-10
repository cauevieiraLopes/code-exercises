#include <iostream>



int main(){


int quantidade, nota;


std::cout << "Quantas notas deseja registrar?" << std::endl << "Quantidade: ";

std::cin >> quantidade;


int* notas = new int[quantidade];


std::cout << std::endl;


for(int i = 0; i < quantidade; i++){


std::cout << i + 1 << "° nota: ";

std::cin >> nota;


notas[i] = nota;

}


std::cout << std::endl;


for(int i = 0; i < quantidade; i++){


std::cout << notas[i] << " ";

}


//--------------------------------

// liberação de memória e deixando

// o ponteiro com valor nulo

//--------------------------------


delete[] notas;


notas = nullptr;


if(notas == nullptr){


std::cout << "\n\nmemória liberada com sucesso!";

}

else{


std::cout << "\n\npossui lixo na memória!";

}


return 0;

} 

