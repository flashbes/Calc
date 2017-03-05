import static org.junit.Assert.*;

import org.junit.Test;

import Calculjator.a.Calc_oper;

public class test2 {

	@Test
	public void test() {
		double res = Calc_oper.C_op(10, "/", 5);//присваевается результат от метода C_op класса Calc_oper
		assertEquals(2,res,0);//сравнивается ожидаемый результат с результатом от метода C_op класса Calc_oper
	}

}
