public class FlipFlop{

	public static void main(String[] args){
	  System.out.println("Flip Flop");
      int numero=0;
      numero = Integer.parseInt(args[0].toString());
      System.out.println("-------");
      for(int x=0;x<=numero;x++){
      	if((x%3==0)&&(x%5==0)){
      		System.out.println("FlipFlop " + x);
      		System.out.println("-------");
      	}else if(x%5==0){
      		System.out.println("Flop " + x);
      		System.out.println("-------");
      	}else if(x%3==0){
      		System.out.println("Flip " + x);
      		System.out.println("-------");
      	}else{
      		System.out.println(x);
      		System.out.println("-------");
      	}
      }
      System.out.println("--------------------------");
	}
}