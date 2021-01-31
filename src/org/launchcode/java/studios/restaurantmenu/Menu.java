package org.launchcode.java.studios.restaurantmenu;

import org.launchcode.java.demos.lsn4classes2.Course;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Menu {

   public ArrayList<MenuItem> items ;


   public Menu(ArrayList<MenuItem> items) {
        this.items = items;
    }


    public String getItems() {

     String items = "";

        for (MenuItem item: this.items) {
            items += item.toString();
        }

        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }


    public void addItem(MenuItem item){
        this.items.add(item);
    }

    public void removeItem(MenuItem item){
        this.items.remove(item);
    }

    public String getMenuItemDate(MenuItem menuItem){



       return menuItem.getLdt() ;
    }

    public ArrayList<MenuItem> printMenu(){
       ArrayList<MenuItem> allItems = new ArrayList<>();
        allItems.addAll(items);
        return allItems;
    }
    public MenuItem printSingleMenuItem(MenuItem item){
        return item;
    }






}
