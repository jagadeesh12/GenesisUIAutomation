@reviewcartnow
Feature: Review Cart - Teachers - Incorporate SFO and YTO
	This feature is to validate the Teachers - Cart - Incorporate SFO and YTO scenarios

 
Background: 
	Given teacher open rco-scholastic web site 

	
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@1
Scenario Outline:Item is grouped by student name and correct item information displays when single SFO item is added with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO item to the cart for single student
	When teacher navigates to [Review Cart] page
	Then teacher sees the SFO section
	And added item is grouped by student name
	And the student name displays correctly
	And Student Subtotal,Qty,GST,PST,Total,SFO Total and Cart Total displays correctly
	
Examples:
  | UsingData                            				|
  | QA:Adds_single_SFO_item_for_one_student 	|	


@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@2
Scenario Outline:Items are grouped by student name and correct item information displays when multiple SFO items are added with correct taxes GST&PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds multiple SFO items to the cart for single student
	When teacher navigates to [Review Cart] page
	Then teacher sees the SFO section
	And added item is grouped by student name
	And the student name displays correctly
	And Multiple items Student Subtotal,Qty,GST,PST,Total,SFO Total and Cart Total displays correctly
	
Examples:
  | UsingData                            					|
  | QA:Adds_multiple_SFO_items_for_one_student 	|	
   
   
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@3
Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added with applicable taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart for multiple students
	When teacher navigates to [Review Cart] page
	Then teacher sees the SFO section
	And added items are grouped by student name
	And the student names displays correctly
	And Students Subtotal,Qty,GST,QST,Total,SFO Total and Cart Total displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_multiple_SFO_items_for_multiple_students_QC 	|	
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@4
Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart for multiple students
	When teacher navigates to [Review Cart] page
	Then teacher sees the SFO section
	And added items are grouped by student name
	And the student names displays correctly
	And Students Subtotal,Qty,GST,PST,Total,SFO Total and Cart Total displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_multiple_SFO_items_for_multiple_students_BC 	|
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@5
Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart for multiple students
	When teacher navigates to [Review Cart] page
	Then teacher sees the SFO section
	And added items are grouped by student name
	And the student names displays correctly
	And Students Subtotal,Qty,HST,Total,SFO Total and Cart Total displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_multiple_SFO_items_for_multiple_students_NL 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_NB 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_NS 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_ON 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_PE 	|
  

@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@6
Scenario Outline:Correct subtotal, Qty, taxes and Total displays when multiple SFO items are added with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart for multiple students
	When teacher navigates to [Review Cart] page
	Then teacher sees the SFO section
	And added items are grouped by student name
	And the student names displays correctly
	And Students Subtotal,Qty,GST,Total,SFO Total and Cart Total displays correctly
	
Examples:
  | UsingData                            							|
  | QA:Adds_multiple_SFO_items_for_multiple_students_AB 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_MB 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_NT 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_NU 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_SK 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_YT 	|
  

@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@7
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added for tax exempted schools GST&QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart for multiple students
	When teacher navigates to [Review Cart] page
	Then teacher sees the SFO section
	And added items are grouped by student name
	And the student names displays correctly
	And No taxes are charged and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly
	
Examples:
  | UsingData                            									|
  | QA:Adds_multiple_SFO_items_for_multiple_students_QC_NoTax 	|	
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@8
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added for tax exempted schools GST&PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart for multiple students
	When teacher navigates to [Review Cart] page
	Then teacher sees the SFO section
	And added items are grouped by student name
	And the student names displays correctly
	And No taxes are charged for BC and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly
	
Examples:
  | UsingData                            									|
  | QA:Adds_multiple_SFO_items_for_multiple_students_BC_NoTax 	|
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@9
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added for tax exempted schools HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart for multiple students
	When teacher navigates to [Review Cart] page
	Then teacher sees the SFO section
	And added items are grouped by student name
	And the student names displays correctly
	And No taxes are charged for HST and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly
	
Examples:
  | UsingData                            									|
  | QA:Adds_multiple_SFO_items_for_multiple_students_NL_NoTax 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_NB_NoTax 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_NS_NoTax 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_ON_NoTax 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_PE_NoTax 	|
  

@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@10
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when multiple SFO items are added for tax exempted schools GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds SFO items to the cart for multiple students
	When teacher navigates to [Review Cart] page
	Then teacher sees the SFO section
	And added items are grouped by student name
	And the student names displays correctly
	And No taxes are charged for GST and Students Subtotal,Qty,Total,SFO Total and Cart Total displays correctly
	
Examples:
  | UsingData                            									|
  | QA:Adds_multiple_SFO_items_for_multiple_students_AB_NoTax 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_MB_NoTax 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_NT_NoTax 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_NU_NoTax 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_SK_NoTax 	|
  | QA:Adds_multiple_SFO_items_for_multiple_students_YT_NoTax 	|
  

@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@11
Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays with applicable taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	When teacher navigates to [Review Cart] page
	Then teacher sees the YTO section
	And YTO Subtotal,Qty,GST,QST,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            	|
  | QA:Adds_YTO_student_items_QC 	|	
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@12
Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	When teacher navigates to [Review Cart] page
	Then teacher sees the YTO section
	And YTO Subtotal,Qty,GST,PST,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            	|
  | QA:Adds_YTO_student_items_BC 	|	  


@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@13
Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	When teacher navigates to [Review Cart] page
	Then teacher sees the YTO section
	And YTO Subtotal,Qty,HST,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            	|
  | QA:Adds_YTO_student_items_NL 	|	
  | QA:Adds_YTO_student_items_NB 	|	
  | QA:Adds_YTO_student_items_NS 	|	
  | QA:Adds_YTO_student_items_ON 	|	
  | QA:Adds_YTO_student_items_PE 	|	
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@14
Scenario Outline:Correct YTO subtotal, Qty, taxes and Total displays with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	When teacher navigates to [Review Cart] page
	Then teacher sees the YTO section
	And YTO Subtotal,Qty,GST,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            	|
  | QA:Adds_YTO_student_items_AB 	|	
  | QA:Adds_YTO_student_items_MB 	|	
  | QA:Adds_YTO_student_items_NT 	|	
  | QA:Adds_YTO_student_items_NU 	|	
  | QA:Adds_YTO_student_items_SK 	|	
  | QA:Adds_YTO_student_items_YT 	|
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@15
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added for tax exempted schools GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	When teacher navigates to [Review Cart] page
	Then teacher sees the YTO section
	And No taxes are charged for QC and YTO Subtotal,Qty,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            			|
  | QA:Adds_YTO_student_items_QC_NoTax 	|	
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@16
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added for tax exempted schools GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	When teacher navigates to [Review Cart] page
	Then teacher sees the YTO section
	And No taxes are charged for BC and YTO Subtotal,Qty,Total and Cart Total displays correctly
	
Examples:
  | UsingData                           			| 			
  | QA:Adds_YTO_student_items_BC_NoTax 	|	  


@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@17
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added for tax exempted schools HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	When teacher navigates to [Review Cart] page
	Then teacher sees the YTO section
	And No taxes are charged for HST and YTO Subtotal,Qty,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            			|
  | QA:Adds_YTO_student_items_NL_NoTax 	|	
  | QA:Adds_YTO_student_items_NB_NoTax 	|	
  | QA:Adds_YTO_student_items_NS_NoTax 	|	
  | QA:Adds_YTO_student_items_ON_NoTax 	|	
  | QA:Adds_YTO_student_items_PE_NoTax 	|	
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@18
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when YTO items added for tax exempted schools GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds YTO items to the cart
	When teacher navigates to [Review Cart] page
	Then teacher sees the YTO section
	And No taxes are charged for GST and YTO Subtotal,Qty,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            			|
  | QA:Adds_YTO_student_items_AB_NoTax 	|	
  | QA:Adds_YTO_student_items_MB_NoTax 	|	
  | QA:Adds_YTO_student_items_NT_NoTax 	|	
  | QA:Adds_YTO_student_items_NU_NoTax 	|	
  | QA:Adds_YTO_student_items_SK_NoTax 	|	
  | QA:Adds_YTO_student_items_YT_NoTax 	|
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@19
Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays with applicable taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	When teacher navigates to [Review Cart] page from Search results page
	Then teacher sees the Teacher Exclusives section
	And Teacher Exclusives Subtotal,Qty,GST,QST,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            				|
  | QA:Adds_YTO_teacher_catalogue_items_QC 	|	
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@20
Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	When teacher navigates to [Review Cart] page from Search results page
	Then teacher sees the Teacher Exclusives section
	And Teacher Exclusives Subtotal,Qty,GST,PST,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            				|
  | QA:Adds_YTO_teacher_catalogue_items_BC 	|	  


@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@21
Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	When teacher navigates to [Review Cart] page from Search results page
	Then teacher sees the Teacher Exclusives section
	And Teacher Exclusives Subtotal,Qty,HST,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            				|
  | QA:Adds_YTO_teacher_catalogue_items_NL 	|	
  | QA:Adds_YTO_teacher_catalogue_items_NB 	|	
  | QA:Adds_YTO_teacher_catalogue_items_NS 	|	
  | QA:Adds_YTO_teacher_catalogue_items_ON 	|	
  | QA:Adds_YTO_teacher_catalogue_items_PE 	|	
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@22
Scenario Outline:Correct Teacher Exclusives subtotal, Qty, taxes and Total displays with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	When teacher navigates to [Review Cart] page from Search results page
	Then teacher sees the Teacher Exclusives section
	And Teacher Exclusives Subtotal,Qty,GST,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            				|
  | QA:Adds_YTO_teacher_catalogue_items_AB 	|	
  | QA:Adds_YTO_teacher_catalogue_items_MB 	|	
  | QA:Adds_YTO_teacher_catalogue_items_NT 	|	
  | QA:Adds_YTO_teacher_catalogue_items_NU 	|	
  | QA:Adds_YTO_teacher_catalogue_items_SK 	|	
  | QA:Adds_YTO_teacher_catalogue_items_YT 	|
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@23
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when TE items added for tax exempted schools GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	When teacher navigates to [Review Cart] page from Search results page
	Then teacher sees the Teacher Exclusives section
	And No taxes are charged for QC and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            					|
  | QA:Adds_YTO_teacher_catalogue_items_QC_NoTax 	|	
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@24
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when TE items added for tax exempted schools GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	When teacher navigates to [Review Cart] page from Search results page
	Then teacher sees the Teacher Exclusives section
	And No taxes are charged for BC and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly
	
Examples:
  | UsingData                           					| 			
  | QA:Adds_YTO_teacher_catalogue_items_BC_NoTax 	|	  


@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@25
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added for tax exempted schools HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	When teacher navigates to [Review Cart] page from Search results page
	Then teacher sees the Teacher Exclusives section
	And No taxes are charged for HST and Teacher Exclusives Subtotal,Qty,Total and Cart Total displays correctly
	
Examples:
  | UsingData                            					|
  | QA:Adds_YTO_teacher_catalogue_items_NL_NoTax 	|	
  | QA:Adds_YTO_teacher_catalogue_items_NB_NoTax 	|	
  | QA:Adds_YTO_teacher_catalogue_items_NS_NoTax 	|	
  | QA:Adds_YTO_teacher_catalogue_items_ON_NoTax 	|	
  | QA:Adds_YTO_teacher_catalogue_items_PE_NoTax 	|	
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@26
Scenario Outline:No taxes are charged and correct subtotal, Qty and Total displays when Teacher Exclusives items added for tax exempted schools GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	#And teacher navigates to YTO page
	And teacher adds Teacher Exclusives items to the cart
	When teacher navigates to [Review Cart] page from Search results page
	Then teacher sees the Teacher Exclusives section
	And No taxes are charged for GST and Teacher Exclusives Subtotal,Qty,Pre & Post Total and Cart Total displays correctly
	
Examples:
  | UsingData                            					|
  | QA:Adds_YTO_teacher_catalogue_items_AB_NoTax 	|	
  | QA:Adds_YTO_teacher_catalogue_items_MB_NoTax 	|	
  | QA:Adds_YTO_teacher_catalogue_items_NT_NoTax 	|	
  | QA:Adds_YTO_teacher_catalogue_items_NU_NoTax 	|	
  | QA:Adds_YTO_teacher_catalogue_items_SK_NoTax 	|	
  | QA:Adds_YTO_teacher_catalogue_items_YT_NoTax 	|
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@27
Scenario Outline:Correct SFO,YTO Total,YOU ARE EARNING REWARDS ON value and Cart Total displays with applicable taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO and YTO items to the cart
	When teacher navigates to [Review Cart] page
	Then teacher sees the SFO and YTO sections
	And teacher sees the text 'You are earning rewards on'
	And SFO,YTO Total,GST,QST,YOU ARE EARNING REWARDS ON value and Cart Total displays correctly
	
Examples:
  | UsingData                           |
  | QA:Adds_SFO_YTO_items_QC 	|	
  

@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@28
Scenario Outline:Correct SFO,YTO Total,YOU ARE EARNING REWARDS ON value and Cart Total displays with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO and YTO items to the cart
	When teacher navigates to [Review Cart] page
	Then teacher sees the SFO and YTO sections
	And teacher sees the text 'You are earning rewards on'
	And SFO,YTO Total,GST,PST,YOU ARE EARNING REWARDS ON value and Cart Total displays correctly
	
Examples:
  | UsingData                          	|
  | QA:Adds_SFO_YTO_items_BC 	|		
   
   
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@29
Scenario Outline:Correct SFO,YTO Total,YOU ARE EARNING REWARDS ON value and Cart Total displays with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO and YTO items to the cart
	When teacher navigates to [Review Cart] page
	Then teacher sees the SFO and YTO sections
	And teacher sees the text 'You are earning rewards on'
	And SFO,YTO Total,HST,YOU ARE EARNING REWARDS ON value and Cart Total displays correctly
	
Examples:
  | UsingData                           |
  | QA:Adds_SFO_YTO_items_NL 	|
  | QA:Adds_SFO_YTO_items_NB	|
  | QA:Adds_SFO_YTO_items_NS 	|
  | QA:Adds_SFO_YTO_items_ON 	|
  | QA:Adds_SFO_YTO_items_PE 	|
  
  	
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@30
Scenario Outline:Correct SFO,YTO Total,YOU ARE EARNING REWARDS ON value and Cart Total displays with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO and YTO items to the cart
	When teacher navigates to [Review Cart] page
	Then teacher sees the SFO and YTO sections
	And teacher sees the text 'You are earning rewards on'
	And SFO,YTO Total,GST,YOU ARE EARNING REWARDS ON value and Cart Total displays correctly
	
Examples:
  | UsingData                           |
  | QA:Adds_SFO_YTO_items_AB 	|	
  | QA:Adds_SFO_YTO_items_MB	|
  | QA:Adds_SFO_YTO_items_NT 	|
  | QA:Adds_SFO_YTO_items_NU 	|
  | QA:Adds_SFO_YTO_items_SK 	|
  | QA:Adds_SFO_YTO_items_YT 	|
  
  
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@31
Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with applicable taxes GST & QST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	When teacher navigates to [Review Cart] page from Search results page
	Then teacher sees the SFO,YTO and Teacher Exclusives sections
	And SFO,YTO,Teacher Exclusives Total,GST,QST and Cart Total displays correctly
	
Examples:
  | UsingData                           	|
  | QA:Adds_SFO_YTO_TE_items_QC 	|	
  

@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@32
Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with applicable taxes GST & PST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	When teacher navigates to [Review Cart] page from Search results page
	Then teacher sees the SFO,YTO and Teacher Exclusives sections
	And SFO,YTO,Teacher Exclusives Total,GST,PST and Cart Total displays correctly
	
Examples:
  | UsingData                          		|
  | QA:Adds_SFO_YTO_TE_items_BC 	|		
   
   
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@33
Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with applicable taxes HST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	When teacher navigates to [Review Cart] page from Search results page
	Then teacher sees the SFO,YTO and Teacher Exclusives sections
	And SFO,YTO,Teacher Exclusives Total,HST and Cart Total displays correctly
	
Examples:
  | UsingData                         		|
  | QA:Adds_SFO_YTO_TE_items_NL 	|	
  | QA:Adds_SFO_YTO_TE_items_NB	|
  | QA:Adds_SFO_YTO_TE_items_NS 	|
  | QA:Adds_SFO_YTO_TE_items_ON 	|
  | QA:Adds_SFO_YTO_TE_items_PE 	|
  
  	
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@34
Scenario Outline:Correct SFO,YTO,Teacher Exclusives Total and Cart Total displays with applicable taxes GST:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to YTO page
	And teacher adds SFO,YTO and Teacher Exclusives items to the cart
	When teacher navigates to [Review Cart] page from Search results page
	Then teacher sees the SFO,YTO and Teacher Exclusives sections
	And SFO,YTO,Teacher Exclusives Total,GST and Cart Total displays correctly
	
Examples:
  | UsingData                           	|
  | QA:Adds_SFO_YTO_TE_items_AB 	|	
  | QA:Adds_SFO_YTO_TE_items_MB	|
  | QA:Adds_SFO_YTO_TE_items_NT 	|
  | QA:Adds_SFO_YTO_TE_items_NU 	|
  | QA:Adds_SFO_YTO_TE_items_SK 	|
  | QA:Adds_SFO_YTO_TE_items_YT 	|
  
       
@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@35
Scenario Outline:No prices are charged for Student in Review cart page when teacher adds single FreePick item to the cart for BC province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds FreePick item to the cart for single student
	When teacher navigates to [Review Cart] page
	Then teacher sees the SFO section
	And added item is grouped by student name
	And the student name displays correctly
	And No prices are charged for Student Subtotal,GST,PST,Total,SFO Total and Cart Total
	
Examples:
  | UsingData                            					|
  | QA:Adds_single_FreePick_item_for_one_student 	|	


@ReviewCart
@Priority1
@SCSCOD-7166
@InSprint_15.2
@36
Scenario Outline:No prices are charged for Student in Review cart page when teacher adds multiple FreePick items to the cart for BC province:[<UsingData>]
	
	Given teacher logs into the application by providing [UserInformation]
	And teacher navigates to SFO page
	And teacher adds FreePick item to the cart for multiple students
	When teacher navigates to [Review Cart] page
	Then teacher sees the SFO section
	And added items are grouped by student name
	And the student name displays correctly
	And No prices are charged for multiple Students Subtotal,GST,PST,Total,SFO Total and Cart Total
	
Examples:
  | UsingData                            							|
  | QA:Adds_multiple_FreePick_items_for_multiple_students |