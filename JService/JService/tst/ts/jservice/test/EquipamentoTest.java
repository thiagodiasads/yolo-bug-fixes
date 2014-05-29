package ts.jservice.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ts.jservice.pojo.Equipamento;

public class EquipamentoTest {
	
	@Test
	public void testGetEquipamentoSerial(){
		Equipamento equipamento = null;
		equipamento = Equipamento.findEquipamentoBySerial("1234567890");
		int actual = equipamento.getCodigoEquipamento();
		int expected = 1;
		assertEquals(expected, actual);

	}

}
