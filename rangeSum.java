public class rangeSum{

	public static void main(String[] args){
		System.out.println("Numeros de un rango");
		int numero1=0, numero2=0;
		numero1 = Integer.parseInt(args[0].toString());
		numero2 = Integer.parseInt(args[1].toString());
		if(numero1 > numero2){
			for(int x=numero2;x<=numero1;x++){
				System.out.println(x);
			}
		}else{
			for(int x=numero1;x<=numero2;x++){
				System.out.println(x);
			}
		}
		System.out.println("------------------------------");
	}
}