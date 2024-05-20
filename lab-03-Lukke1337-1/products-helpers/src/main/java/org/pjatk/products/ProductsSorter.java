package org.pjatk.products;

import java.util.ArrayList;

public class ProductsSorter {

    //można wykorzystać algorytm sortowania przez wstawiania
    public static ArrayList<Product> sort(ArrayList<Product> products){

        ArrayList<Product> result = new ArrayList<>();
        for(Product product : products){
            int index = 0;
            for(Product p: result){
                if(product.price>p.price)
                    index++;
            }
            result.add(index, product);
        }
        return result;
    }

    public static Product mostExpensive(ArrayList<Product> products){

        ArrayList<Product> result = new ArrayList<>();
        for (Product product : products){
            System.out.println("Sortowanie wg. Cena (od najniższej): ");
            System.out.println(result);

        }

        return null;
    }


    public static Product theCheapest(ArrayList<Product> products){
        return null;
    }

    public static ArrayList<Product> theCheapest(ArrayList<Product> products, int n){
        return null;
    }
}
