package guimodule;

import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import processing.core.PApplet;

public class MyDisplay extends PApplet {

    public void setup() {
        size(400,400);
        background(200, 200, 200);
    }

    public void draw() {
        fill(255, 255, 0);
        ellipse(200,200, 390, 390);
        fill(0, 0, 0);
        ellipse(120,130, 50, 70);
        ellipse(280,130, 50, 70);

        noFill();
        arc(200, 280, 75, 75,0 , PI);


        SimplePointMarker marker = new SimplePointMarker(new Location(55.822412, 37.432043));

    }

    public static void main(String[] args) {
        System.out.println(second());
        System.out.println(minute());
        System.out.println(hour());

        /*MyDisplay mydisplay = new MyDisplay();
        PApplet.runSketch(new String[] {"MyDisplay"}, mydisplay);

         */
    }
}

