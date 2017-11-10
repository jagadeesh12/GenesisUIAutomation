package com.dw.automation.sections;

import org.apache.commons.configuration.Configuration;

import com.dw.automation.beans.ProductInfoBean;

public interface IYourTeacherOrdersCartSection {

	void clickOnYTOItem(Configuration data);

	void verifyYTOFunctionalities();

	void verifyItemsOnYTOCart();

	void removeAllYTOItem();

	ProductInfoBean fillTeacherDonatedItemBean(String donatedItemId);

	void verifyYTOHeader();

	void removeYTOItemFromStudentTable(Configuration data, String confirmationStatus);

	void VerifyLastAddedItemOnFirstPosition();

	void updateBonusPointQuantity(String itemid, String quantity);

}
