package ts.jservice;

public class OrdemDeServico {

	private int cliente;
	private int equipamento;
	private String problema;
	private int id_os;

	public OrdemDeServico(int cliente, int equipamento, String descricao, int id_os) {
		super();
		this.cliente = cliente;
		this.equipamento = equipamento;
		this.problema = descricao;
		this.id_os = id_os;
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

	@Override
	public String toString() {
		return String.format(
				"OrdemDeServico [cliente=%s, equipamento=%s, descricao=%s]",
				cliente, equipamento, problema);
	}

}
