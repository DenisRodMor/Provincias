package provincias;

import java.util.Arrays;

public class RegistroCiudades {
	
	
	private Ciudad [][] ciudades;
	
	private int totalCiudades;
	

	public RegistroCiudades(Ciudad[][] ciudades, int totalCiudades) {
		super();
		this.ciudades = ciudades;
		this.totalCiudades = totalCiudades;
	}

	public RegistroCiudades() {
		super();
	}

	public Ciudad[][] getCiudades() {
		return ciudades;
	}

	public void setCiudades(Ciudad[][] ciudades) {
		this.ciudades = ciudades;
	}
	
	
	
	public int getTotalCiudades() {
		return totalCiudades;
	}

	public void setTotalCiudades(int totalCiudades) {
		this.totalCiudades = totalCiudades;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(ciudades);
		result = prime * result + totalCiudades;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroCiudades other = (RegistroCiudades) obj;
		if (!Arrays.deepEquals(ciudades, other.ciudades))
			return false;
		if (totalCiudades != other.totalCiudades)
			return false;
		return true;
	}
	
	
	

	@Override
	public String toString() {
		return "RegistroCiudades [ciudades=" + Arrays.toString(ciudades) + ", totalCiudades=" + totalCiudades + "]";
	}

	public boolean insertarCiudad(Ciudad c) {
	
		for(int i=0;i<ciudades.length;i++) {
			for(int j=0;j<ciudades[i].length;j++) {
				if(ciudades[i][j] == null) {
					ciudades[i][j]= c;
					totalCiudades++;
					return true;
				}
			}
		}
		return false;
		
		
	}
	
	public boolean Eliminador_de_Ciudad(int pid) {
		
		for(int i=0;i<ciudades.length;i++) {
			for(int j=0;j<ciudades[i].length;j++) {
				if(ciudades[i][j].getId() == pid) {
					ciudades[i][j]= null;
					totalCiudades--;
					return true;
				}
			}
		}
		return false;
		
		
	}
	
public String Buscador_de_Ciudades(int pid) {
		
		for(int i=0;i<ciudades.length;i++) {
			for(int j=0;j<ciudades[i].length;j++) {
				if(ciudades[i][j].getId() == pid) {
					return ciudades[i][j].toString() ;
	
					
				}
			}
		}
		String str=new String("Lo siento, la ciudad que usted esta buscando no ha sido encontrada");
		return str;
		
		
	}
	
	
	public String imprimirCiudad() {
		
		StringBuilder salida = new StringBuilder("MOSTRANDO CIUDADES INSERTADAS\n");

		if(totalCiudades > 0) {
			for(int i=0;i<ciudades.length;i++) {
				
				salida.append("----------------------------------------------------- \n FILA: "+i +" \n");
				
				if(ciudades[i]!=null) {
					
					for(int j=0;j<ciudades[i].length;j++) {
						if(ciudades[i][j]!=null) {
								
							salida.append(" - "+ciudades[i][j]+"\n");
				
						}
					}
				}
					
			}
		}

		  return salida.toString();
		}
	


}
