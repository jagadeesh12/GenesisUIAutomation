@confirmationnow
Feature: Confirm & Submit, Order Confirmation - Teachers Checkout- Incorporate SFO, YTO, TE
	This feature is to validate the Teachers - Confirm & Submit, Order Confirmation scenarios


	Background:
		Given teacher open rco-scholastic web site


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@1
	Scenario Outline:Correct subtotal, Qty, taxes and Total displays when single SFO item is added in Submit and Order confirmation with GST & PST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO item to the cart for single student
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added item is grouped by student name in Confirm & Submit page
		And the student name displays correctly in Confirm & Submit page
		And Student Subtotal,Qty,GST,PST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:1]

		Examples:
			| UsingData                            									|
			| QA:Adds_single_SFO_item_for_one_student_Confirm_Submit_BC 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@2
	Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added in Submit and Order confirmation with GST & PST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds multiple SFO items to the cart for single student
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added item is grouped by student name in Confirm & Submit page
		And the student name displays correctly in Confirm & Submit page
		And Multiple items Student Subtotal,Qty,GST,PST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:2]

		Examples:
			| UsingData                            									|
			| QA:Adds_multiple_SFO_items_for_one_student_Confirm_Submit_BC 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@3
	Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added in Submit and Order confirmation with GST & QST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And Students Subtotal,Qty,GST,QST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:3]

		Examples:
			| UsingData                            											|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_QC 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@4
	Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added in CS and OC pages with GST & PST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And Students Subtotal,Qty,GST,PST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:4]

		Examples:
			| UsingData                            											|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_BC 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@5-1
	Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added in CS and OC pages with HST for NL:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And Students Subtotal,Qty,HST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:5]

		Examples:
			| UsingData                            											|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NL 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@5-2
	Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added in CS and OC pages with HST for NB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And Students Subtotal,Qty,HST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:5]

		Examples:
			| UsingData                            											|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NB 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@5-3
	Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added in CS and OC pages with HST for NS:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And Students Subtotal,Qty,HST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:5]

		Examples:
			| UsingData                            											|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NS 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@5-4
	Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added in CS and OC pages with HST for ON:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And Students Subtotal,Qty,HST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:5]

		Examples:
			| UsingData                            											|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_ON 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@5-5
	Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added in CS and OC pages with HST for PE:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And Students Subtotal,Qty,HST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:5]

		Examples:
			| UsingData                            											|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_PE 	|




	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@6-1
	Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added in CS and OC pages with GST for AB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And Students Subtotal,Qty,GST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:6]

		Examples:
			| UsingData                            											|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_AB 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@6-2
	Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added in CS and OC pages with GST for MB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And Students Subtotal,Qty,GST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:6]

		Examples:
			| UsingData                            											|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_MB 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@6-3
	Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added in CS and OC pages with GST for NT:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And Students Subtotal,Qty,GST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:6]

		Examples:
			| UsingData                            											|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NT 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@6-4
	Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added in CS and OC pages with GST for NU:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And Students Subtotal,Qty,GST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:6]

		Examples:
			| UsingData                            											|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NU 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@6-5
	Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added in CS and OC pages with GST for SK:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And Students Subtotal,Qty,GST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:6]

		Examples:
			| UsingData                            											|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_SK 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@6-6
	Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added in CS and OC pages with GST for YT:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And Students Subtotal,Qty,GST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:6]

		Examples:
			| UsingData                            											|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_YT 	|



	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@7
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added in CS and OC pages for GST & QST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And No taxes are charged for QC and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:7]

		Examples:
			| UsingData                            									|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_QC_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@8
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added in CS and OC pages for GST & PST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And No taxes are charged for BC and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:8]

		Examples:
			| UsingData                            									|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_BC_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@9-1
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added in CS and OC pages for HST for NL:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And No taxes are charged for HST and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:9]

		Examples:
			| UsingData                            												|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NL_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@9-2
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added in CS and OC pages for HST for NB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And No taxes are charged for HST and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:9]

		Examples:
			| UsingData                            												|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NB_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@9-3
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added in CS and OC pages for HST for NS:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And No taxes are charged for HST and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:9]

		Examples:
			| UsingData                            												|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NS_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@9-4
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added in CS and OC pages for HST for ON:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And No taxes are charged for HST and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:9]

		Examples:
			| UsingData                            												|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_ON_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@9-5
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added in CS and OC pages for HST for PE:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And No taxes are charged for HST and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:9]

		Examples:
			| UsingData                            												|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_PE_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@10-1
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added in CS and OC pages for GST for AB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And No taxes are charged for GST and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:10]

		Examples:
			| UsingData                            												|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_AB_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@10-2
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added in CS and OC pages for GST for MB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And No taxes are charged for GST and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:10]

		Examples:
			| UsingData                            												|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_MB_NoTax 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@10-3
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added in CS and OC pages for GST for NT:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And No taxes are charged for GST and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:10]

		Examples:
			| UsingData                            												|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NT_NoTax 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@10-4
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added in CS and OC pages for GST for NU:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And No taxes are charged for GST and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:10]

		Examples:
			| UsingData                            												|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NU_NoTax 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@10-5
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added in CS and OC pages for GST for SK:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And No taxes are charged for GST and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:10]

		Examples:
			| UsingData                            												|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_SK_NoTax 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@10-6
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added in CS and OC pages for GST for YT:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds SFO items to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student names displays correctly in Confirm & Submit page
		And No taxes are charged for GST and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:10]

		Examples:
			| UsingData                            												|
			| QA:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_YT_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@11
	Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST & QST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And YTO Subtotal,Qty,GST,QST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:11]

		Examples:
			| UsingData                            	|
			| QA:Adds_YTO_student_items_Confirm_Submit_QC 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@12
	Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST & PST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And YTO Subtotal,Qty,GST,PST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:12]

		Examples:
			| UsingData                            	|
			| QA:Adds_YTO_student_items_Confirm_Submit_BC 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@13-1
	Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes HST for NL:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And YTO Subtotal,Qty,HST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:13]

		Examples:
			| UsingData                            	|
			| QA:Adds_YTO_student_items_Confirm_Submit_NL 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@13-2
	Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes HST for NB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And YTO Subtotal,Qty,HST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:13]

		Examples:
			| UsingData                            	|
			| QA:Adds_YTO_student_items_Confirm_Submit_NB 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@13-3
	Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes HST for NS:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And YTO Subtotal,Qty,HST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:13]

		Examples:
			| UsingData                            	|
			| QA:Adds_YTO_student_items_Confirm_Submit_NS 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@13-4
	Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes HST for ON:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And YTO Subtotal,Qty,HST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:13]

		Examples:
			| UsingData                            	|
			| QA:Adds_YTO_student_items_Confirm_Submit_ON 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@13-5
	Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes HST for PE:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And YTO Subtotal,Qty,HST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:13]

		Examples:
			| UsingData                            	|
			| QA:Adds_YTO_student_items_Confirm_Submit_PE 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@14-1
	Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST for SK:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And YTO Subtotal,Qty,GST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:14]

		Examples:
			| UsingData                            	|
			| QA:Adds_YTO_student_items_Confirm_Submit_SK 	|
	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@14-2
	Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST for YT:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And YTO Subtotal,Qty,GST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:14]

		Examples:
			| UsingData                            	|
			| QA:Adds_YTO_student_items_Confirm_Submit_YT 	|
	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@14-3
	Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST for NU:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And YTO Subtotal,Qty,GST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:14]

		Examples:
			| UsingData                            	|
			| QA:Adds_YTO_student_items_Confirm_Submit_NU 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@14-4
	Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST for NT:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And YTO Subtotal,Qty,GST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:14]

		Examples:
			| UsingData                            	|
			| QA:Adds_YTO_student_items_Confirm_Submit_NT 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@14-5
	Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST for MB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And YTO Subtotal,Qty,GST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:14]

		Examples:
			| UsingData                            	|
			| QA:Adds_YTO_student_items_Confirm_Submit_MB 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@14-6
	Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST for AB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And YTO Subtotal,Qty,GST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:14]

		Examples:
			| UsingData                            	|
			| QA:Adds_YTO_student_items_Confirm_Submit_AB 	|



	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@15
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added in CS and OC pages for GST & QST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And No taxes are charged for QC and YTO Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:15]

		Examples:
			| UsingData                            			|
			| QA:Adds_YTO_student_items_Confirm_Submit_QC_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@16
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added in CS and OC pages for GST & PST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And No taxes are charged for BC and YTO Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:16]

		Examples:
			| UsingData                           			|
			| QA:Adds_YTO_student_items_Confirm_Submit_BC_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@17-1
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added in CS and OC pages for HST for NL:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And No taxes are charged for HST and YTO Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:17]

		Examples:
			| UsingData                            			|
			| QA:Adds_YTO_student_items_Confirm_Submit_NL_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@17-2
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added in CS and OC pages for HST for NB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And No taxes are charged for HST and YTO Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:17]

		Examples:
			| UsingData                            			|
			| QA:Adds_YTO_student_items_Confirm_Submit_NB_NoTax 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@17-3
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added in CS and OC pages for HST for NS:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And No taxes are charged for HST and YTO Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:17]

		Examples:
			| UsingData                            			|
			| QA:Adds_YTO_student_items_Confirm_Submit_NS_NoTax 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@17-4
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added in CS and OC pages for HST for ON:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And No taxes are charged for HST and YTO Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:17]

		Examples:
			| UsingData                            			|
			| QA:Adds_YTO_student_items_Confirm_Submit_ON_NoTax 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@17-5
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added in CS and OC pages for HST for PE:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And No taxes are charged for HST and YTO Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:17]

		Examples:
			| UsingData                            			|
			| QA:Adds_YTO_student_items_Confirm_Submit_PE_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@18-1
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added in CS and OC pages for GST for AB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And No taxes are charged for GST and YTO Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:18]

		Examples:
			| UsingData                            			|
			| QA:Adds_YTO_student_items_Confirm_Submit_AB_NoTax 	|



	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@18-2
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added in CS and OC pages for GST for MB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And No taxes are charged for GST and YTO Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:18]

		Examples:
			| UsingData                            			|
			| QA:Adds_YTO_student_items_Confirm_Submit_MB_NoTax 	|




	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@18-3
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added in CS and OC pages for GST for NT:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And No taxes are charged for GST and YTO Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:18]

		Examples:
			| UsingData                            			|
			| QA:Adds_YTO_student_items_Confirm_Submit_NT_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@18-4
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added in CS and OC pages for GST for NU:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And No taxes are charged for GST and YTO Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:18]

		Examples:
			| UsingData                            			|
			| QA:Adds_YTO_student_items_Confirm_Submit_NU_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@18-5
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added in CS and OC pages for GST for SK:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And No taxes are charged for GST and YTO Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:18]

		Examples:
			| UsingData                            			|
			| QA:Adds_YTO_student_items_Confirm_Submit_SK_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@18-6
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added in CS and OC pages for GST for YT:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the YTO section in Confirm & Submit page
		And No taxes are charged for GST and YTO Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:18]

		Examples:
			| UsingData                            			|
			| QA:Adds_YTO_student_items_Confirm_Submit_YT_NoTax 	|



	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@19
	Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST & QST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And Teacher Exclusives Subtotal,Qty,GST,QST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:19]

		Examples:
			| UsingData                            				|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_QC 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@20
	Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST & PST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	 #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And Teacher Exclusives Subtotal,Qty,GST,PST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:20]

		Examples:
			| UsingData                            				|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_BC 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@21-1
	Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes HST for NL:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	 #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And Teacher Exclusives Subtotal,Qty,HST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:21]

		Examples:
			| UsingData                            				|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NL 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@21-2
	Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes HST for NB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And Teacher Exclusives Subtotal,Qty,HST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:21]

		Examples:
			| UsingData                            				|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NB 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@21-3
	Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes HST for NS:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	  #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And Teacher Exclusives Subtotal,Qty,HST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:21]

		Examples:
			| UsingData                            				|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NS 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@21-4
	Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes HST for ON:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	  #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And Teacher Exclusives Subtotal,Qty,HST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:21]

		Examples:
			| UsingData                            				|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_ON 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@21-5
	Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes HST for PE:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	  #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And Teacher Exclusives Subtotal,Qty,HST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:21]

		Examples:
			| UsingData                            				|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_PE 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@22-1
	Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST for AB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	 #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And Teacher Exclusives Subtotal,Qty,GST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:22]

		Examples:
			| UsingData                            				|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_AB 	|



	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@22-2
	Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST for MB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	 #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And Teacher Exclusives Subtotal,Qty,GST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:22]

		Examples:
			| UsingData                            				|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_MB 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@22-3
	Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST for NT:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And Teacher Exclusives Subtotal,Qty,GST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:22]

		Examples:
			| UsingData                            				|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NT 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@22-4
	Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST for NU:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And Teacher Exclusives Subtotal,Qty,GST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:22]

		Examples:
			| UsingData                            				|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NU 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@22-5
	Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST for SK:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And Teacher Exclusives Subtotal,Qty,GST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:22]

		Examples:
			| UsingData                            				|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_SK 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@22-6
	Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST for YT:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And Teacher Exclusives Subtotal,Qty,GST,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:22]

		Examples:
			| UsingData                            				|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_YT 	|



	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@23
	Scenario Outline:No taxes charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added in CS and OC pages for GST & QST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	 #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And No taxes are charged for QC and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:23]

		Examples:
			| UsingData                            					|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_QC_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@24
	Scenario Outline:No taxes charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added in CS and OC pages for GST & PST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	 #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And No taxes are charged for BC and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:24]

		Examples:
			| UsingData                           					|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_BC_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@25-1
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added in CS and OC pages for HST for NL:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	 #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And No taxes are charged for HST and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:25]

		Examples:
			| UsingData                            					|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NL_NoTax 	|



	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@25-2
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added in CS and OC pages for HST for NB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	 #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And No taxes are charged for HST and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:25]

		Examples:
			| UsingData                            					|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NB_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@25-3
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added in CS and OC pages for HST for NS:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	 #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And No taxes are charged for HST and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:25]

		Examples:
			| UsingData                            					|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NS_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@25-4
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added in CS and OC pages for HST for ON:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	 #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And No taxes are charged for HST and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:25]

		Examples:
			| UsingData                            					|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_ON_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@25-5
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added in CS and OC pages for HST for PE:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	 #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And No taxes are charged for HST and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:25]

		Examples:
			| UsingData                            					|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_PE_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@26-1
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added in CS and OC pages for GST for AB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	 #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And No taxes are charged for GST and Teacher Exclusives Subtotal,Qty,Pre & Post Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:26]

		Examples:
			| UsingData                            					|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_AB_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@26-2
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added in CS and OC pages for GST for MB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	 #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And No taxes are charged for GST and Teacher Exclusives Subtotal,Qty,Pre & Post Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:26]

		Examples:
			| UsingData                            					|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_MB_NoTax 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@26-3
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added in CS and OC pages for GST for NT:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	 #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And No taxes are charged for GST and Teacher Exclusives Subtotal,Qty,Pre & Post Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:26]

		Examples:
			| UsingData                            					|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NT_NoTax 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@26-4
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added in CS and OC pages for GST for NU:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	 #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And No taxes are charged for GST and Teacher Exclusives Subtotal,Qty,Pre & Post Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:26]

		Examples:
			| UsingData                            					|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NU_NoTax 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@26-5
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added in CS and OC pages for GST for SK:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	 #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And No taxes are charged for GST and Teacher Exclusives Subtotal,Qty,Pre & Post Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:26]

		Examples:
			| UsingData                            					|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_SK_NoTax 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@26-6
	Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added in CS and OC pages for GST for YT:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
	 #And teacher navigates to YTO page
		And teacher adds Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the Teacher Exclusives section in Confirm & Submit page
		And No taxes are charged for GST and Teacher Exclusives Subtotal,Qty,Pre & Post Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:26]

		Examples:
			| UsingData                            					|
			| QA:Adds_YTO_teacher_catalogue_items_Confirm_Submit_YT_NoTax 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@27
	Scenario Outline:Correct SFO,YTO Tota and Cart Total displays with GST & QST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO and YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO and YTO sections in Confirm & Submit page
		And SFO,YTO Total,GST,QST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:27]

		Examples:
			| UsingData                           |
			| QA:Adds_SFO_YTO_items_Confirm_Submit_QC 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@28
	Scenario Outline:Correct SFO,YTO Total and Cart Total displays with GST & PST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO and YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO and YTO sections in Confirm & Submit page
		And SFO,YTO Total,GST,PST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:28]

		Examples:
			| UsingData                          	|
			| QA:Adds_SFO_YTO_items_Confirm_Submit_BC 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@29-1

	Scenario Outline:Correct SFO,YTO Total and Cart Total displays with HST for NL:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO and YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO and YTO sections in Confirm & Submit page
		And SFO,YTO Total,HST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:29]

		Examples:
			| UsingData                           |
			| QA:Adds_SFO_YTO_items_Confirm_Submit_NL 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@29-2

	Scenario Outline:Correct SFO,YTO Total and Cart Total displays with HST for NB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO and YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO and YTO sections in Confirm & Submit page
		And SFO,YTO Total,HST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:29]

		Examples:
			| UsingData                           |
			| QA:Adds_SFO_YTO_items_Confirm_Submit_NB	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@29-3

	Scenario Outline:Correct SFO,YTO Total and Cart Total displays with HST for NS:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO and YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO and YTO sections in Confirm & Submit page
		And SFO,YTO Total,HST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:29]

		Examples:
			| UsingData                           |
			| QA:Adds_SFO_YTO_items_Confirm_Submit_NS 	|

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@29-4

	Scenario Outline:Correct SFO,YTO Total and Cart Total displays with HST for ON:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO and YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO and YTO sections in Confirm & Submit page
		And SFO,YTO Total,HST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:29]

		Examples:
			| UsingData                           |
			| QA:Adds_SFO_YTO_items_Confirm_Submit_ON 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@29-5
	Scenario Outline:Correct SFO,YTO Total and Cart Total displays with HST for PE:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO and YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO and YTO sections in Confirm & Submit page
		And SFO,YTO Total,HST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:29]

		Examples:
			| UsingData                           |
			| QA:Adds_SFO_YTO_items_Confirm_Submit_PE 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@30-1

	Scenario Outline:Correct SFO,YTO Total and Cart Total displays with GST for AB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO and YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO and YTO sections in Confirm & Submit page
		And SFO,YTO Total,GST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:30]

		Examples:
			| UsingData                           |
			| QA:Adds_SFO_YTO_items_Confirm_Submit_AB 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@30-2

	Scenario Outline:Correct SFO,YTO Total and Cart Total displays with GST for MB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO and YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO and YTO sections in Confirm & Submit page
		And SFO,YTO Total,GST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:30]

		Examples:
			| UsingData                           |
			| QA:Adds_SFO_YTO_items_Confirm_Submit_MB   |

	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@30-3

	Scenario Outline:Correct SFO,YTO Total and Cart Total displays with GST for NT:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO and YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO and YTO sections in Confirm & Submit page
		And SFO,YTO Total,GST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:30]

		Examples:
			| UsingData                           |
			| QA:Adds_SFO_YTO_items_Confirm_Submit_NT 	|

	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@30-4

	Scenario Outline:Correct SFO,YTO Total and Cart Total displays with GST for NS:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO and YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO and YTO sections in Confirm & Submit page
		And SFO,YTO Total,GST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:30]

		Examples:
			| UsingData                           |
			| QA:Adds_SFO_YTO_items_Confirm_Submit_NU 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@30-5

	Scenario Outline:Correct SFO,YTO Total and Cart Total displays with GST for SK:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO and YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO and YTO sections in Confirm & Submit page
		And SFO,YTO Total,GST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:30]

		Examples:
			| UsingData                           |
			| QA:Adds_SFO_YTO_items_Confirm_Submit_SK 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@30-6

	Scenario Outline:Correct SFO,YTO Total and Cart Total displays with GST for YT:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO and YTO items to the cart
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO and YTO sections in Confirm & Submit page
		And SFO,YTO Total,GST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:30]

		Examples:
			| UsingData                           |
			| QA:Adds_SFO_YTO_items_Confirm_Submit_YT 	|




	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@31
	Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with GST & QST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO,YTO and Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO,YTO and Teacher Exclusives sections in Confirm & Submit page
		And SFO,YTO,Teacher Exclusives Total,GST,QST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:31]

		Examples:
			| UsingData                           	|
			| QA:Adds_SFO_YTO_TE_items_Confirm_Submit_QC 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@32
	Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with GST & PST:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO,YTO and Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO,YTO and Teacher Exclusives sections in Confirm & Submit page
		And SFO,YTO,Teacher Exclusives Total,GST,PST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:32]

		Examples:
			| UsingData                          		|
			| QA:Adds_SFO_YTO_TE_items_Confirm_Submit_BC 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@33-1
	Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with HST for NL:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO,YTO and Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO,YTO and Teacher Exclusives sections in Confirm & Submit page
		And SFO,YTO,Teacher Exclusives Total,HST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:33]

		Examples:
			| UsingData                         		|
			| QA:Adds_SFO_YTO_TE_items_Confirm_Submit_NL 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@33-2
	Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with HST for NB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO,YTO and Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO,YTO and Teacher Exclusives sections in Confirm & Submit page
		And SFO,YTO,Teacher Exclusives Total,HST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:33]

		Examples:
			| UsingData                         		|
			| QA:Adds_SFO_YTO_TE_items_Confirm_Submit_NB	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@33-3
	Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with HST for NS:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO,YTO and Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO,YTO and Teacher Exclusives sections in Confirm & Submit page
		And SFO,YTO,Teacher Exclusives Total,HST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:33]

		Examples:
			| UsingData                         		|
			| QA:Adds_SFO_YTO_TE_items_Confirm_Submit_NS 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@33-4
	Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with HST for ON:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO,YTO and Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO,YTO and Teacher Exclusives sections in Confirm & Submit page
		And SFO,YTO,Teacher Exclusives Total,HST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:33]

		Examples:
			| UsingData                         		|
			| QA:Adds_SFO_YTO_TE_items_Confirm_Submit_ON 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@33-5
	Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with HST for PE:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO,YTO and Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO,YTO and Teacher Exclusives sections in Confirm & Submit page
		And SFO,YTO,Teacher Exclusives Total,HST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:33]

		Examples:
			| UsingData                         		|
			| QA:Adds_SFO_YTO_TE_items_Confirm_Submit_PE 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@34-1
	Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with GST for AB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO,YTO and Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO,YTO and Teacher Exclusives sections in Confirm & Submit page
		And SFO,YTO,Teacher Exclusives Total,GST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:34]

		Examples:
			| UsingData                           	|
			| QA:Adds_SFO_YTO_TE_items_Confirm_Submit_AB 	|




	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@34-2

	Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with GST for MB:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO,YTO and Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO,YTO and Teacher Exclusives sections in Confirm & Submit page
		And SFO,YTO,Teacher Exclusives Total,GST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:34]

		Examples:
			| UsingData                           	|
			| QA:Adds_SFO_YTO_TE_items_Confirm_Submit_MB	|



	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@34-3
	Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with GST for NT:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO,YTO and Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO,YTO and Teacher Exclusives sections in Confirm & Submit page
		And SFO,YTO,Teacher Exclusives Total,GST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:34]

		Examples:
			| UsingData                           	|
			| QA:Adds_SFO_YTO_TE_items_Confirm_Submit_NT 	|



	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@34-4
	Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with GST for NU:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO,YTO and Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO,YTO and Teacher Exclusives sections in Confirm & Submit page
		And SFO,YTO,Teacher Exclusives Total,GST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:34]

		Examples:
			| UsingData                           	|
			| QA:Adds_SFO_YTO_TE_items_Confirm_Submit_NU 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@34-5
	Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with GST for SK:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO,YTO and Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO,YTO and Teacher Exclusives sections in Confirm & Submit page
		And SFO,YTO,Teacher Exclusives Total,GST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:34]

		Examples:
			| UsingData                           	|
			| QA:Adds_SFO_YTO_TE_items_Confirm_Submit_SK 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@34-6
	Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with GST for YT:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to YTO page
		And teacher adds multiple SFO,YTO and Teacher Exclusives items to the cart
		And teacher navigates to [Review Cart] page from Search results page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO,YTO and Teacher Exclusives sections in Confirm & Submit page
		And SFO,YTO,Teacher Exclusives Total,GST and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:34]

		Examples:
			| UsingData                           	|
			| QA:Adds_SFO_YTO_TE_items_Confirm_Submit_YT 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@35
	Scenario Outline:No prices are charged for Student subtotal, taxes, Totals when teacher adds single FreePick item to the cart for BC province:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds FreePick item to the cart for single student
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added item is grouped by student name in Confirm & Submit page
		And the student name displays correctly in Confirm & Submit page
		And No prices are charged for Student Subtotal,GST,PST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:35]

		Examples:
			| UsingData                            									|
			| QA:Adds_single_FreePick_item_for_one_student_Confirm_Submit_BC 	|


	@Confirm_And_Submit
	@Order_Confirmation
	@Priority1
	@SCSCOD-7169
	@InSprint_15.3
	@36
	Scenario Outline:No prices are charged for Student subtotal, taxes, Totals when teacher adds multiple FreePick items to the cart for BC province:[<UsingData>]

		Given teacher logs into the application by providing [UserInformation]
		And teacher navigates to SFO page
		And teacher adds FreePick item to the cart for multiple students
		And teacher navigates to [Review Cart] page
		And teacher navigates to [Redemptions & Rewards] page
		And teacher navigates to the [Payments] page
		When teacher navigates to [Confirm & Submit] page
		Then teacher sees the SFO section in Confirm & Submit page
		And added items are grouped by student name in Confirm & Submit page
		And the student name displays correctly in Confirm & Submit page
		And No prices are charged for multiple Students Subtotal,GST,PST,Total,SFO Total and Cart Total displays correctly in Confirm & Submit page
		And teacher sees the same details on order confirmation page [scen:36]

		Examples:
			| UsingData                            											|
			| QA:Adds_multiple_FreePick_items_for_multiple_students_Confirm_Submit_BC 	|