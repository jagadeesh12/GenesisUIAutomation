@CouponModify
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
  | InSprint15.3:Adds_single_SFO_item_for_one_student_Confirm_Submit_BC 	|	


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
  | InSprint15.3:Adds_multiple_SFO_items_for_one_student_Confirm_Submit_BC 	|	
   
   
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
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_QC 	|	
  
  
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
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_BC 	|
  
  
@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@5
Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added in CS and OC pages with HST:[<UsingData>]
	
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
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NL 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NB 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NS 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_ON 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_PE 	|
  

@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@6
Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added in CS and OC pages with GST:[<UsingData>]
	
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
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_AB 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_MB 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NT 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NU 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_SK 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_YT 	|
  

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
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_QC_NoTax 	|	
  
  
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
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_BC_NoTax 	|
  
  
@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@9
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added in CS and OC pages for HST:[<UsingData>]
	
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
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NL_NoTax 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NB_NoTax 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NS_NoTax 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_ON_NoTax 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_PE_NoTax 	|
  

@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@10
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added in CS and OC pages for GST:[<UsingData>]
	
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
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_AB_NoTax 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_MB_NoTax 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NT_NoTax 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_NU_NoTax 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_SK_NoTax 	|
  | InSprint15.3:Adds_multiple_SFO_items_for_multiple_students_Confirm_Submit_YT_NoTax 	|
  

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
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_QC 	|	
  
  
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
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_BC 	|	  


@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@13
Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes HST:[<UsingData>]
	
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
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_NL 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_NB 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_NS 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_ON 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_PE 	|	
  
  
@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@14
Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST:[<UsingData>]
	
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
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_AB 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_MB 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_NT 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_NU 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_SK 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_YT 	|
  
  
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
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_QC_NoTax 	|	
  
  
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
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_BC_NoTax 	|	  


@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@17
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added in CS and OC pages for HST:[<UsingData>]
	
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
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_NL_NoTax 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_NB_NoTax 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_NS_NoTax 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_ON_NoTax 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_PE_NoTax 	|	
  
  
@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@18
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added in CS and OC pages for GST:[<UsingData>]
	
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
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_AB_NoTax 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_MB_NoTax 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_NT_NoTax 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_NU_NoTax 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_SK_NoTax 	|	
  | InSprint15.3:Adds_YTO_student_items_Confirm_Submit_YT_NoTax 	|
  
  
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
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_QC 	|	
  
  
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
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_BC 	|	  


@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@21
Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes HST:[<UsingData>]
	
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
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NL 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NB 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NS 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_ON 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_PE 	|	
  
  
@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@22
Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays in CS and OC pages with applicable taxes GST:[<UsingData>]
	
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
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_AB 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_MB 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NT 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NU 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_SK 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_YT 	|
  
  
@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@23
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added in CS and OC pages for GST & QST:[<UsingData>]
	
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
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_QC_NoTax 	|	
  
  
@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@24
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added in CS and OC pages for GST & PST:[<UsingData>]
	
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
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_BC_NoTax 	|	  


@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@25
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added in CS and OC pages for HST:[<UsingData>]
	
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
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NL_NoTax 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NB_NoTax 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NS_NoTax 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_ON_NoTax 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_PE_NoTax 	|	
  
  
@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@26
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added in CS and OC pages for GST:[<UsingData>]
	
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
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_AB_NoTax 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_MB_NoTax 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NT_NoTax 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_NU_NoTax 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_SK_NoTax 	|	
  | InSprint15.3:Adds_YTO_teacher_catalogue_items_Confirm_Submit_YT_NoTax 	|
  
  
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
  | InSprint15.3:Adds_SFO_YTO_items_Confirm_Submit_QC 	|	
  

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
  | InSprint15.3:Adds_SFO_YTO_items_Confirm_Submit_BC 	|		
   
   
@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@29
Scenario Outline:Correct SFO,YTO Total and Cart Total displays with HST:[<UsingData>]
	
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
  | InSprint15.3:Adds_SFO_YTO_items_Confirm_Submit_NL 	|	
  | InSprint15.3:Adds_SFO_YTO_items_Confirm_Submit_NB	|
  | InSprint15.3:Adds_SFO_YTO_items_Confirm_Submit_NS 	|
  | InSprint15.3:Adds_SFO_YTO_items_Confirm_Submit_ON 	|
  | InSprint15.3:Adds_SFO_YTO_items_Confirm_Submit_PE 	|
  
  	
@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@30
Scenario Outline:Correct SFO,YTO Total and Cart Total displays with GST:[<UsingData>]
	
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
  | InSprint15.3:Adds_SFO_YTO_items_Confirm_Submit_AB 	|	
  | InSprint15.3:Adds_SFO_YTO_items_Confirm_Submit_MB	|
  | InSprint15.3:Adds_SFO_YTO_items_Confirm_Submit_NT 	|
  | InSprint15.3:Adds_SFO_YTO_items_Confirm_Submit_NU 	|
  | InSprint15.3:Adds_SFO_YTO_items_Confirm_Submit_SK 	|
  | InSprint15.3:Adds_SFO_YTO_items_Confirm_Submit_YT 	|
  
  
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
  | InSprint15.3:Adds_SFO_YTO_TE_items_Confirm_Submit_QC 	|	
  

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
  | InSprint15.3:Adds_SFO_YTO_TE_items_Confirm_Submit_BC 	|		
   
   
@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@33
Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with HST:[<UsingData>]
	
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
  | InSprint15.3:Adds_SFO_YTO_TE_items_Confirm_Submit_NL 	|	
  | InSprint15.3:Adds_SFO_YTO_TE_items_Confirm_Submit_NB	|
  | InSprint15.3:Adds_SFO_YTO_TE_items_Confirm_Submit_NS 	|
  | InSprint15.3:Adds_SFO_YTO_TE_items_Confirm_Submit_ON 	|
  | InSprint15.3:Adds_SFO_YTO_TE_items_Confirm_Submit_PE 	|
  
  	
@Confirm_And_Submit
@Order_Confirmation
@Priority1
@SCSCOD-7169
@InSprint_15.3
@34
Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with GST:[<UsingData>]
	
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
  | InSprint15.3:Adds_SFO_YTO_TE_items_Confirm_Submit_AB 	|	
  | InSprint15.3:Adds_SFO_YTO_TE_items_Confirm_Submit_MB	|
  | InSprint15.3:Adds_SFO_YTO_TE_items_Confirm_Submit_NT 	|
  | InSprint15.3:Adds_SFO_YTO_TE_items_Confirm_Submit_NU 	|
  | InSprint15.3:Adds_SFO_YTO_TE_items_Confirm_Submit_SK 	|
  | InSprint15.3:Adds_SFO_YTO_TE_items_Confirm_Submit_YT 	|
  
       
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
  | InSprint15.3:Adds_single_FreePick_item_for_one_student_Confirm_Submit_BC 	|	


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
  | InSprint15.3:Adds_multiple_FreePick_items_for_multiple_students_Confirm_Submit_BC 	|	


       	               