
public class MyMainAVLTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createAVLTree();
		
	}
	
	public static AVLTree<Integer> createAVLTree() {
		AVLTree<Integer> aTree = new AVLTree<>();
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
      }

}
