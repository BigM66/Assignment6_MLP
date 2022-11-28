	/*
	 * @author Matthew Parsley
	 */

public class DepthFirstSearch {       
       Node root;
       
       int height = 0;
       int nodesTraversed = 0;

       /*
	  * gives instructions on what our code will do
	  */

       public DepthFirstSearch()
       {               
                   System.out.println("Call DFS with root node to do a Depth First Search.");
       }
       
	 /*
	  * creates our root for our tree
	  * @param the name of our node we want to create
	  */
       public void DFS(Node node) {
    	   height = 0;
    	   nodesTraversed = 0;
           DFS(node, 1);
       }
   
       /*
	  * travels our tree to see how many levels our tree has, and retrieves the children of the root
	  * @param the node we want it to search
	  * @param the level of the tree that we are on
	  */
        public void DFS(Node node, int level) {
                System.out.println(node.getData()); 
                
                if (height < level) height = level;
                nodesTraversed++;
                
                if(node.getlChild() != null)
                	DFS(node.getlChild(), level + 1);
                
                if(node.getrChild() != null)
                	DFS(node.getrChild(), level + 1);
                 

        }
        
        

}