package Figuras;

import java.util.*;

public class FigurasG {
	protected double h;
	private double r;
	private boolean TieneLados;

	
	public FigurasG(double h,double r,boolean TieneLados) {
		
		this.h = h;
		this.r = r;
		this.TieneLados = TieneLados;
		
		
	}
	
	static Scanner Lector = new Scanner(System.in);
	
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public boolean isTieneLados() {
		return TieneLados;
	}
	public void setTieneLados(boolean tieneLados) {
		TieneLados = tieneLados;
	}
}
