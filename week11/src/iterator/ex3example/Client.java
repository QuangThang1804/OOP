package iterator.ex3example;

public class Client {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        restaurant.addItem(new Item("Pho", "01"));
        restaurant.addItem(new Item("Stuffed PanCake", "02"));
        restaurant.addItem(new Item("Fish cooked with fishsauce bowl", "03"));
        restaurant.addItem(new Item("Seafood noodle soup", "04"));

        ItemIterator<Item> iterator = restaurant.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println(item);
        }
    }
}
