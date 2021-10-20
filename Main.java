class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree();
    tree1.setTreeName("");
    tree1.setTreeType("");
    tree1.setLeavesFall(false);
    tree1.setLeafColor("");
    
    Tree tree2 = new Tree();
    tree2.setTreeName("maple");
    tree2.setTreeType("broadleaf");
    tree2.setLeavesFall(true);
    tree2.setLeafColor("red");

    tree1.print();
    tree2.print();

    tree1.setTreeName("spruce");
    tree1.setTreeType("conifer");

    tree1.print();
  }
}

//•	In your Main class in the main() method
//	declare and initialize a Tree object named tree1 using the default constructor
//Declare and initialize a second Tree object named tree2, using the second constructor with these parameters: maple, broadleaf, true, red.
//Call print() on tree1 and on tree2.
//Using the mutator methods you build, change tree1's name to spruce and type to conifer.//
//Call print() on tree1 again.


//This is a tree. It is a and its leaves are currently . It does not lose its leaves for the winter.
//This is a maple tree. It is a broadleaf and its leaves are currently red. It does lose its leaves for the winter.
//This is a spruce tree. It is a conifer and its leaves are currently . It does not lose its leaves for the winter.
