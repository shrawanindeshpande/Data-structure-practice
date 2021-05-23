package dsa;

public class MinElementInBST {
	TreeNode root;
	 int min=Integer.MAX_VALUE;
	    int minValue(TreeNode node)
	    {
	        if(node==null){
	            return -1;
	        }
	        if(node.key<min){
	            min=node.key;
	        }
	        minValue(node.left);
	        minValue(node.right);
	        return min;
	    }
	    void display(TreeNode node) {
	    	if(node==null) {
	    		return;
	    	}
	    	System.out.println(node.key+" ");
	    	display(node.left);
	    	display(node.right);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinElementInBST me=new MinElementInBST();
		me.root=new TreeNode(12);
		me.root.left=new TreeNode(43);
		me.root.right=new TreeNode(66);
		me.root.right.right=new TreeNode(4);
		me.root.right.left=new TreeNode(-9);
		me.display(me.root);
		System.out.println("Minimum element in tree is "+me.minValue(me.root));
		

	}

}
