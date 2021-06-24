package Figuras;

public class Prisma extends FigurasG{

	
	private double All;
	private double At;
	private double Pb;
	private double V;
	private double n;
	private double Ap;
	private double l;
	private double Ab;


	public Prisma(double h, double r, boolean TieneLados, String Color,double All, double At,double Pb,double V,double n,double Ap,double l,double Ab) {
		super(h,r,TieneLados);
		this.All= All;
		this.At = At;
		this.Pb = Pb;
		this.V = V;
		this.n = n;
		this.Ap = Ap;
		this. l= l;
		this.Ab = Ab;
		
	}
	
	public void Prisma() {
		System.out.println("App Para resolver Prismas ");
		System.out.println("Ingrese el numero de lados ");
		n = Lector.nextDouble();
		System.out.println("Ingrese la longitud del prisma ");
		l = Lector.nextDouble();
		System.out.println("Ingrese la altura del prisma ");
		h = Lector.nextDouble();
		Pb = n * l;
		All = Pb * h;
		Ap = Math.sqrt(3 * l * l / 4);
		Ab = Pb * Ap / 2;
		At = All + 2 * Ab;
		V = Ab * h;
		System.out.println("El Area Lateral del prisma es: " + All);
		System.out.println("El Area Total del prisma es " + At);
		System.out.println("El Volumen del prisma es: " + V);
	}

	public double getAll() {
		return All;
	}


	public void setAll(double all) {
		All = all;
	}


	public double getAt() {
		return At;
	}


	public void setAt(double at) {
		At = at;
	}


	public double getPb() {
		return Pb;
	}


	public void setPb(double pb) {
		Pb = pb;
	}


	public double getV() {
		return V;
	}


	public void setV(double v) {
		V = v;
	}


	public double getN() {
		return n;
	}


	public void setN(double n) {
		this.n = n;
	}


	public double getAp() {
		return Ap;
	}


	public void setAp(double ap) {
		Ap = ap;
	}


	public double getL() {
		return l;
	}


	public void setL(double l) {
		this.l = l;
	}


	public double getAb() {
		return Ab;
	}


	public void setAb(double ab) {
		Ab = ab;
	}

}
