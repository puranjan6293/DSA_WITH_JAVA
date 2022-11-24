package Leetcode;

public class Word_Search {
    
}
class Solution {
    //DFS and backtracking
    boolean [][] visited;
    int n,m;
    public boolean exist(char[][] board, String word) {
        n=board.length;
        m=board[0].length;
        visited=new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(valid(i,j,0,board,word)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean valid(int i,int j,int count,char [][] board,String word){
        /*-------------base conditions-------------*/
        //out of bound
        if(i<0 || i>=n || j<0 || j>=m ){
            return false;
        }

        //if already visited
        if(visited[i][j]){
            return false;
        }

        //mismatch
        if(word.charAt(count)!=board[i][j]){
            return false;
        }

        //if word is found
        if(count==word.length()-1){
            return true;
        }

        /*----------------calculation and recursive calls----------*/

        //mark current visited
        visited[i][j]=true;

        //inc count
        count++;

        //down,right,up,left search
        if(valid(i+1,j,count,board,word) ||
           valid(i,j+1,count,board,word) ||
           valid(i-1,j,count,board,word) ||
           valid(i,j-1,count,board,word) ){
               return true;
           }
        
        //mark current cell unvisited
        visited[i][j]=false;
        
        return false;

    }

}