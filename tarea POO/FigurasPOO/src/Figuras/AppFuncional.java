package Figuras;

import java.util.*;

public class AppFuncional {
	static Scanner Lector = new Scanner(System.in);

	public void regresoxd() {
		int opcion=0;
		if (opcion<=1 && opcion >=10) {
			System.out.println("Porfavor introduzca un dato valido");
			opcion = Lector.nextInt();
		}
	}
	
	public static void main(String[] args) {
		String[] za = { "", "Cilindro", "Cono", "Esfera", "Hexaedro", "Piramide", "Prisma", "Tetraedro",
				"Tronco de cono", "Tronco de Piramide", "Salir" };
		AppFuncional u = new AppFuncional();
		int opcion;
		int owo = 0, ono = 0;
		int fq = 0;
		do {
			try {
				do {

					System.out.println("");
					System.out.println("App de figuras geometricas");
					System.out.println("");
					System.out.println("Que app desea usar?");
					for (int wa = 1; wa < 11; wa++) {
						System.out.println(wa + "." + za[wa]);
					}
					opcion = Lector.nextInt();
					u.regresoxd();
					switch (opcion) {

					case 1:
						Cilindro c = new Cilindro(fq, fq, false, fq, fq, fq, fq, fq);
						c.Cilindro();
						break;
					case 2:
						Cono co = new Cono(fq, fq, false, fq, fq, fq, fq, fq);
						co.Cono();
						break;
					case 3:
						Esfera e = new Esfera(fq, fq, false, fq, fq);
						e.Esfera();
						break;
					case 4:
						Hexaedro he = new Hexaedro(fq, fq, false, fq, fq, fq, fq);
						he.Hexaedro();
						break;
					case 5:
						Piramide pr = new Piramide(fq, fq, false, fq, fq, fq, fq, fq, fq, fq, fq, fq, fq);
						pr.Piramide();
						break;
					case 6:
						Prisma p = new Prisma(fq, fq, false, null, fq, fq, fq, fq, fq, fq, fq, fq);
						p.Prisma();
						break;
					case 7:
						Tetraedro te = new Tetraedro(fq, fq, false, fq, fq, fq);
						te.Tetraedro();
						break;
					case 8:
						Tcono tc = new Tcono(fq, fq, false, fq, fq, fq, fq, fq, fq, fq);
						tc.ToCono();
						break;
					case 9:
						Tpiramide tp = new Tpiramide(fq, fq, false, fq, fq, fq, fq, fq, fq, fq, fq, fq, fq, fq);
						tp.ToPiramide();
						break;
					case 10:
						System.out.println("Gracias por utilizar nuestro programa!!");

						return;
					}
					while (opcion <= 0 || opcion >= 10) {
						System.out.println("Porfavor introduzca un dato valido");
						opcion = Lector.nextInt();
						switch (opcion) {

						case 1:
							Cilindro c = new Cilindro(fq, fq, false, fq, fq, fq, fq, fq);
							c.Cilindro();
							break;
						case 2:
							Cono co = new Cono(fq, fq, false, fq, fq, fq, fq, fq);
							co.Cono();
							break;
						case 3:
							Esfera e = new Esfera(fq, fq, false, fq, fq);
							e.Esfera();
							break;
						case 4:
							Hexaedro he = new Hexaedro(fq, fq, false, fq, fq, fq, fq);
							he.Hexaedro();
							break;
						case 5:
							Piramide pr = new Piramide(fq, fq, false, fq, fq, fq, fq, fq, fq, fq, fq, fq, fq);
							pr.Piramide();
							break;
						case 6:
							Prisma p = new Prisma(fq, fq, false, null, fq, fq, fq, fq, fq, fq, fq, fq);
							p.Prisma();
							break;
						case 7:
							Tetraedro te = new Tetraedro(fq, fq, false, fq, fq, fq);
							te.Tetraedro();
							break;
						case 8:
							Tcono tc = new Tcono(fq, fq, false, fq, fq, fq, fq, fq, fq, fq);
							tc.ToCono();
							break;
						case 9:
							Tpiramide tp = new Tpiramide(fq, fq, false, fq, fq, fq, fq, fq, fq, fq, fq, fq, fq, fq);
							tp.ToPiramide();
							break;
						case 10:
							System.out.println("Gracias por utilizar nuestro programa!!");
							return;
						}
					}
				} while (fq == 0);
			} catch (InputMismatchException e) {
				System.out.println("Solo puede introducir numeros");
				Lector.next();
				
			}
		} while (fq == 0);
	}
}
