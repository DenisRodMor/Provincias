package provincias;



public class ControlCiudades {
	
	
	private Vista vista;
	
	private RegistroCiudades registroCiudades;
	


	public ControlCiudades() {
		super();
		this.vista = new Vista();
		this.registroCiudades = new RegistroCiudades();
	}


	public void menuPrincipal(){
		int filas, columnas;

		
		try {
			
		vista.outputHome(); 
		
		filas = Integer.parseInt(vista.input("Digite la cantidad de filas de la matriz"));
		
		columnas = Integer.parseInt(vista.input("Digite la cantidad de columnas de la matriz"));
		
		if(filas <= 0 || columnas <= 0) {
			vista.output("No se aceptan numeros menores o iguales a 0 para filas y columnas");
			menuPrincipal();
		}
		
		// Creando matriz tipo Ciudad
		
		registroCiudades.setCiudades(new Ciudad[filas][columnas]);
		menuInterno();
		
		
		}
		catch(Exception e) {
			vista.output("Tipo de entrada no corresponde a entero");
			menuPrincipal();
		}
			
	}
	
	private void menuInterno() {
		try {
			int opcion = Integer.parseInt(vista.input("Seleccione una opcion:\n1- Agregar Ciudad\n2-Cantidad de ciudades almacenadas.\n3-Mostrar ciudades almacenadas.\n4-Digite el ID de la ciudad que desea eliminar.\n5-Informese sobre las caracteristicas de una ciudad en especifico.\n6-Salir del sistema."));
			
			switch(opcion){
				case 1:
					Ciudad ciudad = new Ciudad();
					ciudad.setNombre(vista.input("Digite el nombre de la ciudad:"));
					ciudad.setCantidadPersonas(Integer.parseInt(vista.input("Digite la cantidad de personas de la ciudad:")));
					ciudad.setId(Integer.parseInt(vista.input("Digite el id de la ciudad:")));
					boolean ciudadInsertada = registroCiudades.insertarCiudad(ciudad); //inertando ciudad
					
					if (!ciudadInsertada) {
						vista.output("La matriz no cuenta con espacios disponibles");
						
					}; 
					menuInterno() ;
						
				case 2:
					vista.output("La cantidad de ciudades insertadas es:"+ registroCiudades.getTotalCiudades());
					menuInterno();
				case 3:
					vista.output(registroCiudades.imprimirCiudad());
					menuInterno();
				case 4:
					int entradaCiudad =Integer.parseInt(vista.input("Digite el id de la ciudad que usted como usuario desea eliminar "));
					if(registroCiudades.Eliminador_de_Ciudad(entradaCiudad)==true) {
						vista.output("Ciudad eliminada con exito");
					}else {
						vista.output("La ciudad que ha digitado, no corresponde a ninguna de las nuestras ");
					}
					menuInterno();
					
				case 5:
					int entradaciudadesp =Integer.parseInt(vista.input("Digite el id de la ciudad que usted como usuario desea conocer los atributos que contiene "));					
					vista.output(registroCiudades.Buscador_de_Ciudades(entradaciudadesp));
					//menuInterno();
					
				///break;					
					
				case 6:	
					System.exit(0);
						
				default:
					vista.output("Digite la opcion que corresponde");
					menuInterno();
			}		

			
			
		
		}
		catch(Exception e) {
			vista.output("Tipo de entrada no corresponde a entero");
			menuInterno();
		}
		
	}

	
}

