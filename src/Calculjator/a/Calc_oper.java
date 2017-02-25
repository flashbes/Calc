package Calculjator.a;

public class Calc_oper {

	public static double C_op(double a, String op, double b) { //создание метода C_op с входными переменными 
															   //а,ор,b
		double res = 0; //присваивание нулевого значения перменной res
		switch(op){ //переменная ор используется для сравнения
		case "+": res = a + b;//при совпадении значения переменной ор со значением команды case выполнится данная строка
							break;//передача управления к концу команды switch
		case "-": res = a - b;
							break;
		case "*": res = a * b;
							break;
		case "/": res = a / b;
							break;
		}
		return res;//возврат значения res методом С_op

	}

}
