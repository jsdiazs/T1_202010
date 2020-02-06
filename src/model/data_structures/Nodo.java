package model.data_structures;

/**
 * @author Jhoan Sebastian Diaz Salamanca
 * Clase que representa un nodo de la LiknkedList.
 * @param <T>
 */
public class Nodo <T>
{

	private T elemento;
	private Nodo<T> siguiente;
	
	
	public Nodo(T elemento, Nodo<T> pSiguiente){
		this.elemento=elemento;
		this.siguiente=pSiguiente;
	}
	
	public void enlazarSiguiente(Nodo n){
		siguiente=n;}
	
	public Nodo darSiguiente() {
		return siguiente;
	}
	
	public T darElemento() {
		return elemento;
	}
	
}
