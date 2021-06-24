package Figuras;

public class Tcono extends FigurasG {

	
	private double AreaLateral;
	private double AreaTotal;
	private double AreaBaseMayor;
	private double volumen;
	private double generatriz;
	private float RadioMayor;
	private double AreaBaseMenor;

	public Tcono(double h, double r, boolean TieneLados,double AreaLateral,double AreaTotal,double AreaBaseMayor,double AreaBaseMenor,double volumen,double generatriz,float RadioMayor) {
		super(h, r, TieneLados);
		this.AreaLateral=AreaLateral;
		this.AreaTotal=AreaTotal;
		this.AreaBaseMayor=AreaBaseMayor;
		this.AreaBaseMenor=AreaBaseMenor;
		this.volumen=volumen;
		this.generatriz=generatriz;
		this.RadioMayor=RadioMayor;
	}

	public void ToCono() {
		
		System.out.println("App para resolver Troncos de conos");
		System.out.println("Ingrese el radio del tronco del cono");
		setR (Lector.nextDouble()) ;
		System.out.println("Ingrese el radio mayor del tronco del cono");
		RadioMayor = Lector.nextFloat();
		System.out.println("Ingrese la altura del tronco del cono");
		setH (Lector.nextDouble()) ;
		generatriz = Math.sqrt(getH() * getH() + (RadioMayor * RadioMayor) - (getR() * getR()));
		AreaLateral = Math.PI * generatriz * (RadioMayor + getR());
		AreaBaseMayor = Math.PI * Math.pow(RadioMayor, 2);
		AreaBaseMenor = Math.PI * Math.pow(getR(), 2);
		AreaTotal = AreaLateral + AreaBaseMayor + AreaBaseMenor;
		volumen = 0.3333333333333 * Math.PI * getH() * (RadioMayor * RadioMayor + getR() * getR() + RadioMayor * getR());
		System.out.println("La Generatriz del tronco del cono es " + generatriz);
		System.out.println("El Area Lateral del tronco del cono es " + AreaLateral);
		System.out.println("El Area Total del tronco del cono es " + AreaTotal);
		System.out.println("El Volumen del tronco del cono es " + volumen);
	}

	public double getAreaLateral() {
		return AreaLateral;
	}

	public void setAreaLateral(double areaLateral) {
		AreaLateral = areaLateral;
	}

	public double getAreaTotal() {
		return AreaTotal;
	}

	public void setAreaTotal(double areaTotal) {
		AreaTotal = areaTotal;
	}

	public double getAreaBaseMayor() {
		return AreaBaseMayor;
	}

	public void setAreaBaseMayor(double areaBaseMayor) {
		AreaBaseMayor = areaBaseMayor;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public double getGeneratriz() {
		return generatriz;
	}

	public void setGeneratriz(double generatriz) {
		this.generatriz = generatriz;
	}

	public float getRadioMayor() {
		return RadioMayor;
	}

	public void setRadioMator(float radioMator) {
		RadioMayor = radioMator;
	}

}
