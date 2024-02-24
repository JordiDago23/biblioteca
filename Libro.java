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

//Metodos:
	
	public void añadirLibro(Libro l) {
        arrayLibros.add(l);
    }
	
	public void eliminarLibro(Libro l) {
        arrayLibros.remove(l);
    }
	
	
	
	
	public void buscarLibroPorTitulo(String titulo, boolean reserva) {
        for (Libro libro : arrayLibros) {
            if (libro.getTitulo().equals(titulo)){
            	mostarar(reserva);
                return;
            }
        }
        System.out.println("El  libro "+getTitulo()+", No ha sido encontrado en la Biblioteca.");
	}
	
	public void buscarLibroPorAutor(String autor, boolean reserva) {
        for (Libro libro : arrayLibros) {
            if (libro.getAutor().equals(autor)){
            	mostarar(reserva);
                return;
            }
        }
        System.out.println("Los Libros del Autor : "+getAutor()+", No ha sido encontrados en la Biblioteca.");
	}
	
	public void buscarLibroPorTematica(String tematica, boolean reserva) {
        for (Libro libro : arrayLibros) {
            if (libro.getTematica().equals(tematica)){
            	mostarar(reserva);
                return;
            }
        }
        System.out.println("Los Libros de la Temática : "+getTematica()+", No ha sido encontrados en la Biblioteca.");
	}
	
	
	

	public void eliminar_reserva(boolean reserva){
		
		if(reserva){
			reserva = false;
			System.out.println("La reserva del libro "+getTitulo()+", ha sido anulada.");
		}else{
			System.out.println("El  libro "+getTitulo()+", No ha sido reservado de momento.");
		}
	}

	public void reservar_libro(boolean reserva){
		String decidir;
		if(!reserva){
		reserva = true;
		System.out.println("El  libro "+getTitulo()+", ha sido reservado por usted.");
		}else{
		System.out.println("El  libro "+getTitulo()+", ya ha sido reservado por un Cliente.");
		}
	}
	
	public void mostarar(boolean reserva){
		System.out.println("Libro {Titulo: "+getTitulo()+" | Autor : "+getAutor()+" | Temática : "+getTematica()+" | Reservado :"+(reserva ? "SI":"NO")+" }");
	}
	
}
