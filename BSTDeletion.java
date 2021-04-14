package dsa;
class BSTDeletion {
 class Node {
     int key;
     Node left, right;

     public Node(int item)
     {
         key = item;
         left = right = null;
     }
 }
 Node root;
 BSTDeletion() { 
	 root = null;
	 }
 void deleteKey(int key) {
	 root = deleteRec(root, key);
	 }
 Node deleteRec(Node root, int key)
 {
     if (root == null)
         return root;
     if (key < root.key)
         root.left = deleteRec(root.left, key);
     else if (key > root.key)
         root.right = deleteRec(root.right, key);
     else {
         if (root.left == null)
             return root.right;
         else if (root.right == null)
             return root.left;
         root.key = minValue(root.right);
         root.right = deleteRec(root.right, root.key);
     }
     return root;
 }

 int minValue(Node root)
 {
     int minv = root.key;
     while (root.left != null)
     {
         minv = root.left.key;
         root = root.left;
     }
     return minv;
 }
 void insert(int key) {
	 root = insertRec(root, key);
	 }
 Node insertRec(Node root, int key)
 {
     if (root == null) {
         root = new Node(key);
         return root;
     }
     if (key < root.key)
         root.left = insertRec(root.left, key);
     else if (key > root.key)
         root.right = insertRec(root.right, key);
     return root;
 }
 void inorder() { 
	 inorderRec(root); 
	 }
 void inorderRec(Node root)
 {
     if (root != null) {
         inorderRec(root.left);
         System.out.print(root.key + " ");
         inorderRec(root.right);
     }
 }
 public static void main(String[] args)
 {
     BSTDeletion tree = new BSTDeletion();
     tree.insert(50);
     tree.insert(30);
     tree.insert(20);
     tree.insert(40);
     tree.insert(70);
     tree.insert(60);
     tree.insert(80);
     System.out.println("Inorder traversal of the given tree");
     tree.inorder();
     System.out.println("\nDelete 80");
     tree.deleteKey(80);
     System.out.println("Inorder traversal of the modified tree");
     tree.inorder();
     System.out.println("\nDelete 60");
     tree.deleteKey(60);
     System.out.println("Inorder traversal of the modified tree");
     tree.inorder();
     System.out.println("\nDelete 70");
     tree.deleteKey(70);
     System.out.println("Inorder traversal of the modified tree");
     tree.inorder();
 }
}