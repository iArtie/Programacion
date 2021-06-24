package Figuras;

public class Piramide extends FigurasG {

	private double ap;
	private double App;
	private double Pb;
	private double Al;
	private double Ab;
	private double V;
	private double At;
	private double n;
	private double l;
	private double Apb;

	public Piramide(double h, double r, boolean TieneLados,double ap,double App,double Pb,double Al,double Ab,double V,double At,double n,double l,double Apb) {
		super(h, r, TieneLados);
		this.ap=ap;
		this.App=App;
		this.Pb=Pb;
		this.Al=Al;
		this.Ab=Ab;
		this.V=V;
		this.At=At;
		this.n=n;
		this.l=l;
		this.Apb=Apb;
	}

	public void Piramide() {
		System.out.println("Ingrese la Altura de la Piramide ");
		setH (Lector.nextDouble()) ;
		System.out.println("Ingrese el numero de lados de la Piramide ");
		n = Lector.nextDouble();
		System.out.println("Ingrese la Longitud base de la Piramide ");
		l = Lector.nextDouble();
		Pb = n;
		ap = n / 2;
		Ab = Pb * ap / 2;
		App = (getH() * getH()) + (ap * ap);
		Al = Pb * ap / 2;
		At = Al + Ab;
		V = Ab * getH() / 3;
		System.out.println("El Area Lateral de la Piramide es " + Al);
		System.out.println("El Area Total de la Piramide es " + At);
		System.out.println("El Volumen de la Piramide es " + V);
	}

	public double getAp() {
		return ap;
	}

	public void setAp(double ap) {
		this.ap = ap;
	}

	public double getApp() {
		return App;
	}

	public void setApp(double app) {
		App = app;
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

	public double getV() {
		return V;
	}

	public void setV(double v) {
		V = v;
	}

	public double getAt() {
		return At;
	}

	public void setAt(double at) {
		At = at;
	}

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getApb() {
		return Apb;
	}

	public void setApb(double apb) {
		Apb = apb;
	}

}
