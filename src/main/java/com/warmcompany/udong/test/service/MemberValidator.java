/**
 * 2015. 11. 16.
 * Copyright by yyh / Hubigo AIAL
 * MemberValidator.java
 */
package com.warmcompany.udong.test.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.warmcompany.udong.test.model.Member;


public class MemberValidator implements Validator {

	private static final String emailRegExp =
			"^[_A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@" +
			"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	private Pattern pattern;
	
	public MemberValidator() {
		pattern = Pattern.compile(emailRegExp);
	}
	
	@Override
	public boolean supports(Class<?> arg0) {
		return Member.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Member member = (Member)target;
		
		if(member.getEmail() == null || member.getEmail().trim().isEmpty())	{
			errors.rejectValue("email", "bad");
		} else	{
			Matcher matcher = pattern.matcher(member.getEmail());
			if(!matcher.matches())	{
				errors.rejectValue("email", "bad");
			}
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required");
	}

}
