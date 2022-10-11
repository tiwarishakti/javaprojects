package com.ProductInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(length=20)
	private String Pname;
	@Column
	private int Price;
	public int getPid() {
		return id;
	}
	public void setProductId(int ProductId) {
		this.id = ProductId;
	}
	public String getProductName() {
		return Pname;
	}
	public void setProductName(String Pname) {
		this.Pname = Pname;
	}
	public int getProductPrice() {
		return Price;
	}
	public void setProductPrice(int Price) {
		this.Price = Price;
	}

}