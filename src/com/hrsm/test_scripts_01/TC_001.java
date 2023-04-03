package com.hrsm.test_scripts_01;

import org.testng.annotations.Test;

import com.hrsm.lib_01.*;

public class TC_001 {
	
//	public static void main(String[] args) throws InterruptedException {
	
	@Test
	public void TC001() throws InterruptedException {
		General obj = new General();
		obj.open_application();
		obj.login_application();
		obj.logout_application();
		obj.close_application();
	}

}
