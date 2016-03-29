package Teste;

import ClassesBasicas.AparelhoDeSom;
import ClassesBasicas.ControleRemotoUniversal;
import ClassesBasicas.DVD;
import ClassesBasicas.Televisao;

public class TesteControleRemoto {
public static void main(String[] args) {
	ControleRemotoUniversal cru = new ControleRemotoUniversal();
	AparelhoDeSom ads = new AparelhoDeSom("Sony", 60);
	Televisao tv = new Televisao();
	DVD dvd = new DVD();
	cru.ligar(ads);
	cru.ligar(tv);
	cru.ligar(dvd);
}
}
