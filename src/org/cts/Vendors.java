package org.cts;

public class Vendors extends Company{
	public void ventorId() {
		System.out.println("Vendor Id is 8088");
	}
	public void vendorName() {
		System.out.println("Vendor Name is Hindustan");
	}
public static void main(String[] args) {
	Vendors v = new Vendors();
	v.ventorId();
	v.vendorName();
	v.compId();
	v.compName();
	
}
}
