package stack;

public class StackUsingArray{

    private int array[];
    private int topIndex;  //Index of the top most element of the stack

    public StackUsingArray(){
        array= new int[10];
        topIndex=-1;
    }

    
    //O(1)
    public int size(){
        return topIndex+1;

    }

    //O(1)
    public boolean isEmpty(){

          //if(topIndex==-1) return true;
          //else return false;
          return topIndex == -1;
    }

    
    //O(1)
    public void push(int elem) throws StackFullException{
          //If stack is full
          if(topIndex==array.length-1){
              StackFullException e= new StackFullException();
              throw e;
              //Throw Exception
          }
          topIndex++;
          array[topIndex]= elem;

    }
    
    private void doublecapacity()
    {
    	int temp[]=array;
    	array=new int[2*temp.length];
    	
    	for(int i=1;i<temp.length;i++)
    	{
    		array[i]=temp[i];
    	}
    }

    //O(1)
    public int top() throws StackEmptyException, StackFullException{
      if(topIndex==-1){
        //Throw stack empty exception
        throw new StackFullException();
      }
        return array[topIndex];

    }

    //O(1)
    public int pop() throws StackEmptyException{

        if(topIndex==-1){
            throw new StackEmptyException();
        }
        int temp = array[topIndex];
        topIndex--;
        return temp;
    }


}