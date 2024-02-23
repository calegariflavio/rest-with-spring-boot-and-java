package br.com.flavio.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.flavio.converters.NumberConverter;
import br.com.flavio.exceptions.UnsupportedMathOperationException;
import br.com.flavio.math.SimpleMath;

@RestController
public class MathController {
	
	private static final AtomicLong counter = new AtomicLong();
	
	private SimpleMath math = new SimpleMath();
	
	@RequestMapping(value = "/sum/{numOne}/{numTwo}",
	method=RequestMethod.GET)
	public Double sum(
			@PathVariable(value = "numOne") String numOne,
			@PathVariable(value = "numTwo") String numTwo
		) throws Exception{
		
		if(!NumberConverter.isNumeric(numOne) || !NumberConverter.isNumeric(numTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		} 
		
		return math.sum(NumberConverter.convertToDouble(numOne), NumberConverter.convertToDouble(numTwo));
		
	}
	
	
	@RequestMapping(value = "/subtract/{numOne}/{numTwo}",
			method=RequestMethod.GET)
	public Double subtract(
			@PathVariable(value = "numOne") String numOne,
			@PathVariable(value = "numTwo") String numTwo
		) throws Exception{
		
		if(!NumberConverter.isNumeric(numOne) || !NumberConverter.isNumeric(numTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		} 
		
		return math.subtract(NumberConverter.convertToDouble(numOne), NumberConverter.convertToDouble(numTwo));
		
	}
	
	@RequestMapping(value = "/multiply/{numOne}/{numTwo}",
			method=RequestMethod.GET)
	public Double multiply(
			@PathVariable(value = "numOne") String numOne,
			@PathVariable(value = "numTwo") String numTwo
		) throws Exception{
		
		if(!NumberConverter.isNumeric(numOne) || !NumberConverter.isNumeric(numTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		} 
		
		return math.multiply(NumberConverter.convertToDouble(numOne), NumberConverter.convertToDouble(numTwo));
		
	}
	
	@RequestMapping(value = "/mean/{numOne}/{numTwo}",
			method=RequestMethod.GET)
	public Double mean(
			@PathVariable(value = "numOne") String numOne,
			@PathVariable(value = "numTwo") String numTwo
		) throws Exception{
		
		if(!NumberConverter.isNumeric(numOne) || !NumberConverter.isNumeric(numTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		} 
		
		return math.mean(NumberConverter.convertToDouble(numOne), NumberConverter.convertToDouble(numTwo));
		
	}
	
	@RequestMapping(value = "/sqrRoot/{numOne}",
			method=RequestMethod.GET)
	public Double sqrRoot(
			@PathVariable(value = "numOne") String numOne
	
		) throws Exception{
		
		if(!NumberConverter.isNumeric(numOne)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		} 
		
		return math.sqrRoot(NumberConverter.convertToDouble(numOne));
		
	}
	
	

}
