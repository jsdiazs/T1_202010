package Json;

public class Feature implements Comparable<Feature>
{
	
	private MultiPolygon geometry;
	private Properties properties;

	public Feature(MultiPolygon pGeometry, Properties pProperties)
	{
		geometry = pGeometry;
		properties = pProperties;
	}
	public Properties darPropiedades()
	{
		return properties;
	}
	public MultiPolygon darGeometria()
	{
		return geometry;
	}
	public int compareTo(Feature pFeature)
	{
	if(this.geometry.darCoordinates().length > pFeature.darGeometria().darCoordinates().length)
	{
		return 1;
	}
	if(this.geometry.darCoordinates().length < pFeature.darGeometria().darCoordinates().length)
	{
		return -1;
	}
	return 0;
	}
	
}


