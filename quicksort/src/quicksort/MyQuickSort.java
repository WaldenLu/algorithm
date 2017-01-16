package quicksort;

import java.util.Arrays;

/**
 * @author 97267
 *
 */
//���ž���һ����ӵ��㷨
//ѡ��base֮��ÿ�ν�����ʵ������base������λ��
//ֻ������ʱ��base�����������ѣ����λ����ʵ���¸�����Ҫ������ִ�ŵ�λ��
//ÿ��ѡ��һ��base֮���������֮ǰ����������С��֮�󶼱�����
public class MyQuickSort {
		public static void main(String[] args) {
						
			// TODO Auto-generated method stub
			MyQuickSort teSort = new MyQuickSort();
			RandomNumber number = new RandomNumber();
			int [] arr = number.randomNumbuilder();
			/*System.out.println("p"+Arrays.toString(arr));*/
			long startTime = System.currentTimeMillis();
			teSort.quickSort(arr, 0, arr.length-1);
			long endTime = System.currentTimeMillis();
			System.out.println(Arrays.toString(arr));
			System.out.println("排序算法用时："+(endTime-startTime)+"ms");
		
		}

	
	private void quickSort( int []arrays,int start,int end)
	{	
		
		 if(start>=end){
	            return;
	        }   	        
	        int i = start;
	        int j = end;
	        int value = arrays[i];
	        boolean flag = true;
	        while (i != j) {
	            if (flag) {
	                if (value > arrays[j]) {
	                    swap(arrays, i, j);
	                    flag=false;
	                } else {
	                    j--;
	                }
	            }else{
	                if(value<arrays[i]){
	                    swap(arrays, i, j);
	                    flag=true;
	                }else{
	                    i++;
	                }
	            }
	        }	   
	     /*   System.out.println(Arrays.toString(arrays)); */
	        quickSort(arrays, start, j-1);
	        quickSort(arrays, i+1, end);	        
	        
	} 
	        	
	
	private void swap(int[] arrays, int i, int j) 
	{
        int temp;
        temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }
	
 

}
