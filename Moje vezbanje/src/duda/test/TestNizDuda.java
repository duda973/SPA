package duda.test;

import duda.main.NizDuda;
import labis.exception.LabisException;

public class TestNizDuda {
	public static void main(String[] args) {
		NizDuda niz = new NizDuda();
		int[] a = new int[] {2,4,9,15};
		
		try { 
/*			
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
			System.out.println(niz.najveciNeparanElement(a) + " je najveci neparan element");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
			niz.ispisiJedinstveneElemente(a);
			System.out.println();
			niz.prikazNiza(a);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
			System.out.println("Zbir tri najvece vrednosti je " + niz.zbirTriNajveceVrednosti(a));
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
			int[] a = new int[] {2,4,9,15};
			int[] b = new int[] {1,2,3,5,6,11};
			int[] c = niz.spojiDvaRastucaNizaIVratiNoviRastuci(a, b);
			niz.prikazNiza(a);
			niz.prikazNiza(b);
			niz.prikazNiza(c);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
*/
			
			niz.prikazNiza(a);
		} catch (LabisException e) {
			System.out.println(e.getMessage());
		}
	}
}
