package Items;

import ItemsBehavior.HPBehavior;
import ItemsBehavior.UseBehavior;

public abstract class Item {
	UseBehavior useBehavior;
	
	
	
	public UseBehavior getUseBehavior() {
		return useBehavior;
	}

	public void setUseBehavior(String item) {
		//this.combatBehavior = combatBehavior;
		switch(item) {//"Espada" "Arco", "Cétro", "Maza", "Látigo", "Daga"
		case "Poción": useBehavior = new HPBehavior();
		break;
		/*
		case "Arco": useBehavior = new BowBehavior();
		break;
		
		case "Cétro": useBehavior = new StaffBehavior();
		break;
		
		case "Maza": useBehavior = new HammerBehavior();
		break;
		
		case "Latigo": useBehavior = new WhipBehavior();
		break;
		
		case "Daga": useBehavior = new DaggerBehavior();
		break;*/
		}
}
