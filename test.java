package lab3;

public class test {
	static Vector2D vec1, vec2 , vec3;


	public static void main(String[] args) {
		
		vec1 = new Vector2D(5, 10);
		vec2 = new Vector2D(2, 4);
		
		
		System.out.println("wektror1:" + vec1);
		System.out.println("wektror2:" + vec2);
		
		System.out.println("d³ugoœæ wektora: "+vec1.dlugosc());
		
		vec3 = vec1.suma(vec2);
		System.out.println("suma: " + vec3);
		
		vec3 = vec1.minus(vec2);
		System.out.println("roznica: "+ vec3);

		vec3 = vec1.mnozenie(3);
		System.out.println("iloczyn: "+ vec3);
		
		/*vec3 = vec1.dlugosc();
		System.out.println("D³ugoœc wektora: "+ vec3);*/
		
		vec3 = vec1.normalizacja();
		System.out.println("wektor znormalizowany: "+vec3);
	}
	
}