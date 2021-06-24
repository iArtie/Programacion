package Figuras;

public class Cilindro extends FigurasG{

	private double Pb;
	private double Al;
	private double Ab;
	private double At;
	private double V;


	public Cilindro(double h, double r, boolean TieneLados,double Pb,double Al,double Ab,double At,double V) {
		super(h, r, TieneLados);
		this.Pb = Pb;
		this.Al=Al;
		this.Ab = Ab;
		this.At = At;
		this.V = V;
		
	}
	public void Cilindro() {
		
		System.out.println("App para resolver Cilindros");
		System.out.println("Ingrese la altura del Cilindro");
		h = Lector.nextDouble();
		System.out.println("Ingrese el radio del Cilindro");
		setR (Lector.nextDouble()) ;
		Pb = 2 * Math.PI * getR();
		Ab = Math.PI *getR() * getR();
		Al = Pb * h;
		At = Al + 2 * Ab;
		V = Ab * h;
		System.out.println("El Area Lateral del Cilindro es " + Al);
		System.out.println("El Area Total del Cilindro es " + At);
		System.out.println("El Volumen del Cilindro es " + V);

	}
	
	
	public double getPb() {
		return Pb;
	}


	public void setPb(double pb) {
		Pb = pb;
	}


	public double getAl() {
		return Al;
	}


	public void setAl(double al) {
		Al = al;
	}


	public double getAb() {
		return Ab;
	}


	public void setAb(double ab) {
		Ab = ab;
	}


	public double getAt() {
		return At;
	}


	public void setAt(double at) {
		At = at;
	}


	public double getV() {
		return V;
	}


	public void setV(double v) {
		V = v;
	}
}
