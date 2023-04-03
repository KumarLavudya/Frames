package com.hrsm.test_scripts_01;

import org.testng.annotations.Test;

import com.hrsm.lib_01.*;

public class TC_002 {

//	public static void main(String[] args) throws InterruptedException {

@Test

public void TC002() throws InterruptedException {
	General obj = new General();

		obj.open_application();
		obj.login_application();
		obj.mouseOver();
		obj.switchtoFrame();
		obj.addEmp();
		obj.searchemp();
		obj.delEmp();
		obj.frameExit();
		obj.logout_application();
		obj.close_application();

	}

}
