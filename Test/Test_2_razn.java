import static org.junit.Assert.*;

import Calculjator.a.Calc_oper;

public class Test {

	@org.junit.Test
	public void test() {
		double res = Calc_oper.C_op(10, "-", 5);//������������� ��������� �� ������ C_op ������ Calc_oper
		assertEquals(5,res,0);//������������ ��������� ��������� � ����������� �� ������ C_op ������ Calc_oper
	}

}
