package ClassesBasicas;

import java.util.ArrayList;

public class USBPlayer extends Player{
	private ArrayList< Musica > musicas = new ArrayList< Musica >();

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public void setMusicas(Musica musica) {
		musicas.add(musica);
	}
	
	public void play(Musica m) {
		setNumeroDaMusicaAtual(1);
		System.out.println("Executando a música: " + m.getNomeDaMusica());
	}
	
	public void avancarMusica() {
		int i = getNumeroDaMusicaAtual();
		if (i != getMusicas().size()){
			i = i + 1;
			System.out.println(i +" - "+ getMusicas().get(i-1).getNomeDaMusica()+" - "+ getMusicas().get(i-1).getNomeDoArtista());
			setNumeroDaMusicaAtual(i);
		}else{
			setNumeroDaMusicaAtual(1);
			System.out.println(1 +" - "+ getMusicas().get(0).getNomeDaMusica()+" - "+ getMusicas().get(0).getNomeDoArtista());
		}
	}
	public void recuarMusica() {
		int i = getNumeroDaMusicaAtual();
		if (i != 1){
			i = i -1;
			System.out.println(i +" - "+ getMusicas().get(i-1).getNomeDaMusica() +" - "+ getMusicas().get(i-1).getNomeDoArtista());
			setNumeroDaMusicaAtual(i);
		}else{
			i = getMusicas().size();
			System.out.println(i +" - "+ getMusicas().get(i-1).getNomeDaMusica() +" - "+ getMusicas().get(i-1).getNomeDoArtista());
			setNumeroDaMusicaAtual(i);
		}
	}
}
