package com.jsp.Hotel.Entity;

import java.time.LocalDate;

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

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class BookInformation {
	
	
	/**
	 * @return the bookingid
	 */
	public Integer getBookingid() {
		return bookingid;
	}
	/**
	 * @param bookingid the bookingid to set
	 */
	public void setBookingid(Integer bookingid) {
		this.bookingid = bookingid;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the emailid
	 */
	public String getEmailid() {
		return emailid;
	}
	/**
	 * @param emailid the emailid to set
	 */
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	/**
	 * @return the mobilenumber
	 */
	public String getMobilenumber() {
		return mobilenumber;
	}
	/**
	 * @param mobilenumber the mobilenumber to set
	 */
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	/**
	 * @return the bookingdate
	 */
	public LocalDate getBookingdate() {
		return Bookingdate;
	}
	/**
	 * @param bookingdate the bookingdate to set
	 */
	public void setBookingdate(LocalDate bookingdate) {
		Bookingdate = bookingdate;
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
	 * @return the noofdays
	 */
	public String getNoofdays() {
		return noofdays;
	}
	/**
	 * @param noofdays the noofdays to set
	 */
	public void setNoofdays(String noofdays) {
		this.noofdays = noofdays;
	}
	/**
	 * @return the noofpersons
	 */
	public String getNoofpersons() {
		return noofpersons;
	}
	/**
	 * @param noofpersons the noofpersons to set
	 */
	public void setNoofpersons(String noofpersons) {
		this.noofpersons = noofpersons;
	}
	/**
	 * @return the noofrooms
	 */
	public String getNoofrooms() {
		return noofrooms;
	}
	/**
	 * @param noofrooms the noofrooms to set
	 */
	public void setNoofrooms(String noofrooms) {
		this.noofrooms = noofrooms;
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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookingid;
	@Column(name = "First_Name")
private String firstname;
	@Column(name = "Last_Name")
private String lastname;
	@Column(name = "Email")
private String emailid;
	@Column(name = "Mobile_Number",length = 10)
private String mobilenumber;
	@Column(name = "Booking_Date" ,length = 10)
private LocalDate Bookingdate;
	@Column(name = "Hotel_Name")
private String hotelname;
	@Column(name = "No_Of_Days",length = 10)
private String noofdays;
	@Column(name = "No_Of_Persions",length = 10)
private String noofpersons;
	@Column(name = "No_Of_Rooms",length = 10)
private String noofrooms;
	@Column(name = "Price",length = 10)
private double price;
//	/**
//	 * @return
//	 */
//	public Object getPrice() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	/**
//	 * @return
//	 */
//	public LocalDate getBookingdate() {
//		// TODO Auto-generated method stub
//		return  null;
//	}
}
