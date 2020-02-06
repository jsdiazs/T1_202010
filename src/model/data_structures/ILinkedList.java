package model.data_structures;

public interface ILinkedList<T extends Comparable <T>> 
{
	public void añadir(T agregar, Nodo<T> pNuevo) throws Exception;
	
	public void eliminar(T borrar) throws Exception;
	
	public int darTamanio();
	
	public T darElemento(int posicion);
	
	
	
}
