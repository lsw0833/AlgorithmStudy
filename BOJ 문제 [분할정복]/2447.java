import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static ArrayList<ArrayList<Character>> result = new ArrayList<ArrayList<Character>>();
	static void Iwanttobeastar(int N,int startx, int starty, int endx, int endy) {
		if(N==1) {
			result.get(startx).add('*');
		}else {
			for(int i=startx; i<=endx; i+=N/3) {
				for(int j=starty; j<=endy; j+=N/3) {
					if(i==N/3+startx&&j==N/3+starty) {
						Iwanttobeastar2(N/3,i,j,i+N/3-1,j+N/3-1);
					}else {
						Iwanttobeastar(N/3,i,j,i+N/3-1,j+N/3-1);
					}
				}
			}
		}
		
	}
	static void Iwanttobeastar2(int N,int startx, int starty, int endx, int endy) {
		if(N==1) {
			result.get(startx).add(' ');
		}else {
			for(int i=startx; i<=endx; i+=N/3) {
				for(int j=starty; j<=endy; j+=N/3) {
					Iwanttobeastar2(N/3,i,j,i+N/3-1,j+N/3-1);
				}
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			result.add(new ArrayList<Character>());
		}
		Iwanttobeastar(N,0,0,N-1,N-1);
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				bw.write(result.get(i).get(j));
			}
			bw.write("\n");
		}
		bw.close();
	}

}
