package module6;

import java.util.List;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.SimpleLinesMarker;
import processing.core.PGraphics;

/** 
 * A class to represent AirportMarkers on a world map.
 *   
 * @author Adam Setters and the UC San Diego Intermediate Software Development
 * MOOC team
 *
 */
public class AirportMarker extends CommonMarker {
	public static List<SimpleLinesMarker> routes;
	
	public AirportMarker(Feature city) {
		super(((PointFeature)city).getLocation(), city.getProperties());
	
	}
	
	@Override
	public void drawMarker(PGraphics pg, float x, float y) {
		pg.fill(11);
		pg.ellipse(x, y, 5, 5);

		if (selected) {

			String strName = "Name: " + getName();
			String strCity = "City: " + getCity();
			String strCountry = "Country: " + getCountry();

			float width = Math.max(
					pg.textWidth(strName),
					Math.max(pg.textWidth(strCity), pg.textWidth(strCountry)));


			pg.fill(255);
			pg.rect(x+10, y, width+10, 50, 5);

			pg.fill(0);
			pg.text(strName,x+12,y+12);
			pg.text(strCity,x+12,y+27);
			pg.text(strCountry,x+12,y+42);

		}
		
	}

	@Override
	public void showTitle(PGraphics pg, float x, float y) {
		 // show rectangle with title
		
		// show routes
		
		
	}

	/* Local getters for some city properties.
	 */
	public String getName()
	{
		return getStringProperty("name");
	}

	public String getCity()
	{
		return getStringProperty("city");
	}

	public String getCountry()
	{
		return getStringProperty("country");
	}
}
