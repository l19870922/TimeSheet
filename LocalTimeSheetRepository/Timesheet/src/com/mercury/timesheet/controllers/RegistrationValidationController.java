package com.mercury.timesheet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mercury.timesheet.services.RegistrationValidationService;

@Controller
@RequestMapping(value="/validation")
public class RegistrationValidationController {
	private RegistrationValidationService rvs;
	
	public RegistrationValidationService getRvs() {
		return rvs;
	}

	public void setRvs(RegistrationValidationService rvs) {
		this.rvs = rvs;
	}

	@RequestMapping(value="/emp")
	@ResponseBody
	public String validateEmpno(String empno) {
		if(rvs.isEmpnoValid(empno)) return "success";
		else return "failure";
	}
	
	@RequestMapping(value="/username")
	public String validateUsername(String username) {
		if(rvs.isUsernameValid(username)) return "success";
		else return "failure";
	}
}
