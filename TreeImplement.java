
package dsa;

public class TreeImplement {
    TreeNode root;
    TreeImplement(int key)
    {
        root = new TreeNode(key);
    }
 
    TreeImplement()
    {
        root = null;
    }
    

	public static void main(String[] args) {
		 TreeImplement tree = new TreeImplement();
	        tree.root = new TreeNode(1);
	        tree.root.left = new TreeNode(2);
	        tree.root.right = new TreeNode(3);
	        tree.root.left.left = new TreeNode(4);
	}

}
