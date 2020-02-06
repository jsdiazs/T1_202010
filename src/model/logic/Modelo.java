package model.logic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {
	
	
	private LinkedList<T> linkedList;
	
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		linkedList = new LinkedList<T>();
	}
	
	/**
	 * Constructor del modelo del mundo con capacidad dada
	 * @param tamano
	 */
	public Modelo(int capacidad)
	{
		datos = new ArregloDinamico(capacidad);
	}
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el modelo 
	 * @return numero de elementos presentes en el modelo
	 */
	public int darTamano()
	{
		return datos.darTamano();
	}

	/**
	 * Requerimiento de agregar dato
	 * @param dato
	 */
	public void agregar(String dato)
	{	
		datos.agregar(dato);
	}
	
	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public String buscar(String dato)
	{
		return datos.buscar(dato);
	}
	
	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */
	public String eliminar(String dato)
	{
		return datos.eliminar(dato);
	}
	

   
    	
    	private FCollection g;

    	private tablaDeHashLinearProbing<String, Feature> TablaHashZn;
    	/**
    	 * Constructor del modelo del mundo con capacidad predefinida
    	 */
    	public MVCModelo()
    	{
    		arbolHora = new ArbolRojoNegro();
    		arbolSemana = new ArbolRojoNegro();
    		arbolMes = new ArbolRojoNegro();
    		//queue = new MaxPQ();
    		table = new tablaDeHashLinearProbing();
    	}
    	
    		//--------------------------------------------------------------------------------------
    		//JSON READER
    	
    	    public  FCollection JSONReader() throws Exception 
    	    {

    	    	FileInputStream inputStream = new FileInputStream("data/bogota_cadastral.json");

    	        inputStream  = new FileInputStream("./data/bogota_cadastral.json");
    	        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
    	        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


    	         g = new Gson().fromJson(bufferedReader, FCollection.class);
    	        
    	        System.out.println("Zonas cargadas por JSON fueron: " +g.features[g.features.length-1].properties.MOVEMENT_ID);
    	        return g;

    	    }

    	    
    	    class Properties 
    	    {
    	    	long cartodb_id;
    	        String scacodigo;
    	        long scatipo;
    	        String scanombre;
    	        double shape_leng;
    	        double shape_area;
    	        String MOVEMENT_ID;
    	        String DISPLAY_NAME;
    	    }

    	    class GeometryData {
    	        String type;
    	        double[][][][] coordinates;

    	    }

    	    class Feature {
    	        String type;
    	        GeometryData geometry;
    	        Properties properties;
    	    }
    	    
    	    class FCollection 
    	    {
    	        String type;
    	        Feature[] features;
    	        
    	    }
    	    
    	   


}
