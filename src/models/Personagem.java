package models;

public class Personagem {
	
	
	
	public Personagem(String nickName,int ataque, int ataqueBonus, int defesa, int defesaBonus, int esquiva,
			int esquivaBonus, int ataqueMagico, int ataqueMagicoBonus, int defesaMagica, int defesaMagicaBonus,
			int vitalidade, int vitalidadeBonus, int vida, int vidaBonus, int destreza, int destrezaBonus, int gold,
			int xp) {
		super();
		this.ataque = ataque;
		this.ataqueBonus = ataqueBonus;
		this.defesa = defesa;
		this.defesaBonus = defesaBonus;
		this.esquiva = esquiva;
		this.esquivaBonus = esquivaBonus;
		this.ataqueMagico = ataqueMagico;
		this.ataqueMagicoBonus = ataqueMagicoBonus;
		this.defesaMagica = defesaMagica;
		this.defesaMagicaBonus = defesaMagicaBonus;
		this.vitalidade = vitalidade;
		this.vitalidadeBonus = vitalidadeBonus;
		this.vida = vida;
		this.vidaBonus = vidaBonus;
		this.destreza = destreza;
		this.destrezaBonus = destrezaBonus;
		this.gold = gold;
		this.xp = xp;
	}
	public Personagem(Object object, Object object2, Object object3) {
		// TODO Auto-generated constructor stub
	}
	private String nickName;
	private int ataque;
	private int ataqueBonus;
	private int defesa;
	private int defesaBonus;
	private int esquiva;
	private int esquivaBonus;
	private int ataqueMagico;
	private int ataqueMagicoBonus;
	private int defesaMagica;
	private int defesaMagicaBonus;
	private int vitalidade;
	private int vitalidadeBonus;
	private int vida;
	private int vidaBonus;
	private int destreza;
	private int destrezaBonus;
	private int gold;
	private int xp;
	
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getAtaqueBonus() {
		return ataqueBonus;
	}
	public void setAtaqueBonus(int ataqueBonus) {
		this.ataqueBonus = ataqueBonus;
	}
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	public int getDefesaBonus() {
		return defesaBonus;
	}
	public void setDefesaBonus(int defesaBonus) {
		this.defesaBonus = defesaBonus;
	}
	public int getEsquiva() {
		return esquiva;
	}
	public void setEsquiva(int esquiva) {
		this.esquiva = esquiva;
	}
	public int getEsquivaBonus() {
		return esquivaBonus;
	}
	public void setEsquivaBonus(int esquivaBonus) {
		this.esquivaBonus = esquivaBonus;
	}
	public int getAtaqueMagico() {
		return ataqueMagico;
	}
	public void setAtaqueMagico(int ataqueMagico) {
		this.ataqueMagico = ataqueMagico;
	}
	public int getAtaqueMagicoBonus() {
		return ataqueMagicoBonus;
	}
	public void setAtaqueMagicoBonus(int ataqueMagicoBonus) {
		this.ataqueMagicoBonus = ataqueMagicoBonus;
	}
	public int getDefesaMagica() {
		return defesaMagica;
	}
	public void setDefesaMagica(int defesaMagica) {
		this.defesaMagica = defesaMagica;
	}
	public int getDefesaMagicaBonus() {
		return defesaMagicaBonus;
	}
	public void setDefesaMagicaBonus(int defesaMagicaBonus) {
		this.defesaMagicaBonus = defesaMagicaBonus;
	}
	public int getVitalidade() {
		return vitalidade;
	}
	public void setVitalidade(int vitalidade) {
		this.vitalidade = vitalidade;
	}
	public int getVitalidadeBonus() {
		return vitalidadeBonus;
	}
	public void setVitalidadeBonus(int vitalidadeBonus) {
		this.vitalidadeBonus = vitalidadeBonus;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getVidaBonus() {
		return vidaBonus;
	}
	public void setVidaBonus(int vidaBonus) {
		this.vidaBonus = vidaBonus;
	}
	public int getDestreza() {
		return destreza;
	}
	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	public int getDestrezaBonus() {
		return destrezaBonus;
	}
	public void setDestrezaBonus(int destrezaBonus) {
		this.destrezaBonus = destrezaBonus;
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
		return "Jogador\n"+" Nick: " + nickName + " \n" +  "Ataque: " + ataque + " \n" +"Ataque Bonus: " + ataqueBonus +" \n" + "Defesa: "
				+ defesa + " \n" +"Defesa Bonus: " + defesaBonus + " \n" +"Esquiva: " + esquiva + " \n" +"Esquiva Bonus: " + esquivaBonus
				+ " \n" +"Ataque Mágico: " + ataqueMagico +" \n" + "Ataque Mágico Bonus: " + ataqueMagicoBonus + " \n" +"Defesa Mágica: "
				+ defesaMagica + " \n" +"Defesa Mágica Bonus: " + defesaMagicaBonus + " \n" +"Vitalidade: " + vitalidade
				+ " \n" +"Vitalidade Bonus: " + vitalidadeBonus + " \n" +"Vida: " + vida + " \n" +"Vida Bonus: " + vidaBonus + "Destreza: "
				+ destreza +" \n" + "Destreza Bonus: " + destrezaBonus +" \n" + "Gold: " + gold + "Experiencia: "+"\n"+"\n"+"\n";
	}
	
	
	
	
}
