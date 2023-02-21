package com.mcmichael.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class Matrix01 {
	public int[][] updateMatrix(int[][] mat) {
		if (mat.length == 1 && mat[0].length == 1) {
			return mat;
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (j == 0) {
//					 nothing left
				}
				if (j == mat[i].length - 1) {
//					nothing right
				}
				if (i == 0) {
//					nothing above
				}
				if (i == mat.length - 1) {
//					nothing below
				}
				
				
			}
		}
		
		return null;
	}
	class Pair{
	    int a;
	    int b;
	    Pair(int a, int b){
	        this.a = a;
	        this.b = b;
	    }
	}
	
	
	// no fucking idea whats going on.... ):
	class Solution {
	public int[][] updateMatrix(int[][] matrix) {
	        
	        int m = matrix.length;
	        int n = matrix[0].length;
	        Queue<Pair> que = new LinkedList<>();
	        int [][] vis = new int[m][n];
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(matrix[i][j]==0){
	                    que.add(new Pair(i,j));
	                   vis[i][j]=1;
	                }
	            }
	        }
	        
	        int r[]={1,0,-1,0};
	        int s[]={0,-1,0,1};
	        
	        int currval=1;
	        int x,y,size;
	        Pair pair;
	        while(!que.isEmpty()){
	             size=que.size();
	            while(size-->0){
	                 pair = que.poll();
	                int i1 = pair.a;
	                int i2 = pair.b;
	              for(int i=0;i<4;i++){
	                   x=i1+r[i];
	                   y=i2+s[i];
	                  if(x>=0 && y>=0 && x<m && y<n && vis[x][y]!=1 && 
	                    matrix[x][y]==1){
	                      matrix[x][y]=currval;
	                      vis[x][y]=1;
	                      que.add(new Pair(x,y));
	                  }
	                }    
	            }
	            ++currval;
	            
	        }
	        
	        return matrix;
	    }
	}

}
