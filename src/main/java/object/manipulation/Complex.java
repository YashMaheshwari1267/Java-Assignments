package object.manipulation;

public class Complex {
	private float real;
	private float img;
	
	public Complex(float real, float img) {
		super();
		this.real = real;
		this.img = img;
	}
	
	public float getReal() {
		return real;
	}

	public float getImg() {
		return img;
	}

	public static Complex sumComplex(Complex c1, Complex c2) {
		Complex c3 = new Complex(0,0);
		c3.real = c1.real+c2.real;
		c3.img= c1.img+c2.img;
		return c3;
	}
	
	public static void main(String[] args) {
		Complex num1 = new Complex(3,7);
		Complex num2 = new Complex(8,11);
		Complex num3 = Complex.sumComplex(num1,num2);
		System.out.println("Num 1 = "+ num1.getReal() + "+" + num1.getImg() +"i");
		System.out.println("Num 2 = "+ num2.getReal() + "+" + num2.getImg() +"i");
		System.out.println("Sum = "+ num3.getReal() + "+" + num3.getImg() +"i");
	}
}
