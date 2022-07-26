public class Bascet {
    protected static int count = 0;
    private String items = "";
    protected static int totalPrice = 0;
    protected int limit;
    protected double totalWeight = 0; //gramm
    protected int totalCount = 0;

    protected static double allPrice;
    protected static int allCountBasket = 0;
    protected static double averageBasketPrice = 0;
    protected static double averageBasketPrices = 0;


    public Bascet() {
        allCountBasket = allCountBasket + 1;
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;

    }

    public Bascet(int limit) {
        this.limit = limit;
    }

    public Bascet(String items, int totalPrice, double totalWeight) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public static double getAverageBasketPrice() {
        averageBasketPrice = allPrice / Bascet.count;
        return averageBasketPrice;
    }

    public double getAverageBasketPrices() {
        averageBasketPrices = totalPrice / totalCount;
        return averageBasketPrices;
    }

    public static double getAllPrice() {
        return allPrice;
    }

    public static int getAllCountBasket() {
        return allCountBasket;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Bascet.count = Bascet.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1, 30.0);
    }

    public void add(String name, int price, int count, double weight) {
        allPrice = allPrice + price;
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " Стоимость товара." + " - " + weight + " Вес товара.";
        totalPrice = totalPrice + count * price;
        totalCount = totalCount + count;

    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public String toString() {
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
        return items;
    }
}


