package TrabajoFinal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	static Scanner Lector = new Scanner(System.in);
	private String t,u;
	String[] bn = { " ",t,u};
	public void nombreempresa() {
		String t;
		try {
		System.out.println("Como desea llamar su empresa");
		bn[1]= Lector.next();
		bn[2]= Lector.next();
			
		} catch (InputMismatchException bn) {
			System.out.println("Solo puede introducir dos palabras");
			Lector.next();
		}
	}
	
	public void balance() {
		String[] ac = { " ", "Caja     ", "Mercancia", "Cliente  "};
		int w,x,y,z,awa,ewe,owo;
		int acr[] = new int[999];
		String[] af = { " ", "Terrenos   ", "Mobiliario ", "Equip.d rep"};
		int afr[] = new int[999];
		String[] pc = { " ", "Proveedores   ", "Doc. Por pagar"};
		int pcr[] = new int[999];
		String[] pf = { " ", "Hipotecas por pagar", "Doc. Por pagar L/P "};
		int pfr[] = new int[999];
		System.out.println("App de balance general");
		System.out.println();
		System.out.println("Empezamos con Activos circulantes");
		System.out.println();
		System.out.println("Porfavor ingrese los datos que se le solicitan");
		for(int r1=1;r1<ac.length;r1++) {
			System.out.println(r1+"." + ac[r1]);
			acr[r1]=Lector.nextInt();
		}
		w=acr[1]+acr[2]+acr[3];
		System.out.println("El total Activos Circulantes es "+ w );
		System.out.println();
		System.out.println("Seguimos con Activos fijos");
		System.out.println();
		System.out.println("Porfavor ingrese los datos que se le solicitan");
		for(int r=1;r<af.length;r++) {
			System.out.println(r+"." + af[r]);
			afr[r]=Lector.nextInt();
		}
		x=afr[1]+afr[2]+afr[3];
		System.out.println("Total Activos Fijos es "+  x);
		System.out.println();
		System.out.println("Empezamos con Pasivos circulantes");
		System.out.println();
		System.out.println("Porfavor ingrese los datos que se le solicitan");
		for(int rr1=1;rr1<pc.length;rr1++) {
			System.out.println(rr1+"." + pc[rr1]);
			pcr[rr1]=Lector.nextInt();
		}
		y=pcr[1]+pcr[2]+pcr[3];
		System.out.println("El total Pasivos Circulantes es "+ y );
		System.out.println("Seguimos con Pasivos Fijos");
		System.out.println();
		System.out.println("Porfavor ingrese los datos que se le solicitan");
		for(int rr2=1;rr2<pf.length;rr2++) {
			System.out.println(rr2+"." + pf[rr2]);
			pfr[rr2]=Lector.nextInt();
		}
		z=pfr[1]+pfr[2]+pfr[3];
		System.out.println("El total Pasivos Fijos es "+ z );
		
		
		
		
		
		
		
		
		
		System.out.println("                                             "+ bn[1]+" " + bn[2]+ "                                " );
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		System.out.println("                                           Balance general                                       ");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		System.out.println("   ACTIVOS"+ "                         1   "+ "            2   "+"                 3  "+"               4                  ");
		System.out.println("   Activos circulantes");
		for(int r2=1;r2<ac.length;r2++) {
			System.out.println(r2+"." +" "+ ac[r2]+"                                                 "+acr[r2]);
			
		}
		
		System.out.println("Total Activos Circulantes                                                    "+ w );
		System.out.println();
		System.out.println("  Activos Fijos");
		for(int r3=1;r3<af.length;r3++) {
			System.out.println(r3+"." +" "+ af[r3]+"                                               "+afr[r3]);
			
		}
		
		System.out.println("Total Activos Fijos                                                          "+  x);
		ewe=w+x;
		System.out.println();
		System.out.println("TOTAL ACTIVOS                                                                                     "+ ewe );
		System.out.println("   Pasivos circulantes");
		for(int r5=1;r5<pc.length;r5++) {
			System.out.println(r5+"." +" "+ pc[r5]+"                                            "+pcr[r5]);
			
		}
		
		System.out.println("Total Pasivos Circulantes                                                    "+ y );
		System.out.println();
		System.out.println("   Pasivos Fijos");
		for(int r6=1;r6<pf.length;r6++) {
			System.out.println(r6+"." +" "+ pf[r6]+"                                       "+pfr[r6]);
			
		}
		
		System.out.println("Total Pasivos Fijos                                                          "+ z );
		awa=(w+x)-(y+z);
		owo=y+z;
		System.out.println("TOTAL PASIVOS                                                                                     "+ owo );
		System.out.println("CAPITAL CONTABLE                                                                                  "+ awa );
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
	}
	
	
	
	public void control() {
		int s, o;
		int opcion = 0, opcion1 = 0;
		String[] cv = { " ", "Compras", "Ventas", "Compra", "Venta" };
		int a[] = new int[999];
		int b[] = new int[999];
		String m[] = new String[999];
		System.out.println("Control de compras y ventas");
		System.out.println("1.Compras");
		System.out.println("2.Ventas");
		o = Lector.nextInt();
		while (o <= 0 || o >= 3) {
			System.out.println("Porfavor introduzca un dato valido");
			o = Lector.nextInt();
		}
		switch (o) {
		case 1:
			System.out.println("Usted accedio al programa de " + cv[1]);
			System.out.println("Ingrese cuantas " + cv[1] + " desea realizar");
			s = Lector.nextInt();
			s = s + 1;
			System.out.println("Desea agregarle nombres a las compras?");
			System.out.println("1. Si");
			System.out.println("2. No");
			opcion = Lector.nextInt();
			while (opcion <= 0 || opcion >= 3) {
				System.out.println("Porfavor introduzca un dato valido");
				opcion = Lector.nextInt();
			}
			switch (opcion) {
			case 1:
				for (int o1 = 1; o1 < s; o1++) {
					System.out.println("Introduzca el nombre de " + cv[3] + " " + o1);
					m[o1] = Lector.next();

					System.out.println("Introduzca la cantidad de " + m[o1] + " comprad@s");
					a[o1] = Lector.nextInt();

					System.out.println("Introduzca el costo por unidad de " + m[o1] + " comprad@s");
					b[o1] = Lector.nextInt();
				}

				for (int o3 = 1; o3 < s; o3++) {
					System.out.println("Se compraron " + a[o3] + " unidades de " + m[o3]);
					System.out.println("El costo de " + m[o3] + " por unidad es " + b[o3]);
					System.out.println("El costo total de " + m[o3] + " es " + a[o3] * b[o3]);
					System.out.println();
				}
			case 2:
				for (int o1 = 1; o1 < s; o1++) {
					System.out.println("Introduzca la cantidad de " + cv[3] +" "+ o1);
					a[o1] = Lector.nextInt();

					System.out.println("Introduzca el costo por unidad de " + cv[3] + " " + o1);
					b[o1] = Lector.nextInt();
				}
				for (int o3 = 1; o3 < s; o3++) {
					System.out.println("Se compraron " + a[o3] + " unidades de " + cv[3]);
					System.out.println("El costo de " + cv[3] + " por unidad es " + b[o3]);
					System.out.println("El costo total de " + cv[3] + " es " + a[o3] * b[o3]);
					System.out.println();
				}
			}
			break;
		case 2:
			System.out.println("Usted accedio al programa de " + cv[2]);
			System.out.println("Ingrese cuantas " + cv[2] + " desea realizar");
			s = Lector.nextInt();
			s = s + 1;
			System.out.println("Desea agregarle nombres a las ventas?");
			System.out.println("1. Si");
			System.out.println("2. No");
			opcion1 = Lector.nextInt();
			while (opcion1 <= 0 || opcion1 >= 3) {
				System.out.println("Porfavor introduzca un dato valido");
				opcion1 = Lector.nextInt();
			}
			switch (opcion1) {
			case 1:
				for (int o1 = 1; o1 < s; o1++) {
					System.out.println("Introduzca el nombre de la " + cv[4] + " " + o1);
					m[o1] = Lector.next();

					System.out.println("Introduzca la cantidad de " + m[o1] + " vendidas");
					a[o1] = Lector.nextInt();

					System.out.println("Introduzca el precio por unidad de " + m[o1] + " vendidas");
					b[o1] = Lector.nextInt();
				}

				for (int o3 = 1; o3 < s; o3++) {
					System.out.println("Se vendieron " + a[o3] + " unidades de " + m[o3]);
					System.out.println("La venta de " + m[o3] + " por unidad es " + b[o3]);
					System.out.println("La venta total de " + m[o3] + " es " + a[o3] * b[o3]);
					System.out.println();
				}
			case 2:
				for (int o1 = 1; o1 < s; o1++) {
					System.out.println("Introduzca la cantidad de " + cv[4] +" "+ o1);
					a[o1] = Lector.nextInt();

					System.out.println("Introduzca la venta por unidad de " + cv[4] + " " + o1);
					b[o1] = Lector.nextInt();
				}
				for (int o3 = 1; o3 < s; o3++) {
					System.out.println("Se vendieron " + a[o3] + " unidades de " + cv[4]);
					System.out.println("La venta de " + cv[4] + " por unidad es " + b[o3]);
					System.out.println("La venta total de " + cv[4] + " es " + a[o3] * b[o3]);
					System.out.println();
				} 
				
				break;
			}
		}
	}

	public static void main(String[] args) {
		App sandia = new App();
		sandia.nombreempresa();
		sandia.balance();
		//sandia.control();
	}

}
