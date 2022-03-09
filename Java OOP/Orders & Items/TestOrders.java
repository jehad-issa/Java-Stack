import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        item1.name = "mocha";
        item1.price = 3.5;

        item2.name = "latte";
        item2.price = 2.5;

        item3.name = "drip coffee";
        item3.price = 1.5;

        item4.name = "capuccino";
        item4.price = 5.5;

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        order1.total = 3.5;
        order2.total = 2.5;
        order3.total = 1.5;
        order4.total = 5.5;

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.println(order1);
        System .out.println("total is:"+ order1.total);

        order2.items.add(item1);
        order2.total += item1.price; 
        System.out.println(order2.total);

        order3.items.add(item4);
        order3.total += item4.price;
        System.out.println(order3.total);

        order4.items.add(item2);
        order4.total += item2.price;
        System.out.println(order4.total);

        order1.ready = true;
        System.out.println("Hello " + order1.name + " , Your Order is " +order1.ready);

        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += (item2.price*2);
        System.out.println(order4.items);
        System.out.println(order4.total);


        order2.ready = true;
        System.out.println("Hello " + order2.name + " , Your Order is " +  order2.ready);



        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}