import static org.junit.Assert.*;

import org.junit.Test;

import Calculjator.a.Calc_oper;

public class test2 {

	@Test
	public void test() {
		double res = Calc_oper.C_op(10, "/", 2);//������������� ��������� �� ������ C_op ������ Calc_oper
		assertEquals(5,res,0);//������������ ��������� ��������� � ����������� �� ������ C_op ������ Calc_oper
	}

}
