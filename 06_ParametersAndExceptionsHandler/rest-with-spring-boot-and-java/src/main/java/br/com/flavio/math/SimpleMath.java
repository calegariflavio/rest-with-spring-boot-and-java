package br.com.flavio.math;

public class SimpleMath {

	
	public Double sum(Double numOne, Double numTwo){

		return numOne + numTwo ;
		
	}
	
	public Double subtract(Double numOne,Double numTwo) {

		return numOne - numTwo ;
		
	}
	
	public Double multiply(Double numOne, Double numTwo) {
		
		return numOne * numTwo ;
		
	}

	public Double mean(Double numOne, Double numTwo) {
		
		return (numOne + numTwo) / 2 ;
		
	}
	
	public Double sqrRoot(Double numOne){
		
		return Math.sqrt(numOne);
		
	}
}
