package lap_2;

import lap_2.DigitalVideoDisc;

public class Cart {
    public static final int MAX_ORDER = 20;
    private DigitalVideoDisc itemsOrder[] = new DigitalVideoDisc[MAX_ORDER];

    private int qtyOrdered = 0;
    // private float totalCost = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        itemsOrder[qtyOrdered] = disc;
        qtyOrdered++;
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrder[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrder[j] = itemsOrder[j + 1];
                }
                qtyOrdered--;
                break;
            }
        }
    }

    public float totalCost() {
        float totalCost = 0;
        for (int i = 0; i < itemsOrder.length; i++) {
            totalCost += itemsOrder[i].getCost();
        }
        return totalCost;
    }
}
