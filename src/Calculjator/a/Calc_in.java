package Calculjator.a;

import java.util.Scanner;

public class Calc_in {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);//создание переменной sc 
					//и применение класса Scanner для считывания данных из консоли 
		System.out.println("введите первое число и нажмите энтер");//вывод текста в окно консоли
			double x = sc.nextInt();//присваивание значения переменной х
		System.out.println("введите знак операции и нажмите энтер");//вывод текста в окно консоли
			String op = sc.next();	//присваивание знака операции переменной ор		
		System.out.println("введите второе число и нажмите энтер");//вывод текста в окно консоли
			double y = sc.nextInt();//присваивание значения переменной у
		sc.close();
		System.out.println("Ответ:"+ Calc_oper.C_op(x, op, y)); //вывод результата в окно консоли  
																//используя метод созданный в Calc_oper
	}
	
}


