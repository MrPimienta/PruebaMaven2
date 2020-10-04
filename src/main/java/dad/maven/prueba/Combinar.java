package dad.maven.prueba;

public class Combinar {

	
	public static String combinar(Object[] array) {
		String combinacion = null;
		int i;
		for(i=0;i<array.length;i++) {
			combinacion+=array[i].toString();
			combinacion+=" ";
		}
		return combinacion;
	}
	
	public static void main(String[] args) {
		Object [] array = {"hola",3.14,"adios",15,true};
		String resultado = combinar(array); //hola 3,14 adios 15 true
		System.out.println(resultado.substring(4,resultado.length()));
	}

}
