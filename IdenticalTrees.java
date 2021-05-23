package dsa;

public class IdenticalTrees {
	TreeNode root1;
	TreeNode root2;
	boolean flag=false;
	boolean isIdentical(TreeNode root1, TreeNode root2)
	{
	    if(root1==null && root2==null){
	       return true;
	    }
	    if(root1!=null && root2!=null){
	        return (root1.key==root2.key && isIdentical(root1.left,root2.left)
	        		&& isIdentical(root1.right,root2.right));
	    }
	    return false;
	  
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
		IdenticalTrees it=new IdenticalTrees();
		it.root1=new TreeNode(12);
		it.root1.left=new TreeNode(43);
		it.root1.right=new TreeNode(66);
		it.root1.right.right=new TreeNode(4);
		it.root1.right.left=new TreeNode(-9);
		it.display(it.root1);
		it.root2=new TreeNode(12);
		it.root2.left=new TreeNode(43);
		it.root2.right=new TreeNode(66);
		it.root2.right.right=new TreeNode(4);
		//it.root2.right.left=new TreeNode(-9);
		it.display(it.root2);
		if(it.isIdentical(it.root1, it.root2)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
