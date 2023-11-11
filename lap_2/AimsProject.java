package lap_2;

import lap_2.Cart;
import lap_2.DigitalVideoDisc;

public class AimsProject {
    public static void main(String[] args) {

        // DigitalVideoDisc Dig = new DigitalVideoDisc(null);

        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Title1", "Category1", "Director1", 120, 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Title2", "Category2", "Director2", 150, 24.99f);

        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);

        System.err.println(anOrder.totalCost());
    }
}
