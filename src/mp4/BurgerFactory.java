package mp4;

abstract class BurgerFactory {
	protected Condiment[] ingredientList;
	protected int ingredientCnt;
	
	public abstract void createBurger(int num);
}
