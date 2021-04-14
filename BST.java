package dsa;

public class BST {
	TreeNode root;
    BST(int key)
    {
        root = new TreeNode(key);
    }
 
    BST()
    {
        root = null;
    }
	
	public TreeNode search(TreeNode root,int key) {
		if(root==null || root.key==key) {
			return root;
		}
		if(root.key<key) {
			return search(root.right,key);
		}
		return search(root.left,key);
	}
	public static void main(String[] args) {
		BST b=new BST();
        b.root = new TreeNode(25);
        b.root.left = new TreeNode(22);
        b.root.right = new TreeNode(32);
        b.root.left.left = new TreeNode(20);
        b.root.left.right = new TreeNode(23);
        b.root.right.left = new TreeNode(29);
        b.root.right.right = new TreeNode(44);   
        TreeNode tn=b.search(b.root,9);
        if(tn==null) {
        	System.out.println("Key not found");
        }
        else {
        System.out.println(tn.key+" is present in tree");
        }
      
	}

}
