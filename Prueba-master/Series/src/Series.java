import java.io.*;
public class Series implements Entregable{

	private String titulo, genero, creador;
	private int temporadas=3;
	private boolean entregado=false;

	
	Series(){
		temporadas=3;
		entregado=false;
	}
	Series(String titulo, String creador){}
	Series(String titulo, String genero, String creador, int temporadas){}

	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	
	public String toString (int x) {
		return Integer.toString(x);
	}
	public void entregar() {
		entregado=true;
		
	}

	public void devolver() {
		entregado=false;
		
	}

	
	public boolean isEntregado() {
		return entregado;
		
	}


	public void compareTo(Object a) {
		// TODO Auto-generated method stub
		
 	}

}
