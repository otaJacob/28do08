package aula28do08;

public class Lobo implements Animal {

	@Override
	public void dormir() {
	System.out.println("Dormindo e roncando");
}

@Override
public void caminhar() {
System.out.println("Caminhando");

}

@Override
public void correr() {
	System.out.println("Correndo");

}

@Override
public void emitirSom() {
	System.out.println("emitindoSom");
}
}

