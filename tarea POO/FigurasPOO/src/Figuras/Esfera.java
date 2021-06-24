package Figuras;

public class Esfera extends FigurasG{

	private double A;
	private double V;

	public Esfera(double h, double r, boolean TieneLados,double A,double V) {
		super(h, r, TieneLados);
		this.A=A;
		this.V=V;
	}

	public void Esfera() {
		double A, V, r;
		System.out.println("Ingrese el radio de la esfera");
		setR (Lector.nextDouble()) ;
		A = 4 * Math.PI * (getH() * getH());
		V = (4.0 / 3) * Math.PI * (getH() * getH() * getH());
		System.out.println("El Area de la esfera es " + A);
		System.out.println("El Volumen de la Esfera es " + V);
	}

	public double getA() {
		return A;
	}

	public void setA(double a) {
		A = a;
	}

	public double getV() {
		return V;
	}

	public void setV(double v) {
		V = v;
	}
	
	
}
