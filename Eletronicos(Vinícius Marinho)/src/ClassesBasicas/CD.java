package ClassesBasicas;

import java.util.ArrayList;

public class CD {
	private String nomeDoAlbum, nomeDoArtista;
	private int ano;
	private ArrayList< Musica > musicas = new ArrayList< Musica >();
	
	
	public String getNomeDoAlbum() {
		return nomeDoAlbum;
	}
	public void setNomeDoAlbum(String nomeDoAlbum) {
		this.nomeDoAlbum = nomeDoAlbum;
	}
	public String getNomeDoArtista() {
		return nomeDoArtista;
	}
	public void setNomeDoArtista(String nomeDoArtista) {
		this.nomeDoArtista = nomeDoArtista;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public ArrayList<Musica> getMusicas() {
		return musicas;
	}
	public void setMusicas(Musica musica) {
		musicas.add(musica);
	}

}
