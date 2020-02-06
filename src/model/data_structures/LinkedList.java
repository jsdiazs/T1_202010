package model.data_structures;

import java.util.Iterator;

public class LinkedList<T extends Comparable <T>> implements ILinkedList<T>
{
	/**
	 * Primer nodo de la lista.
	 */
	private Nodo<T> primero;

	/**
	 * Numero de elementos de la lista.
	 */
	private int longitud=0;

	/**
	 * Metodo constructor de la clase nodo
	 */

	public LinkedList()
	{
		primero=null; 
		longitud=0;
	}

	public boolean estaVacia()
	{
		boolean empty=false;
		if(primero==null) {
			empty=true;
		}
		return empty;

	}

	public void eliminar(T borrar) throws Exception 
	{
		if(longitud>0)
		{
			if(borrar.equals(primero.darElemento()))
			{
				Nodo<T> nuevoPrimero = primero.darSiguiente();
				primero=null;
				primero=nuevoPrimero;
				longitud--;
			}
			else
			{
				boolean termino =false;
				Nodo<T>actual=primero;
				while(!termino)
				{
					Nodo<T>nuevoSig=actual.darSiguiente();
					if(nuevoSig.darElemento().equals(borrar))
					{
						actual.enlazarSiguiente(nuevoSig.darSiguiente());
						nuevoSig.darSiguiente().enlazarSiguiente(actual);
						nuevoSig=null;
						
					}
				}
			}
		}
		else
		{
			throw new Exception("No hay elementos para eliminar");
		}
	}
	
	public T darElemento(int posicion)
	{
		return null;
	}

	public int darTamanio() 
	{
		return longitud;
	}

	public void añadir(T agregar, Nodo<T> pNuevo) throws Exception 
	{
		if(longitud==0)
		{
			Nodo<T> nuevo = new Nodo<T>(agregar,pNuevo);
			primero = nuevo;
			this.longitud++;
		}
		
		
	}
}
