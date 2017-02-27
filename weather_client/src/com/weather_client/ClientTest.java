package com.weather_client;


import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class ClientTest {

	public static void main(String[] args) {
		WeatherWS weatherWS=new WeatherWS();
		WeatherWSSoap weatherWSSoap=weatherWS.getWeatherWSSoap();
		ArrayOfString weather=weatherWSSoap.getWeather("杭州", null);
		List<String> list=weather.getString();
		for(String s:list){
			System.out.println(s + "********");
		}
		//System.out.println(list);
	}
}
