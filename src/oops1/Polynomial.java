package oops1;
public class Polynomial {
	private int[] coefficients;
	public Polynomial() {
		coefficients = new int[5];
	}
	public Polynomial(int size) {
		coefficients = new int[size];
	}
	/*
	   This function sets coefficient for a particular degree value, if degree is not there in the 
	   polynomial
	   then corresponding term(with specified degree and value is added int the polynomial. 
	   If the degree is already present in the polynomial then previous coefficient is replaced by
	   new coefficient value passed as function argument
	 */
	public void setCoefficient(int degree, int coeff){
		if(degree >= this.coefficients.length)
		{
			int[] temp = new int[degree + 1];
			for(int i = 0;i < this.coefficients.length;i++) {
				temp[i] = this.coefficients[i];
			}
			this.coefficients = temp;
			this.coefficients[degree] = coeff;
		}
		else {
			this.coefficients[degree] = coeff;
		}
	}
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for(int i = 0;i < coefficients.length;i++) {
			if(coefficients[i] != 0)
				System.out.print(coefficients[i] + "x" + i + " ");
		}
	}
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
		Polynomial polynomialSum = new Polynomial();
//		int i = 0;
//		if(this.coefficients.length > p.coefficients.length) {
//			polynomialSum = new Polynomial(this.coefficients.length);
//			while(i < p.coefficients.length) {
//				polynomialSum.coefficients[i] = this.coefficients[i] + p.coefficients[i];
//				i++;
//			}
//			for(;i < this.coefficients.length;i++) {
//				polynomialSum.coefficients[i] = this.coefficients[i];
//			}
//		}
//		else {
//			polynomialSum = new Polynomial(p.coefficients.length);
//			while(i < this.coefficients.length) {
//				polynomialSum.coefficients[i] = this.coefficients[i] + p.coefficients[i];
//				i++;
//			}
//			for(;i < p.coefficients.length;i++) {
//				polynomialSum.coefficients[i] = p.coefficients[i];
//			}
//		}
		int i = 0, j = 0;
		while(i < this.coefficients.length && j < p.coefficients.length){
			polynomialSum.setCoefficient(i,this.coefficients[i] + p.coefficients[j]);
			i++;
			j++;
		}
		while(i < this.coefficients.length){
		    polynomialSum.setCoefficient(i,this.coefficients[i]);
			i++;
		}
		while(j < p.coefficients.length){
			polynomialSum.setCoefficient(j,p.coefficients[j]);
			j++;
		}
		return polynomialSum;
	}

	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		Polynomial polynomialDifference = new Polynomial();
//		int i = 0;
//		if(this.coefficients.length > p.coefficients.length) {
//			polynomialDifference = new Polynomial(this.coefficients.length);
//			while(i < p.coefficients.length) {
//				polynomialDifference.coefficients[i] = this.coefficients[i] - p.coefficients[i];
//				i++;
//			}
//			for(;i < this.coefficients.length;i++) {
//				polynomialDifference.coefficients[i] = this.coefficients[i];
//			}
//		}
//		else {
//			polynomialDifference = new Polynomial(p.coefficients.length);
//			while(i < this.coefficients.length) {
//				polynomialDifference.coefficients[i] = this.coefficients[i] - p.coefficients[i];
//				i++;
//			}
//			for(;i < p.coefficients.length;i++) {
//				polynomialDifference.coefficients[i] = -p.coefficients[i];
//			}
//		}
		int i = 0, j = 0;
		while(i < this.coefficients.length && j < p.coefficients.length){
			polynomialDifference.setCoefficient(i,this.coefficients[i] + p.coefficients[j]);
			i++;
			j++;
		}
		while(i < this.coefficients.length){
			polynomialDifference.setCoefficient(i,this.coefficients[i]);
			i++;
		}
		while(j < p.coefficients.length){
			polynomialDifference.setCoefficient(j,-p.coefficients[j]);
			j++;
		}
		return polynomialDifference;
	}

	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){	
//
		Polynomial polynomialProduct = new Polynomial();
		for(int i = 0;i < this.coefficients.length;i++){
			for(int j = 0;j < p.coefficients.length;j++){
				int newDegree = i + j;
				int coefficient = p.coefficients[j] * this.coefficients[i];
				if(newDegree < polynomialProduct.coefficients.length){
					int oldCoefficient = polynomialProduct.coefficients[newDegree];
					int newCoefficient = coefficient + oldCoefficient;
					polynomialProduct.setCoefficient(newDegree,newCoefficient);
				}
				polynomialProduct.setCoefficient(newDegree,coefficient);
			}
		}
		return polynomialProduct;
	}
}