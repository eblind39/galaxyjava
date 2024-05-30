package galaxy;

public class Operators {
	public Operators() {
		int suma = 5 + 3;
		int resta = 10 - 4;
		int multiplicacion = 1 * 2;
		int division = 2 / 2;
		int modulo = 10 % 3; // resto
		
		int incremento = 0;
		incremento++; // incremento = incremento + 1
		++incremento;
		
		int decremento = 0;
		decremento--; // decremento = decremento - 1
		--decremento;
		
		String cadena1 = new String("Inti");
		String cadena2 = new String("Inti");
		Boolean sonIgualesCadenas = cadena1.equals(cadena2);
		boolean sonIgualesObjetos = (cadena1 == cadena2);	// se comparan direcciones en memoria de 2 objetos
		
		System.out.println("suma: " + Integer.toString(suma) + System.lineSeparator() +
				"resta: " + Integer.toString(resta) + System.lineSeparator() +
				"multiplicacion: " + Integer.toString(multiplicacion) + System.lineSeparator() +
				"division: " + Integer.toString(division) + System.lineSeparator() +
				"modulo: " + Integer.toString(modulo) + System.lineSeparator() +
				"incremento: " + Integer.toString(incremento) + System.lineSeparator() +
				"decremento: " + Integer.toString(decremento) + System.lineSeparator() +
				"sonIgualesCadenas: " + sonIgualesCadenas.toString() + System.lineSeparator() +
				"sonIgualesObjetos: " + Boolean.toString(sonIgualesObjetos) + System.lineSeparator());
	}
}
