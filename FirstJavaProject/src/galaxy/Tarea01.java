package galaxy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tarea01 {
    public Tarea01() {

    }

    public void saluteJava() {
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(reader);
            System.out.print("Introduzca su nombre, por favor: ");
            String sNombre = br.readLine();
            System.out.println("Hola Mundo, " + sNombre);
        } catch(Exception ex) {
            System.out.println("Ha ocurrido un error: " + ex.getMessage());
        }
    }
}
