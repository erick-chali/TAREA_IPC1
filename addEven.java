public class addEven{

	public static void main(String[] args){
		System.out.println("Pares e Impares");
		int numero=0;
		numero = Integer.parseInt(args[0].toString());
		if(numero%2==0){
			System.out.println("El numero " + numero + " es par.");
		}else{
			System.out.println("El numero " + numero + " es impar.");
		}
		System.out.println("------------------------------");
	}
}