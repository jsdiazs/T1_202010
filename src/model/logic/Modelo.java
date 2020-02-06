package model.logic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

import com.google.gson.Gson;

import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;

/**
 * Definicion del modelo del mundo
 *
 */
public class Modelo {
	
	
	private LinkedList list;
	private FCollection g;
	
	/**
	 * Constructor del modelo del mundo con capacidad predefinida
	 */
	public Modelo()
	{
		list = new LinkedList();
	}
	
	


    		//--------------------------------------------------------------------------------------
    		//JSON READER
    	
    	    public  FCollection JSONReader() throws Exception 
    	    {

        	   	FileInputStream inputStream = new FileInputStream("data/comparendos_dei_2018_small.geojson");
    	        inputStream  = new FileInputStream("./data/comparendos_dei_2018_small.geojson");
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
