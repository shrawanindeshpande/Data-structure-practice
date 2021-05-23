package dsa;

public class SumOfTreeData {
	TreeNode root;
	int sum=0;
    int sumBT(TreeNode head){
        //Code
        if(head==null){
            return 0;
        }
        sum+=head.key;
        sumBT(head.left);
        sumBT(head.right);
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
		SumOfTreeData sd=new SumOfTreeData();
		sd.root=new TreeNode(12);
		sd.root.left=new TreeNode(43);
		sd.root.right=new TreeNode(66);
		sd.root.right.right=new TreeNode(4);
		sd.root.right.left=new TreeNode(-9);
		sd.display(sd.root);
		System.out.println("\nsum of elements:"+sd.sumBT(sd.root));

	}

}
