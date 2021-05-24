package dsa;

public class HeightTree {
	TreeNode root;
	int height=0;
    int height(TreeNode node) 
    {
        if(node ==null){
            return 0;
        }
        int lheight=height(node.left);
        int rheight=height(node.right);
        if(lheight>rheight){
            return (lheight+1);
        }
        return (rheight+1);
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
		HeightTree ht=new HeightTree();
		ht.root=new TreeNode(12);
		ht.root.left=new TreeNode(43);
		ht.root.right=new TreeNode(66);
		ht.root.right.right=new TreeNode(4);
		ht.root.right.left=new TreeNode(-9);
		System.out.println("\n"+ht.height(ht.root));

	}

}
