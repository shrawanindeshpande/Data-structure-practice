package dsa;

public class MirrorTree {
	TreeNode root;
	void mirror(TreeNode node)
    {
	// Your code here
	    TreeNode temp;
	    if(node==null){
	        return;
	    }
	    temp=node.left;
	    node.left=node.right;
	    node.right=temp;
	    mirror(node.left);
	    mirror(node.right);
    }
	void display(TreeNode node) {
    	if(node==null) {
    		return;
    	}
    	System.out.print(node.key+" ");
    	display(node.left);
    	display(node.right);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MirrorTree mt=new MirrorTree();
		mt.root=new TreeNode(12);
		mt.root.left=new TreeNode(43);
		mt.root.right=new TreeNode(66);
		mt.root.right.right=new TreeNode(4);
		mt.root.right.left=new TreeNode(-9);
		mt.display(mt.root);
		mt.mirror(mt.root);
		System.out.println();
		mt.display(mt.root);
	}

}
