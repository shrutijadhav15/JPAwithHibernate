package org.tnsif.unidirectional;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
private int  pincode;
private String area;
private String city;
private String state;
public int getPincode() {
	return pincode;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}

}

