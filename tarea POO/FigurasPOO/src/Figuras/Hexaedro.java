package Figuras;

public class Hexaedro extends FigurasG {

	private float D;
	private float ar;
	private double A;
	private double V;
	
	public Hexaedro(double h, double r, boolean TieneLados,float D,float ar, double A, double V) {
		super(h, r, TieneLados);
		this.D=D;
		this.ar=ar;
		this.A=A;
		this.V=V;
	}

	
	public void Hexaedro() {
		System.out.println("App para resolver Hexaedros");
		System.out.println("Ingrese la dimencion del hexaedro");
		D = Lector.nextFloat();
		System.out.println("Ingrese la arista del hexaedro");
		ar = Lector.nextFloat();
		A = 6 * Math.pow(ar, 2);
		V = Math.pow(ar, 3);
		D = (float) (ar * Math.sqrt(3));
		System.out.println("El area del hexaedro es " + A);
		System.out.println("El volumen del hexaedro es " + V);
		System.out.println("Gracias por usar este programa");
	}


	public float getD() {
		return D;
	}


	public void setD(float d) {
		D = d;
	}


	public float getAr() {
		return ar;
	}


	public void setAr(float ar) {
		this.ar = ar;
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
