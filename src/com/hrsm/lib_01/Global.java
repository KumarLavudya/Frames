package com.hrsm.lib_01;

import org.openqa.selenium.WebDriver;

public class Global {

//	global component
	public WebDriver driver;

//	test_data
	public String link = "http://183.82.103.245/nareshit/login.php";
	public String user_Name = "nareshit";
	public String password = "nareshit";
	public String first_Name = "Kumar";
	public String last_Nmae = "Single";
	public int drpdwn_Value = 1;
	public String search_Value = "7010";

//	Web_elements
	public String txt_userName = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_submit = "Submit";
	public String mouse_link = "PIM";
	public String frame_info = "rightMenu";
	public String addemp_link = "Add Employee";
	public String txt_lastName = "txtEmpLastName";
	public String txt_firstName = "txtEmpFirstName";
	public String btn_save = "//input[@title='Save']";
	public String btn_back = "//input [@onclick='goBack()']";
	public String drdwn_info = "loc_code";
	public String txt_search = "loc_name";
	public String btn_search = "//input[@value='Search']";
	public String ckbx_info = "chkLocID[]";
	public String btn_delete = "//input[@value='Delete']";
	public String link_logout = "Logout";
}
