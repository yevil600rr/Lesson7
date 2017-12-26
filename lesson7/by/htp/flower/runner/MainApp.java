package by.htp.flower.runner;
import by.htp.flower.bean.Flower;
import by.htp.flower.logic.BotanicEncyclopedia;
// ������� ������ ������ ������, ��������� ������ ��������, �����, �������.
// ������ : ��������� ���������, ������.
//�������� �� ������� ���������� � ��������� ������ ����� ������� ����� ��.
// ������� ����� ������� � ����� �������� �� �������
//������� ����� ������ �� ������ ������� (������ , ����� � �.�
//��� ������� ������� � ������� ���� ����� ��������� ������� ( �� 3-� �� 11)
//��� ������� �������� ������� �������� ��������
//��������� ���������� ��������  ���� ���������
//������� ������ ������� � �������� 
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 BotanicEncyclopedia enc = new BotanicEncyclopedia();
	 
	 System.out.println("____________");
	 System.out.println(" New Flower born");
	 Flower flower = new Flower ("Cammomile" , 10, 1);
	 enc.printFlowerInfo(flower);		
	 
	 System.out.println("____________");
	 System.out.println(" Flower grow");
	 flower.grow(25, 3, 5);
	 enc.printFlowerInfo(flower);


	 System.out.println("____________");
	 System.out.println(" Flower bloom");
     flower.bloom(8, "yellow");
     enc.printFlowerInfo(flower);
     
     System.out.println("____________");
	 System.out.println(" Flower wither");
	 flower.wither(4, 1, 0, "grey");
	 enc.printFlowerInfo(flower);
	}
	
}
