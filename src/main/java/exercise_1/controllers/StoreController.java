package exercise_1.controllers;

import exercise_1.models.*;

public class StoreController extends Controller implements AceptorController {

	public StoreController(Session session) {
		super(session);
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
		controllerVisitor.visit(this);
	}

	public void addItem(Item item) {
		session.addItem(item);
	}

	public void removeItem(Item item) {
		session.removeItem(item);
	}

	public String getFlowerShopName() {
		return session.getFlowerShop().getName();
	}

	public String getStockText() {
		return session.getFlowerShop().getStockText();
	}

	public boolean ifExistItem(Decor decor) {
		return session.getFlowerShop().ifExistItem(decor);
	}

	public boolean ifExistItem(Flower flower) {
		return session.getFlowerShop().ifExistItem(flower);
	}

	public boolean ifExistItem(Tree tree) {
		return session.getFlowerShop().ifExistItem(tree);
	}

	public int getNextInvoiceNumber() {
		return session.getFlowerShop().getNextInvoiceNumber();
	}

	public int getItemQuantity(Decor decor) {
		return session.getFlowerShop().getItemQuantity(decor);
	}

	public int getItemQuantity(Flower flower) {
		return session.getFlowerShop().getItemQuantity(flower);
	}

	public int getItemQuantity(Tree tree) {
		return session.getFlowerShop().getItemQuantity(tree);
	}

	public void registerInvoice(Invoice invoice) {
		session.getFlowerShop().addInvoice(invoice);
	}

	public Decor pickUpItem(Decor decor, int quantity) {
		Decor tempDecor = session.getFlowerShop().getItem(decor);
		session.getFlowerShop().removeItemQuantity(decor, quantity);
		return tempDecor;
	}

	public Flower pickUpItem(Flower flower, int quantity) {
		Flower tempFlower = session.getFlowerShop().getItem(flower);
		session.getFlowerShop().removeItemQuantity(flower, quantity);
		return tempFlower;
	}

	public Tree pickUpItem(Tree tree, int quantity) {
		Tree tempTree = session.getFlowerShop().getItem(tree);
		session.getFlowerShop().removeItemQuantity(tree, quantity);
		return tempTree;
	}

	public String getInvoiceList() {
		return session.getFlowerShop().getInvoiceList();
		
	}

	public String getTotalVAlue() {
		return session.getFlowerShop().getTotalValue();
	}

	public String getEarnings() {
		return session.getFlowerShop().getEarnings();
	}
}
