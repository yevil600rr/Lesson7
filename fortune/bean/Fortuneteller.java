package by.yevil.fortune.bean;
// ������� �� �������
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
	  System.out.println("�����");
	  
  }
  if (x[14] ==1) {
	  System.out.println("�� �����");
  }
  if (x[14] ==2) {
	  System.out.println("������");
  }
  if (x[14]==3) {
	  System.out.println("����������");
  }
	

}	
}
}
