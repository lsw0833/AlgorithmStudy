import java.util.*;
public class Solution {
	static int ans = 0;
	static public int solution(int[][] board) {
	        int answer = 0;
	        int len = board.length;
	        for(int i=0; i<len; i++) {
	        	for(int j=0; j<len; j++) {
	        		if(board[i][j]!=0) {
	        			if(remove(board,i,j,len)) {
	        				i=-1;
	        				break;
	        			}
	        		}
	        	}
	        }
	        answer = ans;
	        return answer;
	}
	static public boolean canFill(int [][] board, int x, int y) {
		boolean result = true;
		for(int i=0; i<=x; i++) {
			if(board[i][y]!=0) {
				result = false;
				break;
			}
		}
		return result;
	}
	static public boolean remove(int [][] board, int x, int y, int N) {
		int color = board[x][y];
		// い
		if(x+1<N && y+2<N) { 
			if(board[x+1][y] == color && board[x+1][y+1] == color && board[x+1][y+2]==color && canFill(board,x,y+1) && canFill(board,x,y+2)) {
				board[x][y] = 0;
				board[x+1][y] = 0;
				board[x+1][y+1] = 0;
				board[x+1][y+2] = 0;
				ans++;
				return true;
			}
		}
		// い 2
		if(x+2<N && y+1<N) { 
			if(board[x+1][y] == color && board[x+2][y] == color && board[x+2][y+1]==color && canFill(board,x+1,y+1)) {
				board[x][y] = 0;
				board[x+1][y] = 0;
				board[x+2][y] = 0;
				board[x+2][y+1] = 0;
				ans++;
				return true;
			}
		}
		// reverse い
		if(x+1<N && y-2>=0) { 
			if(board[x+1][y] == color && board[x+1][y-1] == color && board[x+1][y-2]==color && canFill(board,x,y-1) && canFill(board,x,y-2)) {
				board[x][y] = 0;
				board[x+1][y] = 0;
				board[x+1][y-1] = 0;
				board[x+1][y-2] = 0;
				ans++;
				return true;
			}
		}
		// reverse い 2
		if(x+2<N && y-1>=0) { 
			if(board[x+1][y] == color && board[x+2][y] == color && board[x+2][y-1]==color && canFill(board,x+1,y-1)) {
				board[x][y] = 0;
				board[x+1][y] = 0;
				board[x+2][y] = 0;
				board[x+2][y-1] = 0;
				ans++;
				return true;
			}
		}
		// で
		if(x+1<N && y-1>=0 && y+1<N) { 
			if(board[x+1][y] == color && board[x+1][y-1] == color && board[x+1][y+1]==color && canFill(board,x,y-1)&& canFill(board,x,y+1)) {
				board[x][y] = 0;
				board[x+1][y] = 0;
				board[x+1][y-1] = 0;
				board[x+1][y+1] = 0;
				ans++;
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
