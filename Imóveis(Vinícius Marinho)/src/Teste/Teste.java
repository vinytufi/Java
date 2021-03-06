package Teste;

import Classes.Apartamento;
import Classes.Casa;
import Classes.Comodo;
import Classes.Condominio;
import Classes.Endereco;
import Classes.Garagem;
import Classes.Proprietario;

public class Teste {
public static void main(String[] args) {
	Endereco e1 = new Endereco( "Rua Berlim","32", "Afogados");
	Condominio c1 = new Condominio("Condom�nio Parque de Oliveiras",e1 ,"possui portaria","possui piscina");
	Endereco e11 = new Endereco( "Rua Berlim","32A", "Afogados");
	Garagem g1  = new Garagem("garagem coberta", 2);
	Proprietario p1 = new Proprietario("Carlos Alberto", "3445-3040");
	Casa a = new Casa("murada com dois pavimentos",e11, g1, p1);
	Comodo ca1 = new Comodo("dois quartos", 4);
	a.setComodos(ca1);
	Comodo ca2 = new Comodo("uma sala", 5);
	a.setComodos(ca2);
	Comodo ca3 = new Comodo("uma cozinha", 35/10);
	a.setComodos(ca3);
	c1.setCasas(a);
	Endereco e12 = new Endereco( "Rua Berlim","32B", "Afogados");
	Garagem g2  = new Garagem("garagem coberta", 3);
	Proprietario p2 = new Proprietario("Joaquim Rivieira", "n�o tem telefone");
	Casa b = new Casa("sem muro", e12, g2, p2);
	Comodo cb1 = new Comodo("tr�s quartos", 4);
	b.setComodos(cb1);
	Comodo cb2 = new Comodo("uma sala", 5);
	b.setComodos(cb2);
	Comodo cb3 = new Comodo("uma cozinha", 35/10);
	b.setComodos(cb3);
	Comodo cb4 = new Comodo("um terra�o", 12/10);
	b.setComodos(cb4);
	c1.setCasas(a);
	Endereco e2 = new Endereco("Av. Jo�o Borges","120", "Aurora");
	Condominio c2 = new Condominio("Condom�nio  Trio  Nordestino", e2, "n�o possui portaria","n�o possui piscina");
	Apartamento X = new Apartamento("Av. Jo�o Coutinho","120", "Aurora", 1301, "coberta", 1, "Manuela Gomes", "3232-1122");
	Comodo cX1 = new Comodo("sala", 12);
	X.setComodos(cX1);
	Comodo cX2 = new Comodo("dois quartos", 4);
	X.setComodos(cX2);
	Comodo cX3 = new Comodo("um outro quarto", 5);
	X.setComodos(cX3);
	Comodo cX4 = new Comodo("cozinha", 35/10);
	X.setComodos(cX4);
	Comodo cX5 = new Comodo("varanda", 144/100);
	X.setComodos(cX5);
	c2.setApartamentos(X);
	Apartamento Y = new Apartamento("Av. Jo�o Coutinho","120", "Aurora", 401, "coberta", 1, "Torquato Muniz", "3031-2300");
	Comodo cY1 = new Comodo("sala", 12);
	Y.setComodos(cY1);
	Comodo cY2 = new Comodo("dois quartos", 4);
	Y.setComodos(cY2);
	Comodo cY3 = new Comodo("cozinha", 35/10);
	Y.setComodos(cY3);
	Comodo cY4 = new Comodo("varanda", 144/100);
	Y.setComodos(cY4);
	c2.setApartamentos(Y);
	Apartamento Z = new Apartamento("Av. Jo�o Coutinho","120", "Aurora", 301, "coberta", 1, "K�tia Moura", "9903-2327");
	Comodo cZ1 = new Comodo("sala", 12);
	Z.setComodos(cZ1);
	Comodo cZ2 = new Comodo("dois quartos", 4);
	Z.setComodos(cZ2);
	Comodo cZ3 = new Comodo("cozinha", 35/10);
	Z.setComodos(cZ3);
	Comodo cZ4 = new Comodo("varanda", 144/100);
	Z.setComodos(cZ4);
	c2.setApartamentos(Z);
	System.out.println(c1.toString());
	System.out.println("\n" + c2.toString());
}
}
