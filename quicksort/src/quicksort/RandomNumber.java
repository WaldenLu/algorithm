package quicksort;
/*
 * ����һ����СΪsize��int�����������
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
