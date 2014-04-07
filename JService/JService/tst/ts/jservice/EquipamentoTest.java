package ts.jservice;

import static org.junit.Assert.*;

import org.junit.Test;

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
