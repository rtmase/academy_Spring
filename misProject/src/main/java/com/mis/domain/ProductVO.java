package com.mis.domain;

import java.util.Date;


/**
 * 테이블 데이터를 객체로 사용할 ProductVO
 * @author SeungYu
 *
 */
public class ProductVO {
   
   private int prodcod;
   private String prodname;
   private int price;
   private int quantity;
   private Date regdate;
   private Date moddate;

   // getter/setter 생성
   

   public int getProdcod() {
	return prodcod;
}

public void setProdcod(int prodcod) {
	this.prodcod = prodcod;
}

public String getProdname() {
	return prodname;
}

public void setProdname(String prodname) {
	this.prodname = prodname;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public Date getRegdate() {
	return regdate;
}

public void setRegdate(Date regdate) {
	this.regdate = regdate;
}

public Date getModdate() {
	return moddate;
}

public void setModdate(Date moddate) {
	this.moddate = moddate;
}

// toString 생성
   @Override
   public String toString() {
      return "ProductVO [prodcod=" + prodcod + ", prodname=" + prodname + ", price=" + price + ", quantity="
            + quantity + ", regdate=" + regdate + ", moddate=" + moddate + "]";
   }

}