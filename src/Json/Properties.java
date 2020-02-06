package Json;

public class Properties 
{

		private int cartodb_id;
		private String codigo;
		private int scatipo;
		private String scanombre;
		private double shape_leng;
		private double shape_area;
		private int MOVEMENT_ID;
		private String DISPLAY_NAME;

		public Properties(int pId, String pCodigo, int pTipo, String pNombre,double pLeng, double pArea, int movement, String pName)
		{
			cartodb_id = pId;
			codigo = pCodigo;
			scatipo = pTipo;
			scanombre = pNombre;
			shape_leng = pLeng;
			shape_area = pArea;
			MOVEMENT_ID = movement;
			DISPLAY_NAME = pName;
		}

		public String darscanombre() {
			// TODO Auto-generated method stub
			return scanombre;
		}
}
