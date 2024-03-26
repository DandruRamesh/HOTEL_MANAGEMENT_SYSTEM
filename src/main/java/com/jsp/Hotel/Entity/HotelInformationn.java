package com.jsp.Hotel.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data annotation in this annotion having @setters,@getters,@tostring Annotations are present in @Data Annotion
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HotelInformationn {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hotelid;
	@Column(name="Hotel_Name")
	private String hotelname;
	@Column(name = "Contact_Number",length  = 10)
	private String contactnumber;
	@Column(name = "Price",length  = 10)
	private double price;
	@Column(name = "City")
	private String city;
	@Column(name = "Address")
	private String address;
	/**
	 * @return the hotelid
	 */
	public int getHotelid() {
		return hotelid;
	}
	/**
	 * @param hotelid the hotelid to set
	 */
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	/**
	 * @return the hotelname
	 */
	public String getHotelname() {
		return hotelname;
	}
	/**
	 * @param hotelname the hotelname to set
	 */
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	/**
	 * @return the contactnumber
	 */
	public String getContactnumber() {
		return contactnumber;
	}
	/**
	 * @param contactnumber the contactnumber to set
	 */
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
