public class Motoristas implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
public int RG; //Chave Primaria
public String nome;
public String telefone;

public int getRG() {
	return RG;
}
public void setRG(int rG) {
	RG = rG;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public Motoristas() {
	this.RG = 0;
	this.nome = "";
	this.telefone = "";
}
public Motoristas(int rG, String nome, String telefone) {
	super();
	RG = rG;
	this.nome = nome;
	this.telefone = telefone;
}
}
