package Figuras;
import java.util.*;

public class Tpiramide extends FigurasG{
	private double AM,Am;
	private double ApM,Apm;
	private double Al;
	private double At;
	private double PBM,PBm;
	private double Apotema;
	private double AreaBaseMenor;
	private double AreaBaseMayor;

	public Tpiramide(double h, double r, boolean TieneLados,double AM,double ApM,double Apm,double Am,double Al,double At,double PBM,double PBm,double Apotema,double AreaBaseMenor,double AreaBaseMayor) {
		super(h, r, TieneLados);
		this.AM=AM;
		this.ApM=ApM;
		this.ApM=Apm;
		this.AM=Am;
		this.Al=Al;
		this.At=At;
		this.PBM=PBM;
		this.PBM=PBm;
		this.Apotema=Apotema;
		this.AreaBaseMenor=AreaBaseMenor;
		this.AreaBaseMayor=AreaBaseMayor;
	}

	static Scanner Lector = new Scanner (System.in);
	
	public void ToPiramide() {
		double volumen = 0;
		System.out.println("App para resolver Troncos de Piramide");
		System.out.println("Ingrese la longitud del la arista mayor del tronco de la piramide");
		AM = Lector.nextDouble();
		System.out.println("Ingrese la longitud del la arista menor del tronco de la piramide");
		Am = Lector.nextDouble();
		System.out.println("Ingrese la altura del tronco de la piramide");
		setH (Lector.nextDouble());
		System.out.println("Ingrese el apotema de la base mayor del tronco de la piramide");
		ApM = Lector.nextDouble();
		System.out.println("Ingrese el apotema de la base menor del tronco de la piramide");
		Apm = Lector.nextDouble();
		PBM = 4 * AM;
		PBm = 4 * Am;
		Apotema = Math.sqrt(getH() * getH() + Math.pow(ApM - Apm, 2));
		Al = (PBM + PBm) / 2 * Apotema;
		AreaBaseMayor = Math.pow(AM, 2);
		AreaBaseMenor = Math.pow(Am, 2);
		At = Al + AreaBaseMayor + AreaBaseMenor;
		volumen = 0.3333333333333 * getH() * (AreaBaseMayor + AreaBaseMenor + Math.sqrt(AreaBaseMayor * AreaBaseMenor));
		System.out.println("El area lateral del tronco de la piramide es:" + Al);
		System.out.println("El area total del tronco de la piramide es:" + At);
		System.out.println("El volumen del tronco de la piramide es:" + volumen);

	}

	public double getAM() {
		return AM;
	}

	public void setAM(double aM) {
		AM = aM;
	}

	public double getAm() {
		return Am;
	}

	public void setAm(double am) {
		Am = am;
	}

	public double getApM() {
		return ApM;
	}

	public void setApM(double apM) {
		ApM = apM;
	}

	public double getApm() {
		return Apm;
	}

	public void setApm(double apm) {
		Apm = apm;
	}

	public double getAl() {
		return Al;
	}

	public void setAl(double al) {
		Al = al;
	}

	public double getAt() {
		return At;
	}

	public void setAt(double at) {
		At = at;
	}

	public double getPBM() {
		return PBM;
	}

	public void setPBM(double pBM) {
		PBM = pBM;
	}

	public double getPBm() {
		return PBm;
	}

	public void setPBm(double pBm) {
		PBm = pBm;
	}

	public double getApotema() {
		return Apotema;
	}

	public void setApotema(double apotema) {
		Apotema = apotema;
	}

	public double getAreaBaseMenor() {
		return AreaBaseMenor;
	}

	public void setAreaBaseMenor(double areaBaseMenor) {
		AreaBaseMenor = areaBaseMenor;
	}

	public double getAreaBaseMayor() {
		return AreaBaseMayor;
	}

	public void setAreaBaseMayor(double areaBaseMayor) {
		AreaBaseMayor = areaBaseMayor;
	}
	
}
