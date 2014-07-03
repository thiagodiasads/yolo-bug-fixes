package ts.jservice.pojo;

public class OrdemDeServico {

	private int cliente;
	private int equipamento;
	private String problema;
	private int id_os;

	public OrdemDeServico(int cliente, int equipamento, String problema,
			int id_os) {
		this.cliente = cliente;
		this.equipamento = equipamento;
		this.problema = problema;
		this.id_os = id_os;
	}

	public OrdemDeServico(int cliente, int equipamento, String problema) {
		this(equipamento, cliente, problema, -1);
	}

	public OrdemDeServico() {
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	public void setEquipamento(int equipamento) {
		this.equipamento = equipamento;
	}

	public int getCliente() {
		return cliente;
	}

	public int getEquipamento() {
		return equipamento;
	}

	public String getDescricao() {
		return problema;
	}

	// Foi criado os get and set do novo atributo id_os.

	public int getId_os() {
		return id_os;
	}

	public void setId_os(int id_os) {
		this.id_os = id_os;

	}

	@Override
	public String toString() {
		return String.format(
				"OrdemDeServico [cliente=%s, equipamento=%s, descricao=%s]",
				cliente, equipamento, problema);
	}
}