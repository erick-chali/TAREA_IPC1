public class productToNumber{

	public static void main(String[] args){
		System.out.println("Producto hasta un numero");
		int numero=0;
		int resultado=1;
		numero = Integer.parseInt(args[0].toString());
		for(int x=0;x<numero;x++){
			resultado = resultado + (x*resultado);
		}
		System.out.println("La multiplicacion hasta el numero es: " + resultado);
		System.out.println("---------------------------------------");
	}
}