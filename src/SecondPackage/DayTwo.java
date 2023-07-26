package SecondPackage;

public class DayTwo {
	public DayTwo(String name) {
		if(name.equals("jagan")) {
			System.out.println("hi jagan");
		}
		else {
			System.out.println("user invalid");
		}
	}
	
	public DayTwo() {
		System.out.println("Without parameters");
	}
	
	public void Add() {  
		int a = 10;
		int b=20;
		int c = a+b;
		System.out.println(c);	
	}
	
	public void AddWithParameters(int a,int b) {
		int num1 =a;
		int num2 = b;
		System.out.println(num1+num2);
		
	}
	
	public int AddWithParameters2(int a, int b) {
		int num3=a;
		int num4 = b;
		int result = num3+num4;
		System.out.println(result);
		return(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayTwo add = new DayTwo();
		DayTwo add1 = new DayTwo("jagan");
		add.Add();
		add.AddWithParameters(10, 200);
		MiniCalci calculator = new MiniCalci();
		calculator.Div(2,5);
		
		
	}

}
