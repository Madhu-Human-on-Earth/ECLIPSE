package premium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BestMeetingPoint {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	
	int[][] grid=new int[n][m];
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			grid[i][j]=sc.nextInt();
		}
	}
	
	int dist=minTotalDist(grid);
	System.out.println(dist);
	
}

private static int minTotalDist(int[][] grid) {
	//get x-coordinate-> row wise
	ArrayList<Integer> Xcoor=new ArrayList<>();
	
	for(int r=0;r<grid.length;r++) {
		for(int c=0;c<grid[0].length;c++) {
			if(grid[r][c]==1) {
				Xcoor.add(r);
			}
		}
	}
	
	// get y-coordinate -> col wise
ArrayList<Integer> Ycoor=new ArrayList<>();
	
	for(int c=0;c<grid[0].length;c++) {
		for(int r=0;r<grid.length;r++) {
			if(grid[r][c]==1) {
				Ycoor.add(c);
			}
		}
	}
	//get mid-> best meeting point
	int x=Xcoor.get(Xcoor.size()/2);
	int y=Ycoor.get(Ycoor.size()/2);
	
	//cal distance -> min dista
	
	int dist=0;
	for(int xval:Xcoor) {
		dist+=Math.abs(x-xval);
	}
	for(int yval:Xcoor) {
		dist+=Math.abs(y-yval);
	}
	
	return dist;
}
}
