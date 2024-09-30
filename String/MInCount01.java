package String;

import Arrays2.Push0satEnd;

public class MInCount01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,0,1,1,0,1,0,0,1,0};
pushZerosAtEnd(arr);
	}
	public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        int i=0,j=0,c=0;
        for(;i<arr.length;i++)
        {
            if(arr[i]!=1)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              j++;
c++;
            }
        }
        for(int k=0;k<arr.length-1;k++)
        {
        	System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println(c);

      
        }
}
