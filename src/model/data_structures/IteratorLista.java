package model.data_structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorLista<T> implements Iterator<T> 
{
	Nodo<T> proximo;

	public IteratorLista(Nodo<T> primero)
	{
		proximo=primero;
	}
	public boolean hasNext() 
	{
		return proximo!=null;
	}

	public T next() {
		if(proximo==null) 
		{
			throw new NoSuchElementException("No hay proximo");
		}
		T elemento =proximo.darElemento();
		proximo=proximo.darSiguiente();
		return elemento;
	}
	
	public void remove()throws UnsupportedOperationException, IllegalStateException
	{
		throw new UnsupportedOperationException("No implementada");
	}

}
