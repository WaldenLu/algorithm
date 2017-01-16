package quicksort;
/*
 * 生成一个大小为size的int类型随机数组
 */
public class RandomNumber {
 	public int[] randomNumbuilder()
	{
 		final int size = 100000;
		int i = 0;
		int index = 0;
		int []arr = new int [size];
		while(i < size)
		{
		double temp = Math.random();
		arr[index] = (int)(temp* size);
		index++;
		i++;
		}
		return arr;
	}
}
