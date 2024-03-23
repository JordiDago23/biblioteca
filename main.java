package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class main  {
	
	protected static ArrayList<Libro> arrayLibros = new ArrayList<>();
    protected static ArrayList<Revista> arrayRevista = new ArrayList<>();
    protected static ArrayList<Articulo> arrayArticulos = new ArrayList<>();
    protected static Scanner scan = new Scanner(System.in);
    
    protected String titulo;
    protected String autor;
    protected String tematica;
    protected double precio;
    private boolean disponible;

    
public static void main (String [] args){

	
	
int opcion = 0;
int opcion1 = 0;
int opcion2 = 0;
int opcion3 = 0;

	while(opcion != 333){
		System.out.println();
		System.out.println("MENU PRINCIPAL");
		System.out.println("Opcion 1: Visitar Libros");
		System.out.println("Opcion 2: Visitar Revistas");
		System.out.println("Opcion 3: Visitar Articulos");
		System.out.println("Opcion 333: Salir del Programa");
		
		opcion = scan.nextInt();
		
		scan.nextLine();
		
		if(opcion == 1){
			
			while(opcion1 != 333){
				System.out.println();
				System.out.println("SUBMENU LIBROS");
				System.out.println("Opcion 1: Añadir Libros");
				System.out.println("Opcion 2: Eliminar Libros");
				System.out.println("Opcion 3: Modificar Libros");
				System.out.println("Opcion 4: Buscar Libro por Titulo");
				System.out.println("Opcion 5: Buscar Libros por Autor");
				System.out.println("Opcion 6: Buscar Libros por Temática");
				System.out.println("Opcion 7: Reservar Libros");
				System.out.println("Opcion 8: Cancelar Reserva de Libro");
				System.out.println("Opcion 333: Volver al MENU");
				
				opcion1 = scan.nextInt();
				
				scan.nextLine();
				
				if(opcion1 == 1){
					int nuevoId = 0;  String nuevoTitulo;  String nuevoAutor;  String nuevoTematica;
					
					System.out.println("Introduzca los datos de este Nuevo Libro : ");
					System.out.print("Que Id tendra este Libro : ");
					nuevoId = scan.nextInt();
					scan.nextLine();
					System.out.print("Que Titulo tendra el Libro : ");
					nuevoTitulo = scan.nextLine();
					System.out.print("A Que Autor pertenecera el Libro : ");
					nuevoAutor = scan.nextLine();
					System.out.print("Que Temática tendra este Libro : ");
					nuevoTematica = scan.nextLine();
					
					Libro libro = new Libro(nuevoId, nuevoTitulo, nuevoAutor, nuevoTematica);
					
					
					Libro.añadirLibro(libro);
					  
					
				}else if(opcion1 == 2){
					String titulo;
					
					System.out.print("Introduzca el Titulo del Libro que desea Eliminar : ");
					titulo = scan.nextLine();
					
					Libro.eliminarLibro( titulo);
					
				}else if(opcion1 == 3){
					String titulo; int nuevoId; String nuevoTitulo; String nuevoAutor; String nuevoTematica; boolean nuevoReservado; 
					
					
					System.out.print("Cual es el titulo del libro que quiere modificar : ");
					titulo = scan.next();
					System.out.println();			
					System.out.print("Cual es el nuevo Id del libro a implementar : ");
					nuevoId = scan.nextInt();
					System.out.println();
					scan.nextLine();
					System.out.print("Cual es el nuevo Titulo del libro a implementar : ");
					nuevoTitulo = scan.next();
					System.out.println();
					System.out.print("Cual es el nuevo Autor del libro a implementar : ");
					nuevoAutor = scan.next();
					System.out.println();
					System.out.print("Cual es el nuevo Temática del libro a implementar : ");
					nuevoTematica = scan.next();
					System.out.println();
					System.out.print("Cual es el nuevo estado de Reservado del libro a implementar (false: no reservado / true: reservado) ?");
					nuevoReservado = scan.nextBoolean();
					System.out.println();
				
				Libro.modificarLibro( titulo,  nuevoId,  nuevoTitulo,  nuevoAutor,  nuevoTematica,  nuevoReservado );
					
				}else if(opcion1 == 4){
					String tituloBuscar;
					
					System.out.print("Introduce el Titulo del Libro que quiere buscar : ");
					tituloBuscar = scan.nextLine();
					
					Libro.buscarLibroPorTitulo(tituloBuscar);
					
				}else if(opcion1 == 5){
					
					String 	autorBuscar;
					System.out.print("Que Autor quiere introducir para buscar un Libro : ");
					autorBuscar = scan.nextLine();
					
					Libro.buscarLibroPorAutor ( autorBuscar);
					
				}else if(opcion1 == 6){
					
					String tematicaBuscar;
					System.out.print("Que temática desea introducir para encontrar un Libro : ");
					tematicaBuscar = scan.nextLine();
					
					Libro.buscarLibroPorTemática( tematicaBuscar);
					
				}else if(opcion1 == 7){
					
					String titulo;
					System.out.print("Introduzca el Titulo del Libro que quiere Reservar : ");
					titulo = scan.nextLine();
					
					Libro.reservarLibro(titulo);
					
				}else if(opcion1 == 8){
					
					String titulo;
					
					System.out.print("Introduzca el Titulo del Libro con que quiere Cancelar la Reserva : ");
					titulo = scan.nextLine();
					
					Libro.eliminarReserva(titulo);
					
				}else if(opcion1 == 333){
					System.out.println("Volviendo al Menu Principal");
					
				}else{
					System.out.println("Elige una Opcion entre 1 - 8  o la opcion 333");
				}
		
			}
			
		}else if(opcion == 2){
				
			while(opcion2 != 333 ){
				System.out.println();
				System.out.println("SUBMENU REVISTAS");
				System.out.println("Opcion 1: Añadir Revista");
				System.out.println("Opcion 2: Eliminar Revista");
				System.out.println("Opcion 3: Modificar Revista");
				System.out.println("Opcion 4: Buscar Revista por Titulo");
				System.out.println("Opcion 5: Buscar Revistas por Autor");
				System.out.println("Opcion 6: Buscar Revistas por Temática");
				System.out.println("Opcion 333: Volver al MENU");
				
				opcion2 = scan.nextInt();
				scan.nextLine();
				
				if(opcion2 == 1){
					
					int nuevoId = 0;  String nuevoTitulo;  String nuevoAutor;  String nuevoTematica; double nuevoPrecio;
					
					System.out.println("Introduzca los datos de esta Nueva Revista : ");
					System.out.print("Que Id tendra esta Revista : ");
					nuevoId = scan.nextInt();
					scan.nextLine();
					System.out.println();
					System.out.print("Que Titulo tendra la Revista : ");
					nuevoTitulo = scan.nextLine();
					System.out.println();					
					System.out.print("A Que Autor pertenecera la Revista : ");
					nuevoAutor = scan.nextLine();
					System.out.println();
					System.out.print("Que Temática tendra esta Revista  : ");
					nuevoTematica = scan.nextLine();
					System.out.println();
					System.out.print("Que Precio tendra esta Revista : ");
					nuevoPrecio = scan.nextDouble();
					System.out.println();
					
					Revista revista = new Revista(nuevoId, nuevoTitulo, nuevoAutor, nuevoTematica ,nuevoPrecio);
					
					Revista.añadirRevista(revista);
					
				}else if(opcion2 == 2){
					
					String titulo;
					System.out.print("Introduzca el Titulo de la Revista que desea Eliminar : ");
					titulo = scan.nextLine();
					
					Revista.eliminarRevista( titulo);
					
				}else if(opcion2 == 3){
					
					String titulo; int nuevoId; String nuevoTitulo; String nuevoAutor; String nuevoTematica; double nuevoPrecio; 
					
					
					System.out.print("Cual es el titulo de la Revista que quiere modificar : ");					
					titulo = scan.next();
					System.out.println();
					System.out.print("Cual es el nuevo Id de la Revista a implementar : ");
					nuevoId = scan.nextInt();
					scan.nextLine();
					System.out.println();					
					System.out.print("Cual es el nuevo Titulo de la Revista a implementar : ");
					nuevoTitulo = scan.next();
					System.out.println();					
					System.out.print("Cual es el nuevo Autor de la Revista a implementar : ");
					nuevoAutor = scan.next();
					System.out.println();					
					System.out.print("Cual es el nuevo Temática de la Revista a implementar : ");
					nuevoTematica = scan.next();
					System.out.println();				
					System.out.print("Cual es el nuevo Precio de la Revista a implementar : ");
					nuevoPrecio = scan.nextDouble();
					System.out.println();
				
					Revista.modificarRevista( titulo,  nuevoId,  nuevoTitulo,  nuevoAutor,  nuevoTematica,  nuevoPrecio );
					
				}else if(opcion2 == 4){
					
					String tituloBuscar;
					
					System.out.print("Introduce el Titulo de la Revista que quiere buscar : ");
					tituloBuscar = scan.nextLine();
						
					Revista.buscarRevistaPorTitulo( tituloBuscar );
					
				}else if(opcion2 == 5){
					
					String autorBuscar;
					
					System.out.print("Que Autor quiere introducir para buscar una Revista : ");
					autorBuscar = scan.nextLine();
					
					Revista.buscarRevistaPorAutor( autorBuscar);
					
				}else if(opcion2 == 6){
					
					String tematicaBuscar;
					
					System.out.print("Que temática desea introducir para encontrar una Revista : ");
					tematicaBuscar = scan.nextLine();
					
					Revista.buscarRevistaPorTematica( tematicaBuscar);
					
				}else if(opcion2 == 333){
					System.out.println("Volviendo al Menu Principal");
					break;
				}else{
					System.out.println("Elige una Opcion entre 1 - 6 o la opcion 333 ");
				}
	
			}
			
			
		}else if(opcion == 3){
			
			while(opcion3 != 333 ){
				System.out.println();
				System.out.println("SUBMENU ARTICULOS");
				System.out.println("Opcion 1: Añadir Articulo");
				System.out.println("Opcion 2: Eliminar Articulo");
				System.out.println("Opcion 3: Modificar Articulo");
				System.out.println("Opcion 4: Buscar Articulo por Titulo");
				System.out.println("Opcion 5: Buscar Articulos por Autor");
				System.out.println("Opcion 6: Buscar Articulos por Temática");
				System.out.println("Opcion 333: Volver al MENU");
				
				opcion3 = scan.nextInt();
				scan.nextLine();
				
				if(opcion3 == 1){
					
					int nuevoId = 0;  String nuevoTitulo;  String nuevoAutor;  String nuevoTematica;
					
					System.out.println("Introduzca los datos de este Nuevo Articulo : ");
					System.out.print("Que Id tendra este Articulo : ");
					System.out.println();
					nuevoId = scan.nextInt();
					scan.nextLine();
					System.out.print("Que Titulo tendra el Articulo : ");
					System.out.println();
					nuevoTitulo = scan.nextLine();
					System.out.print("A Que Autor pertenecera el Articulo : ");
					System.out.println();
					nuevoAutor = scan.nextLine();
					System.out.print("Que Temática tendra este Articulo : ");
					System.out.println();
					nuevoTematica = scan.nextLine();
					
					Articulo articulo = new Articulo(nuevoId, nuevoTitulo, nuevoAutor, nuevoTematica );
					Articulo.añadirArticulo(articulo);
					
				}else if(opcion3 == 2){
					
					String titulo;
					System.out.print("Introduzca el Titulo del Articulo que desea Eliminar : ");
					titulo = scan.nextLine();
					
					Articulo.eliminarArticulo(titulo);
					
				}else if(opcion3 == 3){
					
					String titulo; int nuevoId; String nuevoTitulo; String nuevoAutor; String nuevoTematica; boolean nuevoDisponible; 					
					
					System.out.print("Cual es el titulo del Articulo que quiere modificar : ");
					System.out.println();
					titulo = scan.next();				
					System.out.print("Cual es el nuevo Id del Articulo a implementar : ");
					nuevoId = scan.nextInt();
					scan.nextLine();
					System.out.println();					
					System.out.print("Cual es el nuevo Titulo del Articulo a implementar : ");
					nuevoTitulo = scan.next();
					System.out.println();					
					System.out.print("Cual es el nuevo Autor del Articulo a implementar : ");
					nuevoAutor = scan.next();
					System.out.println();					
					System.out.print("Cual es el nuevo Temática del Articulo a implementar : ");
					nuevoTematica = scan.next();
					System.out.println();				
					System.out.print("Cual es la Disponibilidad del Articulo a implementar (false: No Disponible / true: Disponible)?");
					nuevoDisponible = scan.nextBoolean();
					System.out.println();
				
					Articulo.modificarArticulo( titulo,  nuevoId,  nuevoTitulo,  nuevoAutor,  nuevoTematica,  nuevoDisponible);
					
				}else if(opcion3 == 4){
					
					String tituloBuscar;
					System.out.print("Introduce el Titulo del Articulo que quiere buscar : ");
					tituloBuscar = scan.nextLine();
					
					Articulo.buscarArticuloPorTitulo( tituloBuscar);
					
				}else if(opcion3 == 5){
					
					String autorBuscar;
					
					System.out.print("Que Autor quiere introducir para buscar un Articulo : ");
					autorBuscar = scan.nextLine();
					
					Articulo.buscarArticuloPorAutor( autorBuscar);
					
				}else if(opcion3 == 6){
					
					String tematicaBuscar;
					System.out.print("Que temática desea introducir para encontrar un Articulo : ");
					tematicaBuscar = scan.nextLine();
					
					Articulo.buscarArticuloPorTematica( tematicaBuscar);
					
				}else if(opcion3 == 333){
					System.out.println("Volviendo al Menu Principal");
					break;
					
				}else{
					System.out.println("Elige una Opcion entre 1 - 6 o la opcion 333");
				}
	
			}
		}else if(opcion == 333){
			System.out.println("El programa a Finalizado");
		}else{
			System.out.println("Elige una Opcion entre 1 - 3 o la opcion 333");
		}
					
	}
	
}   
    
}