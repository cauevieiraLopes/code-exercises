#include <iostream>
#include <ctime>
#include <cstdlib>

struct Pessoa {
	Pessoa* pai;
	Pessoa* mae;
	char alelos[2];
};

void gerarAlelo(char& r) {
	int i = rand() % 3;
	
	if(i == 0) {
		r = 'A';
	}
	
	else if(i == 1) {
		r = 'B';
	}
	
	else if (i == 2){
		r = 'O';	
	}
}

void sortearAlelos(int& i) {
	i = rand() % 2;
}

Pessoa* criarFamilia(int geracao) {
	if(geracao <= 0) {
		return nullptr;
	}

  //a criação desta função foi feita com auxilio de IA
	Pessoa* novoIndividuo = new Pessoa;
	
	novoIndividuo->pai = criarFamilia(geracao - 1);
	novoIndividuo->mae = criarFamilia(geracao - 1);
	
	if(novoIndividuo->pai == nullptr &&	novoIndividuo->mae == nullptr) {
		char r = {};
		
		gerarAlelo(r);
		novoIndividuo->alelos[0] = r;
		
		gerarAlelo(r);
		novoIndividuo->alelos[1] = r;
	}
	
	else{
		int i = {};
		
		sortearAlelos(i);
		novoIndividuo->alelos[0] = novoIndividuo->pai->alelos[i];
		
		sortearAlelos(i);
		novoIndividuo->alelos[1] = novoIndividuo->mae->alelos[i];
	}
	
	return novoIndividuo;
}

void imprimirFamilia(Pessoa* p, int recuo = 0) {
    if (p == nullptr) return;

    for (int i = 0; i < recuo; i++) std::cout << "  ";

    std::cout << "Pessoa: " << p->alelos[0] << p->alelos[1] << '\n';

    imprimirFamilia(p->pai, recuo + 1);
    imprimirFamilia(p->mae, recuo + 1);
}

void liberarFamilia(Pessoa* p) {
    if (p == nullptr) return;

    liberarFamilia(p->pai);
    liberarFamilia(p->mae);

    delete p;
}


int main() {
	srand(time(NULL));
	
	Pessoa* individuo = criarFamilia(3);
	
	imprimirFamilia(individuo);
	
	liberarFamilia(individuo);
	
	return 0;
}
