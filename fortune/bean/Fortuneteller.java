package by.yevil.fortune.bean;
// Гадание на ромашке
import java.util.Random;
public class Fortuneteller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x[] = new int [15];

for (int i=0; i<x.length; i++) {
	 
	Random ran = new Random();
	int s = ran.nextInt(4);
	x[i] = s;
}


for ( int i=0; i<x.length; i++) {
  if (x[14] ==0) {
	  System.out.println("Любит");
	  
  }
  if (x[14] ==1) {
	  System.out.println("Не любит");
  }
  if (x[14] ==2) {
	  System.out.println("Бросит");
  }
  if (x[14]==3) {
	  System.out.println("Приголубит");
  }
	

}	
}
}
