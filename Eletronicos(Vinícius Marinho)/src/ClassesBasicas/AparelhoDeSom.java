package ClassesBasicas;

public class AparelhoDeSom extends Eletronico {
	private float potencia; 
	private String player;
	private int volume = 0;
	private String controleDeFuncao;
	
	
	
	public AparelhoDeSom(String marca, float potencia) {
		this.setMarca(marca);;
		this.setPotencia(potencia);
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}
	
	public String getControleDeFuncao() {
		return controleDeFuncao;
	}

	public void setControleDeFuncao(String controleDeFuncao) {
		this.controleDeFuncao = controleDeFuncao;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void aumentarVolume(){
		int volume = getVolume();
		if (volume >= 0 && volume < 20){
			volume = volume + 1;
			setVolume(volume);
		}else {
			System.out.println("Volume indisponível");
		}
		exibirMensagemNoDisplay();
	}
	public void diminuirVolume(){
		int volume = getVolume();
		if (volume > 0 && volume <= 20){
			volume = volume - 1;
			setVolume(volume);
		}else {
			System.out.println("Volume indisponível");
		}
		exibirMensagemNoDisplay();
	}
	public void alterarFuncao(){
		if (getControleDeFuncao().equals("CD")){
			setPlayer("CDPlayer");
		}else if (getControleDeFuncao().equals("USB")){
			setPlayer("USBPlayer");
		}else if (getControleDeFuncao().equals("Radio")){
			setPlayer(null);
		}
		exibirMensagemNoDisplay();
	}
	public void exibirMensagemNoDisplay(){
			System.out.println("Volume: " + getVolume());
			System.out.println("Funcao: " + getPlayer());
	}
	
}
