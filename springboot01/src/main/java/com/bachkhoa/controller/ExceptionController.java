package com.bachkhoa.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/*
 * Neu trong qua trinh xu ly logic tren controller gap exception thi ExceptionController se dc call
 */
@ControllerAdvice
public class ExceptionController {

	// co the bat nhung exception nho hon: NullPointerException...
	@ExceptionHandler(Exception.class)
	public String handleException(Exception ex) {
		ex.printStackTrace();
		return "exception";
	}
}
