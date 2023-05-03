import java.util.Iterator;

/** 
   A driver that demonstrates the class BinaryTree.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public class DriverBT 
{
	public static void main(String[] args)

	{
	  
	}  // end main

	/** Tests the 4 traversals of a given binary tree. */
	public static void testTraversals(BinaryTree<String> aTree, String preorder,
                                     String inorder, String postorder, String levelOrder)
	{
		testPreorder(aTree,   preorder);
		testInorder(aTree,    inorder);
		testPostorder(aTree,  postorder);
		testLevelOrder(aTree, levelOrder);
   } // end testTraversals

	public static void showTreeStats(BinaryTree<String> tree, String root, int height, int numberOfNodes)
	{
		if (tree.isEmpty())
			System.out.println("The tree is empty");
		else
			System.out.println("The tree is not empty");
		
		System.out.println("Root of tree is " + tree.getRootData() + "; s/b " + root);
		
		System.out.println("Height of tree is " + tree.getHeight() + "; s/b " + height);

		System.out.println("# nodes in tree is " + tree.getNumberOfNodes() + "; s/b " + numberOfNodes);
	} // end showTreeStats 

	public static void testLevelOrder(BinaryTree<String> tree, String answer)
	{
		System.out.println("\nLevel order:");
		System.out.println(answer + "  Expected");

	 	Iterator<String> levelOrder = tree.getLevelOrderIterator(); 
		
		while (levelOrder.hasNext())
		{	
			System.out.print(levelOrder.next() + " ");
		} // end while
		
		System.out.println(" Actual using LevelOrderIterator\n---------------");
	} // end testLevelOrder 

	public static void testPreorder(BinaryTree<String> tree, String answer)
	{
		System.out.println("\nPreorder:");
		System.out.println(answer + "  Expected");

	 	Iterator<String> preorder = tree.getPreorderIterator(); 
		
		while (preorder.hasNext())
		{	
			System.out.print(preorder.next() + " ");
		} // end while
		
		System.out.println(" Actual using PreorderIterator");
      tree.iterativePreorderTraverse();
      System.out.println(" Actual using iterativePreorderTraverse");
      System.out.println("---------------");
	} // end testPreorder

	public static void testInorder(BinaryTree<String> tree, String answer)
	{
		System.out.println("\nInorder:");
		System.out.println(answer + "  Expected");

	 	Iterator<String> inorder = tree.getInorderIterator(); 
		
		while (inorder.hasNext())
		{	
			System.out.print(inorder.next() + " ");
		} // end while
		
		System.out.println(" Actual using InorderIterator");
      
      tree.iterativeInorderTraverse();
      System.out.println(" Actual using iterativeInorderTraverse");
      System.out.println("---------------");
	} // end testInorder

	public static void testPostorder(BinaryTree<String> tree, String answer)
	{
		System.out.println("\nPostOrder:");
		System.out.println(answer + "  Expected");

	 	Iterator<String> postorder = tree.getPostorderIterator(); 
		
		while (postorder.hasNext())
		{	
			System.out.print(postorder.next() + " ");
		} // end while
		
		System.out.println(" Actual using PostorderIterator\n---------------");
	} // end testPostorder 

	public static void testEmptyTree() 
	{
		System.out.println("\nTest empty tree:");
		BinaryTree<String> myTree = new BinaryTree<>();
		// myTree.root is null, so myTree is empty, not null
		
		if (myTree == null)
			System.out.println("myTree is null--ERROR");
		else
		{
			System.out.println("myTree is not null--CORRECT.");
			
			if (myTree.isEmpty())
			 	 System.out.println("myTree is empty--CORRECT.");
			 else
			 	 System.out.println("myTree.root is not empty--ERROR");
		} // end if
		System.out.println();
	} // end testEmptyTree
   
   
}  // end DriverBT


