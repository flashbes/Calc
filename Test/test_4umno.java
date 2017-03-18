import static org.junit.Assert.*;

import org.junit.Test;

import Calculjator.a.Calc_oper;

public class test_4umno {

	@Test
	public void test() {
		double res = Calc_oper.C_op(12, "*", 5);//присваевается результат от метода C_op класса Calc_oper
		assertEquals(60,res,0);//сравнивается ожидаемый результат с результатом от метода C_op класса Calc_oper;
	}

}
