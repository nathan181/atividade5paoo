import java.util.LinkedList;
import java.util.Random;

public class MainPato {

	public static void main(String[] args) {
		DuckFactory [] fabricas = {
				new NorthFactory(),
				new SouthFactory()			
	};  
		int i;
		Random gerador = new Random();
		int n = gerador.nextInt(2);
		LinkedList<Duck> patos = new LinkedList<>();
		for(i=0;i<100;i++) {
		if(n==0) {
			 patos.add(fabricas[0].typeDuck("norte"));
		}
		else {
			patos.add(fabricas[1].typeDuck("sul"));
		}
		}
	}
		
}
