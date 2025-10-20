package aula1;

public class aula4 {
	
	public static void main(String[] args) {
		int day = 3;
		
		switch(day) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		default:
			System.out.println("Dia invalido");
		break;
		}
	}
}
