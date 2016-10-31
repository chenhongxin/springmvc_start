package com.itcast.ssm.test;

import com.itcast.ssm.webservice.MobileCodeWS;
import com.itcast.ssm.webservice.MobileCodeWSSoap;

public class TestHello {

	public static void main(String[] args) {
		MobileCodeWS factory = new MobileCodeWS();
		MobileCodeWSSoap mobileCodeWSSoap = factory.getMobileCodeWSSoap();
		String searchResult = mobileCodeWSSoap.getMobileCodeInfo("15221089157", null);
		System.out.println(searchResult);
	}

}
