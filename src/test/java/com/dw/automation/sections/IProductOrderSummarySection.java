package com.dw.automation.sections;

import org.apache.commons.configuration.Configuration;

public interface IProductOrderSummarySection {

	void verifyOrderSummary(Configuration testData);
	
	void verifyOrderTotalDue_RewardsCouponsPage(Configuration testData);

	void verifySumOfEarnedAndBonusPoints(int bonusPoints);

	String getBonusPoints();

	void verifyEmptyCartTotal();

	void verifyOrderSummaryUI();
}