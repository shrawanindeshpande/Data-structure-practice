package dsa;

public class LeafSum {
	TreeNode root;
	int sum=0;
    public int SumofLeafNodes(TreeNode root)
    {
        // your code here
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            sum+=root.key;
        }
        SumofLeafNodes(root.left);
        SumofLeafNodes(root.right);
        return sum;
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
		LeafSum ls=new LeafSum();
		ls.root=new TreeNode(12);
		ls.root.left=new TreeNode(43);
		ls.root.right=new TreeNode(66);
		ls.root.right.right=new TreeNode(4);
		ls.root.right.left=new TreeNode(-9);
		ls.display(ls.root);
		System.out.println("Sum of leaf nodes:"+ls.SumofLeafNodes(ls.root));

	}

}
