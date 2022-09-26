package exercise_1.models;

import java.util.ArrayList;
import java.util.List;

public class FlowerShop {

	private String name;
	private List<Flower> flowerList;
	private List<Tree> treeList;
	private List<Decor> decorList;

	public FlowerShop() {
		this.name = null;
		this.flowerList = new ArrayList<>();
		this.treeList = new ArrayList<>();
		this.decorList = new ArrayList<>();
	}

}
