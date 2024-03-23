package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro extends materialL{
	
	public  boolean reservado;
    
	public  static ArrayList<Libro> arrayLibros = new ArrayList<>();
	public  static Scanner scan = new Scanner(System.in);

    // Constructor
    public Libro(int id, String titulo, String autor, String tematica) {
       super( id,  titulo,  autor,  tematica);
        this.reservado = false; 
    }


    // Getters y setters  
    public boolean getReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public static ArrayList<Libro> getArrayLibros() {
        return arrayLibros;
    }

    public static void setArrayLibros(ArrayList<Libro> arrayLibros) {
        Libro.arrayLibros = arrayLibros;
    }

    // AÑADIR LIBROS
    public static void añadirLibro(Libro libro) {
        arrayLibros.add(libro);
    }
    // ELIMINAR LIBROS
    public static void eliminarLibro(String titulo) {
        for(Libro libro : arrayLibros){
        	if(libro.getTitulo().equals(titulo)){
        		arrayLibros.remove(libro);
        		System.out.println("El Libro : "+titulo+", ha sido eliminado.");
        		return;
        	}       	
        }
    	System.out.println("El Libro con el Titulo : "+titulo+", ha sido encontrada en la biblioteca.");
    	
    }
    // MODIFICAR UNA LIBROS
    public static void modificarLibro(String titulo, int nuevoId, String nuevoTitulo, String nuevoAutor, String nuevaTematica, boolean nuevoReservado) {
        for (Libro libro : arrayLibros) {
            if (libro.getTitulo().equals(titulo)) {
                libro.setId(nuevoId);
                libro.setTitulo(nuevoTitulo);
                libro.setAutor(nuevoAutor);
                libro.setTematica(nuevaTematica);
                libro.setReservado(nuevoReservado);
                System.out.println("El Libro : " + titulo + ", ha sido modificado exitosamente.");
                return;
            }
        }
        System.out.println("El Libro : " + titulo + ", no ha sido encontrado en la biblioteca.");
    }

    // BUSCAR LIBROS POR (TITULO/AUTOR/TEMATICA)
    public static void buscarLibroPorTitulo(String tituloBuscar) {
        for (Libro libro : arrayLibros) {
            if (libro.getTitulo().equalsIgnoreCase(tituloBuscar)) {
            	mostrarLibro(libro);
                return;
            }
        }
        System.out.println("El Libro : " + tituloBuscar + ", no ha sido encontrado en la biblioteca.");
    }

    public static void buscarLibroPorAutor (String autorBuscar) {
        
    	boolean encontrar = false;
    	
    	for (Libro libro : arrayLibros) {
            if (libro.getAutor().equalsIgnoreCase(autorBuscar)) {
            	mostrarLibro(libro);
               System.out.println();
               encontrar = true;
            }
        }
    	if(!encontrar){
        System.out.println("El Libro : " + autorBuscar + ", no ha sido encontrado en la biblioteca.");
    	}
    }
    
    
    public static void buscarLibroPorTemática(String tematicaBuscar) {
    	
    	boolean encontrar = false;
    	
        for (Libro libro : arrayLibros) {
            if (libro.getTematica().equalsIgnoreCase(tematicaBuscar)) {
            	mostrarLibro(libro);
            	System.out.println();
            	encontrar = true;
            }
        }
        if(!encontrar){
        System.out.println("El Libro : " + tematicaBuscar + ", no ha sido encontrado en la biblioteca.");
        }
    }
    
    public static void eliminarReserva(String titulo) {
        for (Libro libro : arrayLibros) {
            if (libro.getTitulo().equals(titulo)) {
                if (libro.getReservado()) {
                    libro.setReservado(false);
                    System.out.println("La reserva del Libro : "+titulo+", ha sido anulada.");
                } else {
                    System.out.println("El Libro : "+titulo+", no ha sido reservado.");
                }
                return;
            }
        }
        System.out.println("El Libro : "+titulo+", no se encuentra en la biblioteca.");
    }

    public static void reservarLibro(String titulo) {
        for (Libro libro : arrayLibros) {
            if (libro.getTitulo().equals(titulo)) {
                if (!libro.getReservado()) {
                    libro.setReservado(true);
                    System.out.println("El Libro : "+titulo+", ha sido reservado por usted.");
                } else {
                    System.out.println("El Libro : "+titulo+", ya ha sido reservado por un cliente.");
                }
                return;
            }
        }
        System.out.println("El Libro : "+titulo+", no se encuentra en la biblioteca.");
    }


	public static void mostrarLibro(Libro libro) {
        System.out.println("Información del libro:");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Tematica: " + libro.getTematica());
        System.out.println("Reservado: " + (libro.getReservado() ? "Sí" : "No"));
    }

}
