package com.dw.automation.beans;

public class ProductInfoBean {

	private String studentName;
	private String itemNumber;
	private String itemTitle;
	private String flyer;
	private String coupon;
	private String price;
	private String quantity;
	private String grades;
	private String ages;
	private String readingLevel;
	private String inThisPack;
	private String series;
	private String points;
	private String author;
	private String dateOfOrder;
	private String bonuspt;
	private String bonusqty;
	private String couponItemPrice;
	private String couponDescription;
	private String donatedItemNumber;
	private String listtype;

	public String getListType() {
		return listtype;
	}

	public void setListType(String listtype) {
		this.listtype = listtype;
	}

	public String getDonatedItemNumber() {
		return donatedItemNumber;
	}

	public void setDonatedItemNumber(String donatedItemNumber) {
		this.donatedItemNumber = donatedItemNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getItemTitle() {
		return itemTitle;
	}

	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getFlyer() {
		return flyer;
	}

	public void setFlyer(String flyer) {
		this.flyer = flyer;
	}

	public String getCoupon() {
		return coupon;
	}

	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getGrades() {
		return grades;
	}

	public void setGrades(String grades) {
		this.grades = grades;
	}

	public String getAges() {
		return ages;
	}

	public void setAges(String ages) {
		this.ages = ages;
	}

	public String getReadingLevel() {
		return readingLevel;
	}

	public void setReadingLevel(String readingLevel) {
		this.readingLevel = readingLevel;
	}

	public String getInThisPack() {
		return inThisPack;
	}

	public void setInThisPack(String inThisPack) {
		this.inThisPack = inThisPack;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDateOfOrder() {
		return dateOfOrder;
	}

	public void setDateOfOrder(String dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public String getBonusPoint() {
		return bonuspt;
	}

	public String getBonusPointQuantity() {
		return bonusqty;
	}

	public void setBonusPoint(String bp) {
		this.bonuspt = bp;
	}

	public void setBonusPointQuantity(String bpqty) {
		this.bonusqty = bpqty;
	}

	public String getCouponItemPrice() {
		return couponItemPrice;
	}

	public void setCouponItemPrice(String couponItemPrice) {
		this.couponItemPrice = couponItemPrice;
	}

	@Override
	public String toString() {
		return "ProductInfoBean [studentName=" + studentName + ", itemNumber="
				+ itemNumber + ", itemTitle=" + itemTitle + ", flyer=" + flyer
				+ ", coupon=" + coupon + ", price=" + price + ", quantity=" + quantity
				+ ", grades=" + grades + ", ages=" + ages + ", readingLevel="
				+ readingLevel + ", inThisPack=" + inThisPack + ", series=" + series
				+ ", points=" + points + ", author=" + author + ", dateOfOrder="
				+ dateOfOrder + ", bonuspt=" + bonuspt + ", bonusqty=" + bonusqty
				+ ", couponItemPrice=" + couponItemPrice + ", couponDescription="
				+ couponDescription + "]";
	}

	public String getCouponDescription() {
		return couponDescription;
	}

	public void setCouponDescription(String couponDescription) {
		this.couponDescription = couponDescription;
	}
}
