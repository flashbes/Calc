import static org.junit.Assert.*;

import org.junit.Test;

import Calculjator.a.Calc_oper;

public class Test_1_summ {

	@Test //Аннотация @Test определяет что метод является тестовым.
	public void testSumma() {
		double res = Calc_oper.C_op(1, "+", 9);//присваевается результат от метода C_op класса Calc_oper
		assertEquals(10,res,0);//сравнивается ожидаемый результат с результатом от метода C_op класса Calc_oper
	}

}
