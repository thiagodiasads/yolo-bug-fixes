package ts.jservice.pojo;

import java.util.ArrayList;

public class Equipamento {
	
	private int codigoEquipamento;
	private String marca;
	private String modelo;
	private String serial;
	private static ArrayList<Equipamento> equipamentlist;
	
	public Equipamento(int codigoEquipamento, String marca, String modelo,
			String serial) {
		super();
		this.codigoEquipamento = codigoEquipamento;
		this.marca = marca;
		this.modelo = modelo;
		this.serial = serial;
	}
	public Equipamento(){
		// TODO Auto-generated constructor stub
	}
	
	public void inicializedEquipaments (){
		equipamentlist = new ArrayList<Equipamento>();
		equipamentlist.add(new Equipamento(1,"HP","G42","1234567890"));
		equipamentlist.add(new Equipamento(2,"Dell","Inspiron 14R","0987654321bn"));
	}

	public static Equipamento findEquipamentoBySerial(String serial) {
		Equipamento aux = new Equipamento();
		aux.inicializedEquipaments();
		for (Equipamento equipamento : equipamentlist) {
			if(equipamento.getSerial().equals(serial))
			aux = equipamento;
			System.out.println(aux.getCodigoEquipamento());
		}
		return aux;
	}

	public int getCodigoEquipamento() {
		return codigoEquipamento;
	}
	
	public String getSerial() {
		return serial;
	}

	

}
