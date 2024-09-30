package arrays;

import java.util.HashMap;
import java.util.Map;

public class PrintAllelemorethanNdivK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	arr[] = {3, 1, 2, 2, 1, 2, 3, 3};
	int k=4;
	
	MorethanK(arr,k);
	}

	private static void MorethanK(int[] arr, int k) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map=new HashMap<>();
int tem=(arr.length/k);

for(int i=0;i<arr.length;i++)
{
	if(!map.containsKey(arr[i]))
	{
		map.put(arr[i], 1);
	}
	
	else {
		int count=map.get(arr[i]);
		map.put(arr[i],count+1);
		
	}
}

for(Map.Entry m:map.entrySet())
{
	Integer temp=(Integer)m.getValue();
	
		if(temp > tem)
		{
			System.out.println(m.getKey());
		}
}

	}

}
