package com.sb.springMVCCRMProjectutils;

import lombok.Data;

@Data
public class Utils {
	public static String getActionText() {
		return "hello";
	}
	
	private String text = getActionText();
}
