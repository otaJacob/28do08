package aula28do08;

public class PrincipalCarros {

	public static void main(String[] args) {
		 
		Onibus busao = new Onibus();
		Carro car = new Carro();
		
		System.out.println("BUSAOOOOOOOOOOOOOOOOOOOOO");
		busao.acelerar();
		busao.frear();
		busao.ligar();
		busao.virar();
		System.out.println(" ______________________________________");
        System.out.println("Carro");
        car.acelerar();
        car.frear();
        car.ligar();
        car.virar();
	}

}
