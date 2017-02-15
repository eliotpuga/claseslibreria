package models;

public class Libreria {

	private String nombre;
	private CD[] listaCDs;
	private Libro[] listaLibros;
	
	public Libreria(String nombre, CD[] listaCDs, Libro[] listaLibros) {		
		this.nombre = nombre;
		this.listaCDs = listaCDs;
		this.listaLibros = listaLibros;
	}

	public String getNombre() {
		return nombre;
	}

	public CD[] getListaCDs() {
		return listaCDs;
	}

	public Libro[] getListaLibros() {
		return listaLibros;
	}	
	
	public CD getCDmasCaro(){
		CD masCaro=listaCDs[0];
		for (int i=0; i<listaCDs.length-1;i++){
			
			if(masCaro.getPrecio()<listaCDs[i+1].getPrecio()) {
				masCaro=listaCDs[i+1];
			}			
		}
	return masCaro;
	}
	public float getPrecioTotalCDs(){
		float sumaPrecio=0f;
		int i=0;
		for (i=0;i<listaCDs.length;i++){ // for (CD miCD : listaCDS) {
			sumaPrecio+=listaCDs[i].getPrecio();
		}
		return sumaPrecio;	
		}
	}
	
	

