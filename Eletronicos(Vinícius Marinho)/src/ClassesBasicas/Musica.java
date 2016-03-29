package ClassesBasicas;

public class Musica {

	private String nomeDaMusica;
	private String nomeDoArtista, compositor;
	private float tempo;
	
	
	
	public Musica(String nomeDaMusica, String nomeDoArtista, String compositor, float tempo) {
		this.nomeDaMusica = nomeDaMusica;
		this.nomeDoArtista = nomeDoArtista;
		this.compositor = compositor;
		this.tempo = tempo;
	}
	public String getNomeDoArtista() {
		return nomeDoArtista;
	}
	public void setNomeDoArtista(String nomeDoArtista) {
		this.nomeDoArtista = nomeDoArtista;
	}
	public String getCompositor() {
		return compositor;
	}
	public void setCompositor(String compositor) {
		this.compositor = compositor;
	}
	public float getTempo() {
		return tempo;
	}
	public void setTempo(float tempo) {
		this.tempo = tempo;
	}
	public String getNomeDaMusica() {
		return nomeDaMusica;
	}
	public void setNomeDaMusica(String nomeDaMusica) {
		this.nomeDaMusica = nomeDaMusica;
	}

}
