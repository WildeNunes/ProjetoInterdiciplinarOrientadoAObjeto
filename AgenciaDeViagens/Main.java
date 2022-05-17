import java.util.ArrayList;

	public class Main {

	static ArrayList<Motoristas>moto = new ArrayList<Motoristas>();
	static ArrayList<Usuarios>usu = new ArrayList<Usuarios>();
	static ArrayList<Viagens>viag = new ArrayList<Viagens>();
	static ArrayList<Onibus>bus = new ArrayList<Onibus>();
	static ArrayList<Reservas>res = new ArrayList<Reservas>();
	
	public static void main(String[] args) {		
				
		Main cadMoto = new Main();

		Motoristas moto1 = new Motoristas(111111111, "João", "1111-1111");
		Motoristas moto2 = new Motoristas(222222222, "José", "2222-2222");
		Motoristas moto3 = new Motoristas(333333333, "Manoel", "3333-3333");
		Motoristas moto4 = new Motoristas(444444444, "Maria", "4444-4444");
		
		cadMoto.insereMotorista(moto1);
		cadMoto.insereMotorista(moto2);
		cadMoto.insereMotorista(moto3);
		cadMoto.insereMotorista(moto4);		
		
		Main cadUsu = new Main();

		Usuarios usu1 = new Usuarios(111111111, "Joaquin", "1111-1111");
		Usuarios usu2 = new Usuarios(222222222, "Francisco", "2222-2222");
		Usuarios usu3 = new Usuarios(333333333, "Manolo", "3333-3333");
		Usuarios usu4 = new Usuarios(444444444, "Alcides", "4444-4444");
		
		cadUsu.insereUsuario(usu1);
		cadUsu.insereUsuario(usu2);
		cadUsu.insereUsuario(usu3);
		cadUsu.insereUsuario(usu4);				
				
		Main cadOni = new Main();

		Onibus Oni1 = new Onibus (1, "AAA-1111", "BR111111111", "VOLKSVAGEM", "PLUS", 1, "LUXO");
		Onibus Oni2 = new Onibus (2, "BBB-2222", "BR222222222", "FORD", "MAX", 2, "ECONOMICA");
		Onibus Oni3 = new Onibus (3, "CCC-3333", "BR333333333", "SCANIA", "EXPRESS", 3, "CLASSE A");
		Onibus Oni4 = new Onibus (4, "DDD-4444", "BR444444444", "MERCEDES", "MEGA", 1, "LUXO");
		
		cadOni.insereOnibus(Oni1);
		cadOni.insereOnibus(Oni2);
		cadOni.insereOnibus(Oni3);
		cadOni.insereOnibus(Oni4);		
		
		Main cadVia = new Main();

		Viagens viag1 = new Viagens (1, "Caribe", "01/01/01", "00:00", (float)1.00, Oni1, moto1);
		Viagens viag2 = new Viagens (2, "Nova York", "02/02/02", "01:00", (float)2.50, Oni2, moto2);
		Viagens viag3 = new Viagens (3, "Rio de Janeiro", "03/03/03", "02:00", (float)3.00, Oni3, moto3);
		Viagens viag4 = new Viagens (4, "São Paulo", "04/04/04", "03:00", (float)4.00, Oni4, moto4);
		
		cadVia.insereViagem(viag1);
		cadVia.insereViagem(viag2);
		cadVia.insereViagem(viag3);
		cadVia.insereViagem(viag4);
		
		Main cadRes = new Main();
		
		Reservas res1 = new Reservas (usu1,viag1, 1);
		Reservas res2 = new Reservas (usu2,viag2, 2);
		Reservas res3 = new Reservas (usu3,viag3, 3);
		Reservas res4 = new Reservas (usu4,viag4, 4);
		
		cadRes.insereReserva(res1);
		cadRes.insereReserva(res2);
		cadRes.insereReserva(res3);
		cadRes.insereReserva(res4);
		
		
		
		System.out.println("*MOTORISTAS*\nRG           NOME       TELEFONE");		
		for(int i =0; i < moto.size(); i++) {
			System.out.println(moto.get(i).getRG() + "    "+ moto.get(i).getNome() + "       " + moto.get(i).getTelefone());
		}		
		System.out.println("\n*USUARIOS*\nRG           NOME       TELEFONE");		
		for(int i =0; i < usu.size(); i++) {
				System.out.println(usu.get(i).getRG() + "    "+ usu.get(i).getNome() + "       " + usu.get(i).getTelefone());
			
		}
		System.out.println("\n*VIAGENS*\nCODIGO DA VIAGEM           DESTINO       DATA      HORA       PREÇO       CODIGO ONIBUS     RG MOTORISTA");		
		for(int i =0; i < viag.size(); i++) {
				System.out.println(viag.get(i).getCodViagem() + "                          "+ 
		viag.get(i).getDestino() + "       " + viag.get(i).getData() 
						+ "    " + viag.get(i).getHora() + "     " + viag.get(i).getPreco() + "  " + viag.get(i).getCodOnibus().codOnibus + "    " + viag.get(i).getRG().RG);
			
		}		
		System.out.println("\n*ONIBUS*\nCODIGO DO ONIBUS           PLACA       CHASSI        MARCA            MODELO         NUMERO POLTRONA       CATEGORIA");
		for(int i =0; i < bus.size(); i++) {
				System.out.println(bus.get(i).getCodOnibus() + "                          "+ bus.get(i).getPlaca() + "    " + bus.get(i).getChassi()
						+ "   "+ bus.get(i).getMarca() +"       " + bus.get(i).getModelo()+"           " + bus.get(i).getNoPoltronas()
						+"                     "+ bus.get(i).getCategoria());			
		}
		
		System.out.println("\n*RESERVAS*\nUSUARIO           CODIGO DA VIAGEM       POLTRONA");
		for(int i =0; i < res.size(); i++) {
				System.out.println(res.get(i).getRG().RG + "         " + res.get(i).getCodViagem().codViagem + "                      " + res.get(i).getPoltrona());
		}
		
				
			}
	public void insereMotorista(Motoristas novoMotorista) {
	moto.add(novoMotorista);	
	}		
	public void insereUsuario(Usuarios novoUsuario) {
	usu.add(novoUsuario);	
	}	
	public void insereViagem(Viagens novaViagem) {
	viag.add(novaViagem);			
	}	
	public void insereOnibus(Onibus novoOnibus) {
	bus.add(novoOnibus);			
	}
	public void insereReserva(Reservas novaReserva) {
	res.add(novaReserva);
	}
	
	
	
}
