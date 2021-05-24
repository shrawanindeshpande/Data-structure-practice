package dsa;
class TreeNode1{
	int data;
	TreeNode1 left;
	TreeNode1 right;
	public TreeNode1(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class LeafCount {
	TreeNode root;
	int count=0;
    int countLeaves(TreeNode node) 
    {
         if(node == null){
             return -1;
         }
         if(node.left==null && node.right==null){
             count++;
         }
         countLeaves(node.left);
         countLeaves(node.right);
         return count;
            
    } 
	public static void main(String[] args) {
		LeafCount lc=new LeafCount();
		lc.root=new TreeNode(23);
		lc.root.left=new TreeNode(22);
		lc.root.right=new TreeNode(31);
		lc.root.right.left=new TreeNode(45);
		lc.root.left.right=new TreeNode(89);
		lc.root.left.left=new TreeNode(2);
		lc.root.right.right=new TreeNode(21);
		System.out.println(lc.countLeaves(lc.root));

	}

}
