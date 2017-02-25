import static org.junit.Assert.*;

import org.junit.Test;

import Calculjator.a.Calc_oper;

public class Test_1 {

	@Test
	public void testSumma() {
		double res = Calc_oper.C_op(1, "+", 9);
		assertEquals(10,res,0);
	}

}
