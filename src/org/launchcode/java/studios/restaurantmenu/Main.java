package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;



public class Main {




    public static final FortyTwo objectValue = new FortyTwo();
    public  String x = "asdf";

    public static void main(String[] args) throws Exception {




        FortyTwo ft = new FortyTwo();
        System.out.println(ft.intValue = 8);

        System.out.println(objectValue.intValue = 6);
        System.out.println(objectValue.intValue = 12);




        ArrayList<MenuItem> items = new ArrayList<>();

        MenuItem menuItem = new MenuItem(10.00,"Pizza","main course");
        MenuItem menuItem1 = new MenuItem(20.00,"Ice Cream", "appetizer");
        items.add(menuItem);
        items.add(menuItem1);

        Menu menu = new Menu(items);
        
        System.out.println(menuItem.equals(menuItem1));
        System.out.println(menu.getItems());
        System.out.println(menu.printSingleMenuItem(menuItem));
        System.out.println(menu.printMenu());

    }





}
