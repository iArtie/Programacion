package Figuras;

public class Cono extends FigurasG {

	private double g;
	private double Ab;
	private double Al;
	private double At;
	private double V;


	public Cono(double h, double r, boolean TieneLados,double g,double Ab,double Al,double At,double V) {
		super(h, r, TieneLados);
		this.g=g;
		this.Ab=Ab;
		this.Al=Al;
		this.At=At;
		this.V=V;
	}

	
	public void Cono() {
		System.out.println("App para resolver Conos");
		System.out.println("Ingrese el valor del Radio");
		setR (Lector.nextDouble()) ;
		System.out.println("Ingrese el valor de la Altura");
		h = Lector.nextDouble();
		System.out.println("Ingrese la Generatriz");
		g = Lector.nextDouble();
		Al = Math.PI * getR() * g;
		At = Math.PI * getR() * (g + getR());
		V = Math.PI * getR() * getR() * h / 3;
		System.out.println("El Area Lateral de un Cono es " + Al);
		System.out.println("El Area Total de un Cono es " + At);
		System.out.println("El Volumen de un Cono es " + V);
	}
	
	
}
