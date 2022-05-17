public class Reservas implements java.io.Serializable{
		
	private static final long serialVersionUID = 1L;
	
			public Usuarios RG; //Chave Estrangeira
			public Viagens codViagem; //Chave Estrangeira
			public int poltrona;
			
			public Usuarios getRG() {
				return RG;
			}
			public void setRG(Usuarios rG) {
				RG = rG;
			}
			public Viagens getCodViagem() {
				return codViagem;
			}
			public void setCodViagem(Viagens codViagem) {
				this.codViagem = codViagem;
			}
			public int getPoltrona() {
				return poltrona;
			}
			public void setPoltrona(int poltrona) {
				this.poltrona = poltrona;
			}
			public Reservas() {
				this.poltrona = 0;
				
			}
			public Reservas(Usuarios rG, Viagens codViagem, int poltrona) {
				super();
				this.RG = rG;
				this.codViagem = codViagem;
				this.poltrona = poltrona;
			}
			
			
}
