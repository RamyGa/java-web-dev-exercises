package org.launchcode.java.studios.restaurantmenu;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MenuItem {


   private double price;
   private String description;
   private final String category;
   private final LocalDateTime ldt = LocalDateTime.now();




    public MenuItem(Double price, String description, String category) throws Exception {
        String appetizer = "appetizer";
        String mainCourse = "main course";
        String dessert = "dessert";


        if(price != null){
            this.price = price;
        }

        if(description != null && !description.isEmpty()){
            this.description = description;
        }


        if(category.toLowerCase().contains(appetizer) || category.toLowerCase().contains(mainCourse) || category.toLowerCase().contains(dessert)){
            this.category = category;
        }
        else{
            throw new Exception("Sorry you need to add one of these categories: "+ appetizer + " or " +mainCourse+" or " + dessert);
        }

    }

    public String getLdt() {
        return dateTimeFormatter(ldt);
    }

    private String dateTimeFormatter(LocalDateTime now){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return formatter.format(now);
    }
    @Override
    public String toString() {

        return
                "price=" + price +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", date=" + dateTimeFormatter(ldt) + "\n"
                ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem item = (MenuItem) o;

        if (!description.equals(item.description)) return false;
        return category.equals(item.category);
    }

    @Override
    public int hashCode() {
        int result = description.hashCode();
        result = 31 * result + category.hashCode();
        return result;
    }
}
