package ts.jservice.pojo;

import java.util.ArrayList;

public class Cliente {

	private int codigoCliente;
	private String email;
	private String cpf;
	private static ArrayList<Cliente> clientlist;

	public Cliente(int codigoCliente, String cpf, String email) {
		super();
		this.codigoCliente = codigoCliente;
		this.email = email;
		this.cpf = cpf;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public void inicializedClients() {
		clientlist = new ArrayList<Cliente>();
		clientlist.add(new Cliente(1, "11122233344", "marco.mangan@gmail.com"));
		clientlist
				.add(new Cliente(2, "22233344455", "thiagodiasads@gmail.com"));
	}

	public static Cliente findClienteByEmail(String email) {
		Cliente aux = new Cliente();
		aux.inicializedClients();
		for (Cliente cliente : clientlist) {
			if (cliente.getEmail().equals(email))
				aux = cliente;
			System.out.println(aux.getCodigoCliente());
		}
		return aux;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public String getEmail() {
		return email;

	}

	public String getCpf() {
		return cpf;
	}

}
