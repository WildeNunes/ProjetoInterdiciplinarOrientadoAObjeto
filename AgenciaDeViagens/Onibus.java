public class Onibus implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	public int codOnibus; //Chave Primaria
	public String placa;
	public String chassi;
	public String marca;
	public String modelo;
	public int noPoltronas;
	public String categoria;
	
	
	public int getCodOnibus() {
		return codOnibus;
	}


	public void setCodOnibus(int codOnibus) {
		this.codOnibus = codOnibus;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getChassi() {
		return chassi;
	}


	public void setChassi(String chassi) {
		this.chassi = chassi;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getNoPoltronas() {
		return noPoltronas;
	}


	public void setNoPoltronas(int noPoltronas) {
		this.noPoltronas = noPoltronas;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Onibus() {
		
		this.codOnibus = 0;
		this.placa = " ";
		this.chassi = " ";
		this.marca = " ";
		this.modelo = " ";
		this.noPoltronas = 0;
		this.categoria = " ";
		
}


	public Onibus(int codOnibus, String placa, String chassi, String marca, String modelo, int noPoltronas,
			String categoria) {
		super();
		this.codOnibus = codOnibus;
		this.placa = placa;
		this.chassi = chassi;
		this.marca = marca;
		this.modelo = modelo;
		this.noPoltronas = noPoltronas;
		this.categoria = categoria;
	}
	
	
	}
