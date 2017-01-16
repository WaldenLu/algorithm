package quicksort;

/**
 * @author 97267
 *
 */
//�������
//ѡ��ıȽϵ�base����������������һ����
//�Դ����Ż��㷨

public class RandomQuickSort {
	

	public static void main(String[] args) {
		
			
		// TODO Auto-generated method stub
		RandomQuickSort teSort = new RandomQuickSort();
		RandomNumber number = new RandomNumber();
		int [] arr = number.randomNumbuilder();
		long startTime = System.currentTimeMillis();
		teSort.quickSort(arr, 0, arr.length-1);
		long endTime = System.currentTimeMillis();
		System.out.println("排序算法用时间"+(endTime-startTime)+"ms");
	
	}
	
	private void quickSort( int []arrays,int start,int end)
	{	
		
		 if(start>=end){
	            return;
	        }   
	        
	        int i = start;
	        int j = end;
	        int value = (int)((arrays.length)*Math.random());
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
	        quickSort(arrays, start, j-1);
	        quickSort(arrays, i+1, end);
	        	        
	        
	        
		/*int i;
		int j;
		i = start;
		j = end;
		int base = array[i];//ÿ�ζ������������һ��������Ϊ��׼		
		while(i <= j)
		{
			while(array[j] > base && i<j)
			{
				j--;
			}
			swap(array,i,j);
			i++;
			while(array[i] <= base && i<j)
			{
				i++;
			}
			swap(array,i,j);
			j--;
		}
		quickSort(array,start,i-1);
		quickSort(array,j+1,end);
		return array;*/
	}
	
	private void swap(int[] arrays, int i, int j) 
	{
        int temp;
        temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }
	
 	

}
