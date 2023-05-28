package class25;

import java.util.ArrayList;
import java.util.List;

public class E2ArrayList {
    public static void main(String[] args) {
        Headset headset1=new Headset("Razer Nari Ultimate",79.99,4620);
        Headset headset2=new Headset("NEW SteelSeries Arctics",52.64,4868);
        Headset headset3=new Headset("HyperX",0,32115);
        List<Headset> headsets=new ArrayList();
    }
}
class Headset {
    private String title;
    private double price;
    private int noOfReviews;

    public Headset(String title, double price, int noOfReviews) {
        this.title = title;
        this.price = price;
        this.noOfReviews = noOfReviews;
    }

    public void printInfo() {
        System.out.println(title + " " + price + " " + noOfReviews);
    }
}
