package aula28do08;

public class Carro extends VeiculoABS {
	
	@Override
	public void acelerar() {
		System.out.println("Acelerando");
	}
	
	@Override
	public void frear() {
		System.out.println("Freiando");
	}

	public void virar() {
		System.out.println("Virando");
	}
	public void ligar() {
	    System.out.println("Ligando");
	
	}
}
