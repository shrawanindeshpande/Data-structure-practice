package dsa;

public class KDistance {
	TreeNode root;
	void Kdistance(TreeNode root, int k)
    {
         if(root==null){
             return;
         }
         if(k==0){
            System.out.print(root.key+" ");
         }
         Kdistance(root.left,k-1);
         Kdistance(root.right,k-1);
         
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
		KDistance kd=new KDistance();
		kd.root=new TreeNode(12);
		kd.root.left=new TreeNode(43);
		kd.root.right=new TreeNode(66);
		kd.root.right.right=new TreeNode(4);
		kd.root.right.left=new TreeNode(-9);
		int k=1;
		kd.display(kd.root);
		kd.Kdistance(kd.root, k);
	}

}
