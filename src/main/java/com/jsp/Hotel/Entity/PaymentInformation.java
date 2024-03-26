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

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PaymentInformation {
	/**
	 * @return the paymentid
	 */
	public int getPaymentid() {
		return paymentid;
	}
	/**
	 * @param paymentid the paymentid to set
	 */
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	/**
	 * @return the cardnumber
	 */
	public String getCardnumber() {
		return cardnumber;
	}
	/**
	 * @param cardnumber the cardnumber to set
	 */
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	/**
	 * @return the cardname
	 */
	public String getCardname() {
		return cardname;
	}
	/**
	 * @param cardname the cardname to set
	 */
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	/**
	 * @return the expiredate
	 */
	public LocalDate getExpiredate() {
		return expiredate;
	}
	/**
	 * @param expiredate the expiredate to set
	 */
	public void setExpiredate(LocalDate expiredate) {
		this.expiredate = expiredate;
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
	private int paymentid;
	@Column(name = "Card_Number", length = 16)
	private String cardnumber;
	@Column(name = "Card_Name")
	private String cardname;
	@Column(name = "Expire_Date")
	private LocalDate expiredate;
	@Column(name = "Price")
	private double price;
}
