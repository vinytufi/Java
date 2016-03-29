package ClassesBasicas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Jogo {

	@Id
	@Column(name = "jogo_id")
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlacar1() {
		return placar1;
	}

	public void setPlacar1(int placar1) {
		this.placar1 = placar1;
	}

	public int getPlacar2() {
		return placar2;
	}

	public void setPlacar2(int placar2) {
		this.placar2 = placar2;
	}

	public String getDataDoJogo() {
		return dataDoJogo;
	}

	public void setDataDoJogo(String dataDoJogo) {
		this.dataDoJogo = dataDoJogo;
	}

	public Juiz getJuiz() {
		return juiz;
	}

	public void setJuiz(Juiz juiz) {
		this.juiz = juiz;
	}

	public Time getTimecasa() {
		return timecasa;
	}

	public void setTimecasa(Time timecasa) {
		this.timecasa = timecasa;
	}

	public Time getTimevisitante() {
		return timevisitante;
	}

	public void setTimevisitante(Time timevisitante) {
		this.timevisitante = timevisitante;
	}
	
	private int placar1;
	private int placar2;
	private String dataDoJogo;
	@OneToOne
	@JoinColumn(name = "juiz_id")
	private Juiz juiz;
	@OneToOne
	private Time timecasa;
	@OneToOne
	private Time timevisitante;;

}
