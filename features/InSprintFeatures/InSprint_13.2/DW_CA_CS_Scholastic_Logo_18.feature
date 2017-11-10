Feature: Sitewide - Scholastic Branding - Reading Club Logo
	This feature is to validate the Sitewide - Scholastic Branding - Reading Club Logo scenarios


@Email
@Priority1
@DWCACSR-18
@Manual
@1
Scenario Outline:CSR sees the logo 'Scholastic Reading Club' positioned in the top left corner of the header layer of every page:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	Then CSR sees the logo 'Scholastic Reading Club' positioned in the top left corner of the header layer
	When CSR logs into the application by providing [UserInformation]
	Then CSR sees the logo 'Scholastic Reading Club' positioned in the top left corner of the header layer
	When CSR selects the order type as [Phone Order]
	Then CSR sees the logo 'Scholastic Reading Club' positioned in the top left corner of the header layer
	When CSR navigates to Verify Account Page
	Then CSR sees the logo 'Scholastic Reading Club' positioned in the top left corner of the header layer
	And CSR navigates to Order Entry Page
	When CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    Then CSR sees the logo 'Scholastic Reading Club' positioned in the top left corner of the header layer
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then CSR sees the logo 'Scholastic Reading Club' positioned in the top left corner of the header layer
	When CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then CSR sees the logo 'Scholastic Reading Club' positioned in the top left corner of the header layer
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then CSR sees the logo 'Scholastic Reading Club' positioned in the top left corner of the header layer
	
Examples:
  | UsingData 			|
  | CSR_Scholastic_LOGO	|
  

@Email
@Priority1
@DWCACSR-18
@Manual
@2
Scenario Outline:CSR sees the 'Scholastic Reading Club' image in the top left corner of the header layer is not hyperlinked in every page:[<UsingData>]
	
	Given CSR opens the rco-scholastic web site
	Then the 'Scholastic Reading Club' image in the top left corner of the header layer is not hyperlinked
	When CSR logs into the application by providing [UserInformation]
	Then the 'Scholastic Reading Club' image in the top left corner of the header layer is not hyperlinked
	When CSR selects the order type as [Phone Order]
	Then the 'Scholastic Reading Club' image in the top left corner of the header layer is not hyperlinked
	When CSR navigates to Verify Account Page
	Then the 'Scholastic Reading Club' image in the top left corner of the header layer is not hyperlinked
	And CSR navigates to Order Entry Page
	When CSR adds Student Clubs items to the cart
    And CSR navigates to Review Cart page from Order Entry page
    Then the 'Scholastic Reading Club' image in the top left corner of the header layer is not hyperlinked
	When CSR navigates to [Rewards & Coupons] page from [Review Cart] page
	Then the 'Scholastic Reading Club' image in the top left corner of the header layer is not hyperlinked
	When CSR navigates to [Payment] page from [Redeem & Rewards] page
	Then the 'Scholastic Reading Club' image in the top left corner of the header layer is not hyperlinked
	When CSR navigates to [Confirm & Submit] page from [Payment] page
	Then the 'Scholastic Reading Club' image in the top left corner of the header layer is not hyperlinked
	
Examples:
  | UsingData 							|
  | CSR_Scholastic_LOGO_not_hyperlinked	|
         	         