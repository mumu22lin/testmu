/**
 * 
 */
package com.mu.muls.util;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author bolinluo
 *
 */
public class ApDemoUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String bankStr = "    ";
		String str1 = "  aabc dwa dxyrt  ";
		System.out.println("bankStr="+StringUtils.isNotBlank(bankStr));
		System.out.println("Str1="+StringUtils.remove(str1, "ad"));
		System.out.println("Str1 remove="+StringUtils.remove(str1, "a"));
		System.out.println("Str1 strip="+StringUtils.strip(str1));
		System.out.println(" ToStringBuilder="+ToStringBuilder.reflectionToString(new String()));
		
				
		

	}

}


