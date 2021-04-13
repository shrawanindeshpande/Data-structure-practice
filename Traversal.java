package dsa;

public class Traversal {
	public void inOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.key+" ");
		inOrder(root.right);
	}
	public void preOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		System.out.print(root.key+" ");
		inOrder(root.left);
		inOrder(root.right);
	}
	public void postOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		inOrder(root.right);
		System.out.print(root.key+" ");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeImplement tree = new TreeImplement();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.right.left = new TreeNode(5);
        tree.root.right.right = new TreeNode(6);
        
        Traversal t=new Traversal();
        System.out.println("Inorder:");
        t.inOrder(tree.root);
        System.out.println("\nPreorder:");
        t.preOrder(tree.root);
        System.out.println("\nPostorder:");
        t.postOrder(tree.root);

	}

}
