package InterviewPrep;

import java.util.HashSet;
import java.util.Set;

public class validsudoko {

	public static void main(String[] args) {
		  char[][] board = {
	                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
	                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
	                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
	                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
	                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
	                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
	                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
	                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
	                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
	        };
		  Solutio solution = new Solutio();
	        System.out.println("Is valid sudoku: " + solution.isValidSudoko(board));
	}

}
class Solutio{
	public boolean isValidSudoko(char[][] board)
	{
		Set<String> seen=new HashSet<>();
		for(int row=0;row<9;row++)
		{
			for(int col=0;col<9;col++)
			{
				char number=board[row][col];
				if(number!='.')
				{
					if(!seen.add(number+ " in row "+row ) 
							|| (!seen.add(number+" in col "+col))
							||
							(!seen.add(number+""+(row/3)+","+(col/3)))
							)
					{
						return false;
					}
				}
			}
		}
		return true;
	}
}