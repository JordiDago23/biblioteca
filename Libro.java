package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro extends materialL{
	
	public static boolean reservado = false;
	public static ArrayList<Libro> arrayLibros = new ArrayList <>();
	public static Scanner scan = new Scanner(System.in);
//Erencia de materialL y reservado	
public Libro(int id, String titulo, String autor, String tematica){
	super(id, titulo, autor, tematica);
	this.reservado = reservado;
}

//Getters y Setters getters
	public boolean getReservado(){
		return reservado;
	}
	
	public void getResevado(boolean reservado){
		this.reservado = reservado;
	}
	
	public ArrayList<Libro> getArrayLibros(){
		return arrayLibros;
	}
	
	public void setArrayLibros(ArrayList<Libro> arrayLibros){
		this.arrayLibros = arrayLibros;
	}

//Metodos
public void modificar_reserva(){
	int id_reserva;
	
	System.out.println("Introduzca la Id de su Libro para Modificar Reserva");
	id_reserva = scan.nextInt();
//hola mari carmen
	
	
}

}
