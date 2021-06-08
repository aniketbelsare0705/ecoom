package com.ecom.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Basket {

    Map<Product, Integer> items;    

    public Basket() {
        items = new LinkedHashMap<>();
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public void addProduct(Product product){
        if(items.containsKey(product)){
            items.compute(product, (p,q ) -> Integer.valueOf(q+1));
        }else{
            items.put(product, 1);
        }
    }

    public void removeProduct(Product product){
        if(items.get(product).intValue() > 1){
            items.compute(product, (p, q) -> Integer.valueOf(q-1));
        }else{
            items.remove(product);
        }
    }
}