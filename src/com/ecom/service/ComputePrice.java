package com.ecom.service;

import java.util.HashMap;
import java.util.Map;

import com.ecom.model.Basket;
import com.ecom.model.Offer;
import com.ecom.model.Product;

public class ComputePrice {

	public static void main (String[] args) {
		
		
		Product p1  = new Product("apple","APL");
		Product p4  = new Product("apple","APL");
		Product p3  = new Product("apple","APL");

		Product p2 = new Product("orange","ORG");

		Basket basket = new Basket();
		basket.addProduct(p1);
		basket.addProduct(p2);
		basket.addProduct(p3);
		basket.addProduct(p4);
		Offer of = new Offer(2,50);
		
		ComputeFinalClass fClass = new ComputeFinalClass();
		
		Map<String,Offer> offer = new HashMap<>();
		offer.put("APL",of);

		Map<String,Double> priclst = new HashMap<>();
		priclst.put("APL", 23.0);
		priclst.put("ORG", 20.0);
		
		System.out.print( fClass.getFinalCosting(basket, offer, priclst));
		
		
		
	}
	
}
