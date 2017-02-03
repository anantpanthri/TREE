package TREE;

public class TreeAlgo {

	private static final int INT_MIN = -1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree root= new BinaryTree();
		root=populateBinaryTree();
	 	System.out.println("inorder");
		inorderReversal(root);
		 System.out.println();
		System.out.println("preorder");
		preorderReversal(root);
		System.out.println(); 
		System.out.println("postorder");
		postorderReversal(root); 
		
		System.out.println("MAX_VALUE- "+FindMax(root));
		
	}

	private static BinaryTree  populateBinaryTree() {
		BinaryTree a= new BinaryTree();
		BinaryTree b= new BinaryTree();
		BinaryTree c= new BinaryTree();
		BinaryTree d= new BinaryTree();
		BinaryTree e= new BinaryTree();
		BinaryTree f= new BinaryTree();
		BinaryTree g= new BinaryTree();
		
		a.setData(1);
		a.setLeft(b);
		a.setRight(c);
		b.setData(2);
		b.setLeft(d);
		b.setRight(e);
		c.setData(3);
		c.setLeft(f);
		c.setRight(g);
		d.setData(4);
		e.setData(5);
		f.setData(6);
		g.setData(7);
		d.setRight(null);
		e.setRight(null);
		f.setRight(null);
		g.setRight(null);
		return a;
		
	}

	private static void inorderReversal(BinaryTree root) {

		if(root!=null){
			inorderReversal(root.getLeft());
			System.out.print(root.getData()+",");
			inorderReversal(root.getRight());			
		}
		
		
	}

	private static void preorderReversal(BinaryTree root) {
		if(root!=null){
			System.out.print(root.getData()+",");
			preorderReversal(root.getLeft());
			preorderReversal(root.getRight());			
		}
		
	}
	private static void postorderReversal(BinaryTree root) {
		if(root!=null){
			postorderReversal(root.getLeft());
			postorderReversal(root.getRight());
			System.out.print(root.getData()+",");
		}
		
	}
	
	public static int FindMax(BinaryTree root){
		
		int root_val,left,right,max=INT_MIN;
		if(root!=null){
			
			root_val=root.getData();
			max=root_val;
			right=FindMax(root.getRight());
			left=FindMax(root.getLeft());
			root_val=left>right?left:right;
			System.out.println(left+"compare"+right);
			max=root_val>max?root_val:max;
			System.out.println(max+"compare"+root_val);
		}
		
		return max;
		
		
		
	}





}
