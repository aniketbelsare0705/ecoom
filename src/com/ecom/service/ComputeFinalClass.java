package com.ecom.service;

import java.util.Map;

import com.ecom.model.Basket;
import com.ecom.model.Offer;
import com.ecom.model.Product;

public class ComputeFinalClass {

	
	private Basket basket;
	private Offer offer;
	
	
	public ComputeFinalClass(Basket basket, Offer offer) {
		super();
		this.basket = basket;
		this.offer = offer;
		
	}
	public ComputeFinalClass() {
		super();
		
	}
	
	public Basket getBasket() {
		return basket;
	}
	public void setBasket(Basket basket) {
		this.basket = basket;
	}
	public Offer getOffer() {
		return offer;
	}
	public void setOffer(Offer offer) {
		this.offer = offer;
	}
		
	public double getFinalCosting (Basket basket, Map<String,Offer> offer,Map<String,Double> pricelist) {
		double  finalPrice = 0.0;
		
		for (Map.Entry<Product, Integer> entry : basket.getItems().entrySet()) {

			String pname = entry.getKey().getpcode();
			int qty = entry.getValue();
			
			
			Offer off = offer.get(pname);
			 
			
			if(off!=null)
			{
				int nonDis = (qty % off.getQuantity());

				int disis = (qty / off.getQuantity());
				
				
			finalPrice = finalPrice+((((pricelist.get(pname)*off.getQuantity())*off.getDiscount())/100)*disis);
			finalPrice = finalPrice+((pricelist.get(pname)*nonDis));
			
			}else
				finalPrice = finalPrice+(pricelist.get(pname)*qty);
		}
		
		return finalPrice;
		
	}
	
}
