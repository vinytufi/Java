package testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.Vector;

public class TestarColecoes {

	public static int QTDOBJ = 100000;
	public static Integer elementoBusca = 9999;
	public static Random random = new Random();

	public static void main(String[] args) {
		Collection<Integer> arraylist = new ArrayList<>();
		Collection<Integer> vector = new Vector<>();
		Collection<Integer> linkedList = new LinkedList<>();
		Collection<Integer> set = new HashSet<>();
		Collection<Integer> treeset = new TreeSet<>();
		TestarColecoes[] t = new TestarColecoes[3];

		adicionar10000(arraylist);
		adicionar10000(vector);
		adicionar10000(linkedList);
		adicionar10000(set);
		adicionar10000(treeset);

		buscarElemento(arraylist, elementoBusca);
		buscarElemento(vector, elementoBusca);
		buscarElemento(linkedList, elementoBusca);
		buscarElemento(set, elementoBusca);
		buscarElemento(treeset, elementoBusca);

		buscarElementoPorIndex(arraylist, elementoBusca);
		buscarElementoPorIndex(vector, elementoBusca);
		buscarElementoPorIndex(linkedList, elementoBusca);
		
		contemElemento(arraylist, elementoBusca);
		contemElemento(vector, elementoBusca);
		contemElemento(linkedList, elementoBusca);

		ordenar((List) arraylist);
		ordenar((List) vector);
		ordenar((List) linkedList);

		removerMetade(arraylist);
		removerMetade(vector);
		removerMetade(linkedList);
		removerMetade(set);
		removerMetade(treeset);
	}

	public static void adicionar10000(Collection<Integer> colecao) {
		long tempo1 = System.currentTimeMillis();
		for (int i = 0; i < QTDOBJ; i++) {
			colecao.add(random.nextInt(QTDOBJ));
		}
		long tempo2 = System.currentTimeMillis();
		System.out.println("adicionar (" + colecao.getClass().getName() + ") :"
				+ (tempo2 - tempo1));
	}

	public static int buscarElemento(Collection<Integer> colecao, Integer busca) {
		int ret = -1;
		long tempo1 = System.currentTimeMillis();
		for (Integer i : colecao) {
			if (i == busca) {
				ret = i;
				break;
			}
		}
		long tempo2 = System.currentTimeMillis();
		System.out.println("buscarElemento (" + colecao.getClass().getName()
				+ ") : " + (tempo2 - tempo1));
		return ret;
	}

	public static Integer buscarElementoPorIndex(Collection<Integer> colecao,
			Integer index) {
		Integer ret = -1;
		long tempo1 = System.currentTimeMillis();
		if (colecao instanceof List) {
			List<Integer> lista = (List<Integer>) colecao;
			ret = lista.get(index);
		} else {
			ret = (Integer) colecao.toArray()[index];
		}
		long tempo2 = System.currentTimeMillis();
		System.out.println("buscarElementoPorIndex ("
				+ colecao.getClass().getName() + ") : " + (tempo2 - tempo1));
		return ret;
	}

	public static boolean contemElemento(Collection<Integer> colecao,
			Integer busca) {
		long tempo1 = System.currentTimeMillis();
		boolean ret = colecao.contains(busca);
		long tempo2 = System.currentTimeMillis();
		System.out.println("contemElemento (" + colecao.getClass().getName()
				+ ") : " + (tempo2 - tempo1));
		return ret;
	}

	public static void removerMetade(Collection<Integer> colecao) {
		long tempo1 = System.currentTimeMillis();
		for (int i = 0; i < (colecao.size() / 2); i++) {
			colecao.remove(i);
		}
		long tempo2 = System.currentTimeMillis();
		System.out.println("removerMetade(" + colecao.getClass().getName()
				+ ") : " + (tempo2 - tempo1));
	}

	public static void removerTudoIterator(Collection<Integer> colecao) {
		long tempo1 = System.currentTimeMillis();
		for (Iterator iterator = colecao.iterator(); iterator.hasNext();) {
			iterator.remove();
		}
		long tempo2 = System.currentTimeMillis();
		System.out.println("removerTudoIterator(" + colecao.getClass().getName()
				+ ") : " + (tempo2 - tempo1));
	}

	public static void ordenar(List<Integer> colecao) {
		long tempo1 = System.currentTimeMillis();
		Collections.sort(colecao);
		long tempo2 = System.currentTimeMillis();
		System.out.println("ordenar(" + colecao.getClass().getName() + ") : "
				+ (tempo2 - tempo1));
	}
}
