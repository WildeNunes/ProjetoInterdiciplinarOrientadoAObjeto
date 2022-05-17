public class Viagens implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
public int codViagem; //Chave Primaria
public String destino;
public String data;
public String hora;
public float preco;
public Onibus CodOnibus; //Chave Estrangeira
public Motoristas RG; // Chave Estrangeira
  

public int getCodViagem() {
	return codViagem;
}


public void setCodViagem(int codViagem) {
	this.codViagem = codViagem;
}


public String getDestino() {
	return destino;
}


public void setDestino(String destino) {
	this.destino = destino;
}


public String getData() {
	return data;
}


public void setData(String data) {
	this.data = data;
}


public String getHora() {
	return hora;
}


public void setHora(String hora) {
	this.hora = hora;
}


public float getPreco() {
	return preco;
}


public void setPreco(float preco) {
	this.preco = preco;
}


public Onibus getCodOnibus() {
	return CodOnibus;
}


public void setCodOnibus(Onibus codOnibus) {
	CodOnibus = codOnibus;
}


public Motoristas getRG() {
	return RG;
}


public void setRG(Motoristas rG) {
	RG = rG;
}
public Viagens() {
	this.codViagem = 0;
	this.destino = "";
	this.data = "";
	this.hora = "";
	this.preco = 0f;
	
}


public Viagens(int codViagem, String destino, String data, String hora, float preco, Onibus codOnibus, Motoristas rG) {
	super();
	this.codViagem = codViagem;
	this.destino = destino;
	this.data = data;
	this.hora = hora;
	this.preco = preco;
	CodOnibus = codOnibus;
	RG = rG;
}

}
