package study;

import processing.core.*;

public class MyPApplet extends PApplet {
    private String url = "http://cseweb.ucsd.edu/~minnes/palmTrees.jpg";
    private PImage backgroungImg;

    @Override
    public void setup() {
        size(400,400);
        backgroungImg = loadImage(url);
    }

    @Override
    public void draw() {
        backgroungImg.resize(0, height);
        image(backgroungImg,0,0);
        fill(255,209,0);
        ellipse(width/4, height/5, width/5, height/5);
    }

    public static void main(String[] args) {
        MyPApplet my = new MyPApplet();
        PApplet.runSketch(new String[]{"ProcessingTest"}, my);

    }
}
