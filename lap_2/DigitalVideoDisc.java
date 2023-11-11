package lap_2;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String category, String title, Float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category, String title, Float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, Float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // public class Cart {
    // public static final int MAX_ORDER = 20;
    // private DigitalVideoDisc itemsOrder[] = new DigitalVideoDisc[MAX_ORDER];

    // private int qtyOrdered = 0;
    // // private float totalCost = 0;

    // public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    // itemsOrder[qtyOrdered] = disc;
    // qtyOrdered++;
    // }

    // public void removeDigitalVideoDisc(DigitalVideoDisc disc) {

    // for (int i = 0; i < qtyOrdered; i++) {
    // if (itemsOrder[i] == disc) {
    // for (int j = i; j < qtyOrdered - 1; j++) {
    // itemsOrder[j] = itemsOrder[j + 1];
    // }
    // qtyOrdered--;
    // break;
    // }
    // }
    // }

    // public float totalCost() {
    // float totalCost = 0;
    // for (int i = 0; i < MAX_ORDER; i++) {
    // totalCost += itemsOrder[i].cost;
    // }
    // return totalCost;
    // }

    // }

    // public static void main(String[] args) {

    // // DigitalVideoDisc Dig = new DigitalVideoDisc(null);

    // Cart anOrder = new Cart();

    // DigitalVideoDisc dvd1 = new DigitalVideoDisc("Title1", "Category1",
    // "Director1", 120, 19.99f);
    // DigitalVideoDisc dvd2 = new DigitalVideoDisc("Title2", "Category2",
    // "Director2", 150, 24.99f);

    // anOrder.addDigitalVideoDisc(dvd1);
    // anOrder.addDigitalVideoDisc(dvd2);

    // System.err.println(anOrder.totalCost());
    // }

}
