package models;

public class bandido {
	public bandido(String nome, int vida, int defesa, int ataque, int esquiva, int destreza, int gold, int xp) {
		super();
		this.nome = nome;
		this.vida = vida;
		this.defesa = defesa;
		this.ataque = ataque;
		this.esquiva = esquiva;
		this.destreza = destreza;
		this.gold = gold;
		this.xp = xp;
	}
	private String nome;
	private int vida;
	private int defesa;
	private int ataque;
	private int esquiva;
	private int destreza;
	private int gold;
	private int xp;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getEsquiva() {
		return esquiva;
	}
	public void setEsquiva(int esquiva) {
		this.esquiva = esquiva;
	}
	public int getDestreza() {
		return destreza;
	}
	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
