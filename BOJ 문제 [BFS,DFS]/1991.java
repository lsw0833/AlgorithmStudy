import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		Tree t = new Tree();
		for(int i=0; i<N; i++) {
			String str = sc.nextLine();
			String [] spl = str.split(" ");
			t.add(spl[0].charAt(0), spl[1].charAt(0), spl[2].charAt(0));
		}
		t.preorder(t.head);
		System.out.println();
		t.inorder(t.head);
		System.out.println();
		t.postorder(t.head);
	}
	
}
class Node{
	char data;
	Node left = null;
	Node right = null;
	Node(char data){
		this.data = data;
	}
}
class Tree{
	Node head = null;
	Node finder = null;
	Tree(){
		
	}
	void add(char n1, char n2, char n3) {
		if(head == null) {
			head = new Node(n1);
			if(n2!='.')
				head.left = new Node(n2);
			if(n3!='.')
				head.right = new Node(n3);
		}else {
			find(head,n1);
			if(finder != null && finder.data==n1) {
				if(n2!='.')
					finder.left = new Node(n2);
				if(n3!='.')
					finder.right = new Node(n3);
			}
		}
	}
	void find(Node start,char data) {
		if(start==null)
			return;
		else {
			if(start.data==data) {
				finder = start;
				return ;
			}
			find(start.left,data);
			find(start.right,data);
		}
		
	}
	void preorder(Node temp) {
		if(temp==null){
			return;
		}
		System.out.print(temp.data);
		preorder(temp.left);
		preorder(temp.right);
	}
	void inorder(Node temp) {
		if(temp==null){
			return;
		}
		
		inorder(temp.left);
		System.out.print(temp.data);
		inorder(temp.right);
	}
	void postorder(Node temp) {
		if(temp==null){
			return;
		}
	
		postorder(temp.left);
		postorder(temp.right);
		System.out.print(temp.data);
	}
}