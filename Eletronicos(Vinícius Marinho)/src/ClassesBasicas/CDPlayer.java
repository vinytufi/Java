package ClassesBasicas;

public class CDPlayer extends Player{
	private CD cd;

	public CD getCd() {
		return cd;
	}

	public void setCd(CD cd) {
		this.cd = cd;
	}
	
	public void colocarCD(CD cd){
		setCd(cd);
		System.out.println("Foi colocado o CD de " + getCd().getNomeDoArtista());
	}
	
	public void tirarCD(){
		System.out.println("Foi tirado o CD de " + getCd().getNomeDoArtista());
		setCd(null);
	}
}
