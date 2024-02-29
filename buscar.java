package biblioteca;

import java.util.Scanner;

public class buscar {

	public static Scanner scan = new Scanner(System.in);
	
public static void main(String[] args){

int opcion = 0 ;	
int opcion1 = 0 ;
int opcion2 = 0 ;
int opcion3 = 0 ;

	while(opcion != 4){
		
		System.out.println();
		System.out.println("Que le interesa buscar");
		System.out.println("Opcion 1: Libros");
		System.out.println("Opcion 2: Revistas");
		System.out.println("Opcion 3: Articulos");
		System.out.println("Opcion 4: Volver al Menu");
		
		opcion = scan.nextInt();
		scan.nextLine();
		
		if(opcion == 1){
			
				while(opcion1 != 4){
					
					System.out.println();
					System.out.println("Porque metodo quiere buscar el Libro");
					System.out.println("Opcion 1: Titulo");
					System.out.println("Opcion 2: Autor");
					System.out.println("Opcion 3: Temática");
					System.out.println("Opcion 4: Volver Atras");
					
					opcion1 = scan.nextInt();
					scan.nextLine();
					
				if(opcion1 == 1){
					
					String tituloBuscar;
					System.out.print("Introduce el Titulo del Libro que quiere buscar : ");
					tituloBuscar = scan.nextLine();
					
					Libro.buscarLibroPorTitulo(tituloBuscar);
				}else if(opcion1 == 2){
					
					String 	autorBuscar;
					System.out.print("Que Autor quiere introducir para buscar un Libro : ");
					autorBuscar = scan.nextLine();
					
					Libro.buscarLibroPorAutor ( autorBuscar);
				}else if(opcion1 == 3){
					
					String tematicaBuscar;
					System.out.print("Que temática desea introducir para encontrar un Libro : ");
					tematicaBuscar = scan.nextLine();
					
					Libro.buscarLibroPorTemática( tematicaBuscar);
					
				}else if(opcion1 == 4){
					System.out.println("Volviendo Atras");
				}else{
					System.out.println("Eliga una opcion entre 1 - 4");
				}	
					
				}
				
		}else if(opcion == 2){
			
			while(opcion2 != 4){
					
					System.out.println();
					System.out.println("Porque metodo quiere buscar el Revistas");
					System.out.println("Opcion 1: Titulo");
					System.out.println("Opcion 2: Autor");
					System.out.println("Opcion 3: Temática");
					System.out.println("Opcion 4: Volver Atras");
					
					opcion2 = scan.nextInt();
					scan.nextLine();
					
				if(opcion2 == 1){
					
					String tituloBuscar;
					System.out.print("Introduce el Titulo de la Revista que quiere buscar : ");
					tituloBuscar = scan.nextLine();
						
					Revista.buscarRevistaPorTitulo( tituloBuscar );
						
				}else if(opcion2 == 2){
					String autorBuscar;
					
					System.out.print("Que Autor quiere introducir para buscar una Revista : ");
					autorBuscar = scan.nextLine();
					
					Revista.buscarRevistaPorAutor( autorBuscar);
					
				}else if(opcion2 == 3){
					String tematicaBuscar;
					
					System.out.print("Que temática desea introducir para encontrar una Revista : ");
					tematicaBuscar = scan.nextLine();
					
					Revista.buscarRevistaPorTematica( tematicaBuscar);
					
				}else if(opcion2 == 4){
					System.out.println("Volviendo Atras");
				}else{
					System.out.println("Eliga una opcion entre 1 - 4");
				}	
					
				}
			
		}else if(opcion == 3){
			
			while(opcion3 != 4){
					
					System.out.println();
					System.out.println("Porque metodo quiere buscar el Articulo");
					System.out.println("Opcion 1: Titulo");
					System.out.println("Opcion 2: Autor");
					System.out.println("Opcion 3: Temática");
					System.out.println("Opcion 4: Volver Atras");
					
					opcion3 = scan.nextInt();
					scan.nextLine();
					
				if(opcion3 == 1){
					String tituloBuscar;
					System.out.print("Introduce el Titulo del Articulo que quiere buscar :");
					tituloBuscar = scan.nextLine();
						
					Articulo.buscarArticuloPorTitulo( tituloBuscar);
						
				}else if(opcion3 == 2){
					String autorBuscar;
					
					System.out.print("Que Autor quiere introducir para buscar un Articulo :");
					autorBuscar = scan.nextLine();
					
					Articulo.buscarArticuloPorAutor( autorBuscar);
						
				}else if(opcion3 == 3){
					String tematicaBuscar;
					System.out.print("Que temática desea introducir para encontrar un Articulo :");
					tematicaBuscar = scan.nextLine();
					
					Articulo.buscarArticuloPorTematica( tematicaBuscar);
					
					
				}else if(opcion3 == 4){
					System.out.println("Volviendo Atras");
				}else{
					System.out.println("Eliga una opcion entre 1 - 4");
				}	
					
				}
			
		}else if(opcion == 4){
			System.out.println("Finalizar el Programa");
		}else{
			System.out.println("Eliga una opcion entre 1 - 4");
		}	
			
	}

}

}
