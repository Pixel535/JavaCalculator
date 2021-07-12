import java.util.Scanner;


public class Main 
{

	public static void main(String[] args) 
	{
		int a,b;
		String operator;
		Scanner scanner = new Scanner(System.in);
		System.out.println("----------------------------------------");
		System.out.println("Witaj w kalkulatorze!");
		System.out.println("Wybierz jeden z operatorow: [+][-][*][/]");
		System.out.println("Aby wyjsc z programu napisz ''koniec''");
		System.out.println("----------------------------------------");
		
		a = scanner.nextInt();
		
		while(true) {
			
			operator = scanner.next();
			
			if(operator.equals("koniec")) {
				System.out.println("koniec programu");
				return;
			}
			b = scanner.nextInt();
			
			switch(operator) {
			
			case "+": 
				a = Dodawanie(a,b);
			break;
			
			case "-": 
				a = Odejmowanie(a,b);
			break;
			
			case "*":
				a = Mnozenie(a,b);
			break;
			
			case "/":
				a = Dzielenie(a,b);
			break;
			}
		}
	

	}
	
	static int Dodawanie(int a, int b) {
		a = Math.addExact(a, b);
		System.out.println(a);
		return a;
	}
	
	static int Odejmowanie(int a, int b) {
		a = Math.subtractExact(a, b);
		System.out.println(a);
		return a;
	}
	
	static int Mnozenie(int a, int b) {
		a = Math.multiplyExact(a, b);
		System.out.println(a);
		return a;
	}
	
	static int Dzielenie(int a, int b) {
		a = a/b;
		System.out.println(a);
		return a;
	}

}
