package dsa;

public class MinMaxTree {
	TreeNode root;
	static int min=Integer.MAX_VALUE;
    static int max=0;
	public static int findMax(TreeNode root)
	{
	    //Add your code here.
	    if(root==null){
	        return 0;
	    }
	    if(max<root.key){
	        max=root.key;
	    }
	    findMax(root.left);
	    findMax(root.right);
	    return max;
	    
	   
	}
	public static int findMin(TreeNode root)
	{
	    //Add your code here.
	    if(root==null){
	        return 0;
	    }
	    if(min>root.key){
	        min=root.key;
	    }
	    findMin(root.left);
	    findMin(root.right);
	    return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinMaxTree mt=new MinMaxTree();
		mt.root=new TreeNode(12);
		mt.root.left=new TreeNode(43);
		mt.root.right=new TreeNode(66);
		mt.root.right.right=new TreeNode(4);
		mt.root.right.left=new TreeNode(-9);
		System.out.println("Minimum in tree:"+mt.findMin(mt.root));
		System.out.println("Maximum in tree:"+mt.findMax(mt.root));


	}

}
