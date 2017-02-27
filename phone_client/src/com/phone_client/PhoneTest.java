package com.phone_client;

import cn.com.webxml.GetMobileCodeInfoResponse;
import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileCodeWS factory = new MobileCodeWS();
		MobileCodeWSSoap mobileCodeWSSoap = factory.getMobileCodeWSSoap();
		String mobileCodeInfo = mobileCodeWSSoap.getMobileCodeInfo("15617252311", null);
		System.out.println(mobileCodeInfo);

	}

}
