package com.dw.automation.sections;

public interface IParentCartSection {

	public void verifyParentCartItems();

	void verifySubOrderTotal();

	public void verifySubQuentityTotal();

	public void verifyItemTotalQuentity();

	public void verifyOrderFinalAmount();

	void verifyParentCartTotalAmount();

	void verifyParentCartTotalQuentity();

	void verifyParentCartDeleteLink();

	void verifyParentCartWishListLink();

	void verifyParentCartItenImage();

	void verifyParentCartItemName();

	void verifyParentCartItemReadingLevel();

	void verifyParentCartItemPrice();

	void verifyParentCartItemQuentity();

	void verifyParentCartItemAge();

	void verifyParentCartItemGrade();

	void verifyProductSequenceInCart(String itemId1, String itemId2);

	void verifySortedItemListOnParentCartPage();

	public void verifyReccomendedTeacherNameOnReviewCartPage();

}
