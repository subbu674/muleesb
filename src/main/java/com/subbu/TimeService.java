package com.subbu;

import java.util.Date;

public class TimeService {

	public String printTime(String user)
	{
		return "Hello "+user+" welcome to mule esb "+new Date().toString();
	}
}
