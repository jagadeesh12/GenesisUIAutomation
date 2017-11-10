package com.dw.automation.steps.TeacherCart;

public class TotlaOwing {
	
	private double totalOwingValue;
	
	private double Student_Sub_Tot_Value;
	
	private double Teacher_Sub_Tot_Value;
	
	private int Item1_qty_Value;
	
	private int Item2_qty_Value;
	
	private double total_StudenClub_Value;
	
	private double Exceeded_Amt;
	
	private double Earned_Amt;
	
	private String Search_results_value;
	
	private String SchoolName_in_Search_results;
	
	private double Total_SFO_Value_Rewards_page;
	
	private double Total_YTO_Value_Rewards_page;
	
	

	public double getTotalOwingValue() {
		return totalOwingValue;
	}

	public void setTotalOwingValue(double totalOwingValue) {
		this.totalOwingValue = totalOwingValue;
	}
	
	public double getStudent_Sub_Tot_Value() {
		return Student_Sub_Tot_Value;
	}

	public void setStudent_Sub_Tot_Value(double student_Sub_Tot_Value) {
		this.Student_Sub_Tot_Value = student_Sub_Tot_Value;
	}
	
	public double getTeacher_Sub_Tot_Value() {
		return Teacher_Sub_Tot_Value;
	}

	public void setTeacher_Sub_Tot_Value(double teacher_Sub_Tot_Value) {
		this.Teacher_Sub_Tot_Value = teacher_Sub_Tot_Value;
	}
	
	public int getItem1_qty_Value() {
		return Item1_qty_Value;
	}

	public void setItem1_qty_Value(int item1_qty_Value) {
		this.Item1_qty_Value = item1_qty_Value;
	}
	
	public int getItem2_qty_Value() {
		return Item2_qty_Value;
	}

	public void setItem2_qty_Value(int item2_qty_Value) {
		this.Item2_qty_Value = item2_qty_Value;
	}
	
	public double getTotal_StudenClub_Value() {
		return total_StudenClub_Value;
	}

	public void setTotal_StudenClub_Value(double total_StudenClub_Value) {

        this.total_StudenClub_Value = total_StudenClub_Value;
        System.out.println("Inside TOTLAOWING CLASS setTotal_StudenClub_Value"+total_StudenClub_Value);

	}
	
	public double getExceeded_Amt() {
		return Exceeded_Amt;
	}

	public void setExceeded_Amt(double exceeded_Amt) {
		this.Exceeded_Amt = exceeded_Amt;
        System.out.println("INSIDE TOTLAOWING CLASS setExceeded_Amt "+Exceeded_Amt);
    }
	
	public double getEarned_Amt() {
		return Earned_Amt;
	}

	public void setEarned_Amt(double earned_Amt) {
		this.Earned_Amt = earned_Amt;
	}
	
	public String getSearch_results_value() {
		return Search_results_value;
	}

	public void setSearch_results_value(String Search_results_value) {
		this.Search_results_value = Search_results_value;
	}
	
	public String get_SchoolName_in_Search_results() {
		return SchoolName_in_Search_results;
	}

	public void set_SchoolName_in_Search_results(String SchoolName_in_Search_results) {
		this.SchoolName_in_Search_results = SchoolName_in_Search_results;
	}
	
	public double get_Total_SFO_Value_Rewards_page() {
		return Total_SFO_Value_Rewards_page;
	}
	
	public void set_Total_SFO_Value_Rewards_page(double totalSFOValueRewardsPage) {
		this.Total_SFO_Value_Rewards_page = totalSFOValueRewardsPage;
	}
	
	public double get_Total_YTO_Value_Rewards_page() {
		return Total_YTO_Value_Rewards_page;
	}
	
	public void set_Total_YTO_Value_Rewards_page(double totalYTOValueRewardsPage) {
		this.Total_YTO_Value_Rewards_page = totalYTOValueRewardsPage;
	}
	
	

}
