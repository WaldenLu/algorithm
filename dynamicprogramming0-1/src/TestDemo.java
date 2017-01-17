// 测试类
public class TestDemo {
	
	public static void main(String args[]){
		Goods[] bags = new Goods[]{new Goods(2,6),new Goods(2,3),new Goods(6,5),
				new Goods(5,4),new Goods(4,6)};
		int totalWeight = 12;
		DymanicProgramming dyProgramming = new DymanicProgramming(bags, totalWeight);		
		dyProgramming.solve();
		System.out.println("物品有：a(2,6),b(2,3),c(6,5),d(5,4),e(4，6)");
		System.out.print("");
		System.out.print("最优解为：");
		System.out.println(dyProgramming.getBestValue());
	}
}
