/**
 *@author Gabriele<b>
 *@since 19/05/2019
 *@version 2.0</b>
 */
public class Trapezio {
private float baseMax, baseMin, altezza;
/**
 * 
 * @param baseMax baseMaggiore
 * @param baseMin baseMinore
 * @param alt altezza
 */

public Trapezio (float baseMax, float baseMin , float alt) {
this.baseMax=baseMax;
this.baseMin=baseMin;
this.altezza=alt;
}
/**
 * metodo per calcolare l'area del trapezio
 * @return ritorno dell'area
 */

public float CalcolaArea() {
	float area=0;
	return area=((baseMax+baseMin)*altezza)/2;
}
	public static void main(String[] args) {
		Trapezio t=new Trapezio(5,20,5);
		System.out.println(t.CalcolaArea());
		
 }

}
