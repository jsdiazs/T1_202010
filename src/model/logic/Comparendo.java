package model.logic;

public class Comparendo implements Comparable<Comparendo>
{
	/**
	 * Identificador �nico del comparendo
	 */
	public double OBJECTID;
	
	/**
	 * Fecha del comparendo en formato A�o\/Mes\/D�a
	 */
	public String FECHA_HORA;
	
	/**
	 * Tipo de veh�culo ("�AUTOMOVIL�, "BICICLETA", "BUS", "BUSETA", "CAMIONETA", "CAMPERO", "MOTOCICLETA", �)
	 */
	public String MEDIO_DETE;
	
	/**
	 * Tipo de servicio ("Particular", "P�blico", "Oficial")
	 */
	public String TIPO_SERVI;
	
	/**
	 * C�digo de la infracci�n cometida
	 */
	public String INFRACCION;
	
	/**
	 * Descripci�n de la infracci�n
	 */
	public String DES_INFRAC;
	
	/**
	 * Localidad en la ciudad del comparendo
	 */
	public String LOCALIDAD;
	
	/**
	 * Longiud geogr�fica 
	 */
	public double longitud;
	
	/**
	 * Latitud geogr�fica
	 */
	public double latitud;
	
	public Comparendo(double pOBJECTID, String pFECHA_HORA, String pMEDIO_DETE, String pTIPO_SERVI, String pINFRACCION, String pDES_INFRAC, String pLOCALIDAD, double pLongitud, double pLatitud)
	{
		OBJECTID=pOBJECTID;
		FECHA_HORA=pFECHA_HORA;
		MEDIO_DETE=pMEDIO_DETE;
		TIPO_SERVI=pTIPO_SERVI;
		INFRACCION=pINFRACCION;
		DES_INFRAC=pDES_INFRAC;
		LOCALIDAD=pLOCALIDAD;
		longitud=pLongitud;
		latitud=pLatitud;
	}
	
	
	public double getOBJECTID() {
		return OBJECTID;
	}

	public void setOBJECTID(double gOBJECTID) {
		this.OBJECTID = gOBJECTID;
	}

	public String getFECHA_HORA() {
		return FECHA_HORA;
	}

	public void setFECHA_HORA(String gFECHA_HORA) {
		FECHA_HORA = gFECHA_HORA;
	}
	
	public String getMEDIO_DETE() {
		return MEDIO_DETE;
	}

	public void setMEDIO_DETE(String gMEDIO_DETE) {
		MEDIO_DETE = gMEDIO_DETE;
	}

	public String getTIPO_SERVI() {
		return TIPO_SERVI;
	}

	public void setTIPO_SERVI(String gTIPO_SERVI) {
		TIPO_SERVI = gTIPO_SERVI;
	}

	public String getINFRACCION() {
		return INFRACCION;
	}

	public void setINFRACCION(String gINFRACCION) {
		INFRACCION = gINFRACCION;
	}

	public String getDES_INFRAC() {
		return DES_INFRAC;
	}

	public void setDES_INFRAC(String gDES_INFRAC) {
		DES_INFRAC = gDES_INFRAC;
	}

	public String getLOCALIDAD() {
		return LOCALIDAD;
	}

	public void setLOCALIDAD(String gLOCALIDAD) {
		LOCALIDAD = gLOCALIDAD;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double gLongitud) {
		this.longitud = gLongitud;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double gLatitud) {
		this.latitud = gLatitud;
	}

	public int compareTo(Comparendo o) 
	{
		return 0;
	}
	
}
