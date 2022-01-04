package es.studium.Ejercicio1;


public class Ejercicio1 extends Thread {
	public Ejercicio1(String str) {
		super(str);
	}

	@Override //Porque lo estoy sobreescribiendo
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + getName());
		}
		System.out.println("Termina thread " + getName());
	}

	public static void main(String[] args) {
		Ejercicio1 t1 = new Ejercicio1("Prueba");
		t1.start();
	}
}
