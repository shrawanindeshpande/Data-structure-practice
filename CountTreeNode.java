package dsa;

class TreeNode2{
	int data;
	TreeNode2 left;
	TreeNode2 right;
	public TreeNode2(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class CountTreeNode {
	TreeNode2 root;
	int count=0;
	public  int getSize(TreeNode2 root)
	{
        if(root==null){
            return 0;
        }
        return (getSize(root.left)+1+getSize(root.right));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountTreeNode lc=new CountTreeNode();
		lc.root=new TreeNode2(23);
		lc.root.left=new TreeNode2(22);
		lc.root.right=new TreeNode2(31);
		lc.root.right.left=new TreeNode2(45);
		lc.root.left.right=new TreeNode2(89);
		lc.root.left.left=new TreeNode2(2);
		lc.root.right.right=new TreeNode2(21);
		System.out.println(lc.getSize(lc.root));

	}

}
