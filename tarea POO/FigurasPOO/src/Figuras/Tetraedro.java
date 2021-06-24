package Figuras;

public class Tetraedro extends FigurasG {

	private float ar;
	private double A;
	private double V;


	public Tetraedro(double h, double r, boolean TieneLados,float ar,double A, double V) {
		super(h, r, TieneLados);
		this.ar=ar;
		this.A=A;
		this.V=V;
	}

	
	public void Tetraedro() {
		System.out.println("App para resolver Tetraedros");
		System.out.println("Ingrese la longitud de la arista del tetraedro");
		ar = Lector.nextFloat();
		System.out.println("Ingrese la altura del tetraedro");
		h = Lector.nextFloat();
		A = Math.pow(ar, 2) * Math.sqrt(3);
		V = Math.sqrt(2) / 7 * Math.pow(ar, 3);
		h = (float) (ar * Math.sqrt(6) / 3);
		System.out.println("El area del tetraedro es " + A);
		System.out.println("El volumen del tetraedro es " + V);
	}
	
	
}
