package by.htp.flower.logic;

import by.htp.flower.bean.Bud;
import by.htp.flower.bean.Flower;
import by.htp.flower.bean.Leaf;

public class BotanicEncyclopedia {

	public void printFlowerInfo(Flower flower) {

		if (flower != null) {

			System.out.println("Title:" + flower.getTitle());
			System.out.println("bud size, color " + flower.getBud().getSize() + " " 
			+ flower.getBud().getColor());
			System.out.println("stem height, width " + flower.getStem().getHeight() + " " 
			+ flower.getStem().getWidth());
			printLeaves (flower.getBud());
			
		}
	}
	private void printLeaves(Bud bud) {
		
		Leaf[] leaves = bud.getLeaves();
		if (bud != null && leaves != null) {
			for (Leaf leaf:leaves) {
				if (leaf != null) { 
				System.out.println("leaf color, shape:  " + leaf.getColor() +", "+ leaf.getShape());
				} else {
					System.out.println(" Leaf fall");
				}
			}
			
		}else if(bud != null)  {
			System.out.println("Leaves still not appear");	
		}
	}

}

