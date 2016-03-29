package ClassesBasicas;


public class Player {
	private int numeroDaMusicaAtual;
	private float tempoAtual;

	public float getTempoAtual() {
		return tempoAtual;
	}

	public void setTempoAtual(float tempoAtual) {
		this.tempoAtual = tempoAtual;
	}

	public int getNumeroDaMusicaAtual() {
		return numeroDaMusicaAtual;
	}

	public void setNumeroDaMusicaAtual(int numeroDaMusicaAtual) {
		this.numeroDaMusicaAtual = numeroDaMusicaAtual;
	}

	public void play(Musica m) {
		setNumeroDaMusicaAtual(1);
		System.out.println("Executando a música: " + m.getNomeDaMusica());
	}

	public void stop() {
		setNumeroDaMusicaAtual(0);
		System.out.println("Player Parado");
	}

	public void avancarMusica() {
		CD cd = new CD();
		for (int i = 0; i < cd.getMusicas().size(); i++) {
			if (i == cd.getMusicas().size()) {
				System.out.println(i +" - "+ cd.getMusicas().get(i-1).getNomeDaMusica() +" - "+ cd.getMusicas().get(i-1).getNomeDoArtista());
				setNumeroDaMusicaAtual(i);
			}
		}
	}
	

	public void recuarMusica() {
		CD cd = new CD();
		int i = getNumeroDaMusicaAtual();
		i = i -1;
		System.out.println(i +" - "+ cd.getMusicas().get(i-1).getNomeDaMusica() +" - "+ cd.getMusicas().get(i-1).getNomeDoArtista());
		setNumeroDaMusicaAtual(i);
	}

}
