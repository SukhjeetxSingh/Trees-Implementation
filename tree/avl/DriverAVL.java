
import java.util.Iterator;
/** 
   A driver that demonstrates the class AVLTree.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public class DriverAVL
{
	public static void main(String[] args)
	{
      // For testing purposes, we want to obtain several traversals.
      // As SearchTreeInterface only defines an inorder traversal,
      // we declare aTree's type to be AVLTree instead of SearchTreeInterface.
      AVLTree<Integer> aTree = createTree(); // Tests add
      
      // Test isEmpty, getRootData, getHeight, and getNumberOfNodes
		testTreeOperations(aTree);
      
      // Test inorder, preorder, postorder and level order traversals
      testTraversals(aTree, "10 20 35 40 50 55 60 70 80 90", "60 40 20 10 35 50 55 80 70 90",
                            "10 35 20 55 50 40 70 90 80 60", "60 40 80 20 50 70 90 10 35 55");
		System.out.println("Done.");
	}  // end main

   /** Tests add. */
	public static AVLTree<Integer> createTree()
	{
		System.out.println("\n\nCreating an AVL tree:");
		AVLTree<Integer> aTree = new AVLTree<>();
		System.out.println("Initial tree should be empty; isEmpty() returns " + aTree.isEmpty());

      // Test add
		System.out.println("\n\nTesting add() to create the AVL tree shown in Figure 27-10a:\n");
		System.out.println("Adding 60: returns " + aTree.add(60) + " (should be null)");
		System.out.println("Adding 50: returns " + aTree.add(50) + " (should be null)");
		System.out.println("Adding 20: returns " + aTree.add(20) + " (should be null)");
		System.out.println("Adding 80: returns " + aTree.add(80) + " (should be null)");
		System.out.println("Adding 90: returns " + aTree.add(90) + " (should be null)");
		System.out.println("Adding 70: returns " + aTree.add(70) + " (should be null)");
		System.out.println("Adding 55: returns " + aTree.add(55) + " (should be null)");
		System.out.println("Adding 10: returns " + aTree.add(10) + " (should be null)");
		System.out.println("Adding 40: returns " + aTree.add(40) + " (should be null)");
		System.out.println("Adding 35: returns " + aTree.add(35) + " (should be null)");
      System.out.println("Adding 35 again: returns " + aTree.add(35) + " (should be 35)");
     
		return aTree;
	} // end createTree
   
   /** Tests isEmpty, getRootData, getHeight, getNumberOfNodes, getEntry, and contains. */
	public static void testTreeOperations(SearchTreeInterface<Integer> aTree)
	{
      System.out.println("\n\nTesting isEmpty, getRootData, getHeight, and getNumberOfNodes:\n");
		if (aTree.isEmpty())
			System.out.println("Tree is empty, but should not be.");
		else
			System.out.println("Tree is not empty.");
		
		// Display root, height, number of nodes
		System.out.println("Root of tree is "   + aTree.getRootData()      + " (should be 60)");
		System.out.println("Height of tree is " + aTree.getHeight()        + " (should be 4)");
		System.out.println("Tree has "          + aTree.getNumberOfNodes() + " nodes (should be 10)");
      testGetEntry(aTree);
      testContains(aTree);
	} // end testTreeOperations
	
   // Tests getEntry.
	private static void testGetEntry(SearchTreeInterface<Integer> aTree)
	{
		System.out.println("\n\nTesting getEntry():\n");
		System.out.println("\nGetting 60: returns " + aTree.getEntry(60) + " (should be 60)");
		System.out.println("\nGetting 55: returns " + aTree.getEntry(55) + " (should be 55)");
		System.out.println("\nGetting 70: returns " + aTree.getEntry(70) + " (should be 70)");
		System.out.println("\nGetting 35: returns " + aTree.getEntry(35) + " (should be 35)");
		System.out.println("\nGetting 50: returns " + aTree.getEntry(50) + " (should be 50)");
		System.out.println("\nGetting 99: returns " + aTree.getEntry(99) + " (should be null)");
   } // end testGetEntry
   
   // Test contains.
   private static void testContains(SearchTreeInterface<Integer> aTree)
   {
		System.out.println("\n\n\nTesting contains():\n");

		if ( aTree.contains(60) )
			System.out.println("\n60 is in tree - OK");
		else 
			System.out.println("Error in contains()");
		
		if ( aTree.contains(90) )
			System.out.println("\n90 is in tree - OK");
		else 
			System.out.println("Error in contains()");
		
		if ( aTree.contains(10) )
			System.out.println("\n10 is in tree - OK");
		else 
			System.out.println("Error in contains()");
		
		if ( aTree.contains(35) )
			System.out.println("\n35 is in tree - OK");
		else 
			System.out.println("Error in contains()");

		if (!aTree.contains(99))
			System.out.println("\n99 is not in tree - OK");
		else 
			System.out.println("Error in contains()");
   } // end testContains
   
   /** Tests the 4 traversals of a given binary tree. */
   public static void testTraversals(AVLTree<Integer> aTree, String inorder, String preorder, String postorder, String levelOrder)
   {
      testInorder(aTree, inorder);
      // The following traversals are not defined by SearchTreeInterface, but are
      // available to AVLTree from its ancestor class BinaryTree.
      testPreorder(aTree,   preorder);
      testPostorder(aTree,  postorder);
      testLevelOrder(aTree, levelOrder);
   } // end testTraversals
   
   public static void testInorder(AVLTree<Integer> tree, String answer)
   {
      System.out.println("\nTraversing tree inorder:");
      System.out.println(answer + "  Expected");
      
      Iterator<Integer> inorder = tree.getInorderIterator();
      
      while (inorder.hasNext())
      {
         System.out.print(inorder.next() + " ");
      } // end while
      
      System.out.println(" Actual using InorderIterator\n---------------");
   } // end testInorder
   
   public static void testPreorder(AVLTree<Integer> tree, String answer)
   {
      System.out.println("\nTraversing tree preorder:");
      System.out.println(answer + "  Expected");
      
      Iterator<Integer> preorder = tree.getPreorderIterator();
      
      while (preorder.hasNext())
      {
         System.out.print(preorder.next() + " ");
      } // end while
      
      System.out.println(" Actual using PreorderIterator\n---------------");
   } // end testPreorder
   
   public static void testPostorder(AVLTree<Integer> tree, String answer)
   {
      System.out.println("\nTraversing tree postorder:");
      System.out.println(answer + "  Expected");
      
      Iterator<Integer> postorder = tree.getPostorderIterator();
      
      while (postorder.hasNext())
      {	
         System.out.print(postorder.next() + " ");
      } // end while
      
      System.out.println(" Actual using PostorderIterator\n---------------");
   } // end testPostorder 

   public static void testLevelOrder(AVLTree<Integer> tree, String answer)
   {
      System.out.println("\nTraversing tree level order:");
      System.out.println(answer + "  Expected");
      
      Iterator<Integer> levelOrder = tree.getLevelOrderIterator();
      
      while (levelOrder.hasNext())
      {
         System.out.print(levelOrder.next() + " ");
      } // end while
      
      System.out.println(" Actual using LevelOrderIterator\n---------------");
   } // end testLevelOrder
}  // end DriverAVL

