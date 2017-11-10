package com.dw.automation.support;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.scholastic.torque.common.TestBaseProvider;

public class DataCount {

	public static void printDataCount() {
		final String DB_URL =
				"jdbc:mysql://engineering-best-practice-rds-mysql.cejfaeg7tbwh.us-east-1.rds.amazonaws.com:3306/DW";

		// Database credentials
		final String USER = "root";
		final String PASS = "attd123#";

		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Data Keys Count >>>>>>");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			// STEP 4: Execute a query
			stmt = conn.createStatement();
			String[] teacherType = {"goldenapple_teacher", "greenapple_teacher",
					"greenapple_teacher_with_amex_card",
					"greenapple_teacher_with_soo_order",
					"greenapple_teacher_with_two_soo_order", "redapple_teacher",
					"redapple_teacher_with_3cc_info",
					"redapple_teacher_with_3cc_info_soo_order",
					"redapple_teacher_with_freepick_soo_order",
					"redapple_teacher_with_soo_order", "teacher_with_1_visa_cc_info",
					"teacher_with_3_cc_info", "teacher_with_child",
					"teacher_with_classroom_wishlist", "teacher_with_freepick_soo_order",
					"teacher_with_no_details", "teacher_with_paypal",
					"teacher_with_paypal_errorcode_account",
					"teacher_with_recommendation_classroomwishlist_saveforlater",
					"teacher_with_single_parent", "teacher_with_soo_order",
					"teacher_with_soo_order_1",
					"teacher_with_soo_order_and_AMEX_credit_card",
					"teacher_with_soo_order_and_discover_credit_card",
					"teacher_with_soo_order_and_paypal",
					"teacher_with_soo_order_and_visa_credit_card",
					"teacher_with_two_freepick_soo_order", "teacher_with_two_soo_order",
					"teacher_with_wishlist_soo_order", "teacher_with_yto_order"};
			String[] parentType = {"parent_with_1_master_credit_card",
					"parent_with_1_visa_cc_info", "parent_with_3_cc_info",
					"parent_with_classroom_wishlist",
					"parent_with_classroom_wishlist_and_1_visa_cc_card",
					"parent_with_no_details", "parent_with_paypal",
					"parent_with_paypal_errorcode_account",
					"parent_with_your_teacher_order_recommedations",
					"parent_with_your_teacher_order_recommedations_with_no_child"};

			String[] couponType = {"mgmcoupon", "freepick_no_minimum",
					"freepick_min_10dolar", "bpf_min_250bonuspoint_25dolar"};

			String sql;
			int i = 0;
			String tdmUrl = TestBaseProvider.getTestBase().getContext()
					.getString("tdm.server.url");
			String env = tdmUrl.split("/")[tdmUrl.split("/").length - 1];

			for (String teacher : teacherType) {
				sql = "SELECT count(*) FROM users where type ='" + teacher
						+ "' and inUse='N' and status='Active' and env='" + env
						+ "' and bcoe_id<>''";
				ResultSet rs = stmt.executeQuery(sql);
				while (rs.next()) {
					String count = rs.getString(1);
					// Display values
					System.out.println("RemainingKeyCount=" + teacher + ":" + count);
					i++;
				}
				rs.close();
			}

			for (String parent : parentType) {
				sql = "SELECT count(*) FROM users where type ='" + parent
						+ "' and inUse='N' and status='Active' and env='" + env + "'";
				ResultSet rs2 = stmt.executeQuery(sql);
				while (rs2.next()) {
					String count = rs2.getString(1);
					// Display values
					System.out.println("RemainingKeyCount=" + parent + ":" + count);
					i++;
				}
				rs2.close();
			}

			for (String coupon : couponType) {

				sql = "select count(*) from coupons where coupontype='" + coupon
						+ "' and inuse='N' and status='Active' and env='" + env + "'";
				ResultSet rs2 = stmt.executeQuery(sql);
				while (rs2.next()) {
					String count = rs2.getString(1);
					// Display values
					System.out.println("couponKeyCount=" + coupon + ":" + count);
					i++;
				}
				rs2.close();
			}

			System.out.println("DATA Keys End<<<<<<");

			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		printDataCount();
	}
}
