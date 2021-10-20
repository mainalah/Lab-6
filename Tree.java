class Tree {

  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree(){
    treeName = "";
    treeType = "";
    leavesFall= false;
    leafColor="";
  }

  Tree(String aTreeName, String aTreeType, boolean aLeavesFall,String aLeafColor){
    treeName = aTreeName;
    treeType = aTreeType;
    leavesFall = aLeavesFall;
    leafColor = aLeafColor;
  }
  
  String getTreeName() {
    return treeName;
  }

  String getTreeType() {
    return treeType;
  }

  boolean getLeavesFall() {
    return leavesFall;
  }

  String getLeafColor() {
    return leafColor;

  }
  void setTreeName(String aTreeName) {
     treeName= aTreeName;
  }

  void setTreeType(String aTreeType) {
    treeType = aTreeType;
  }

  void setLeavesFall(boolean aLeavesFall) {
    leavesFall =  aLeavesFall;
  }
  
  void setLeafColor(String aLeafColor) {
    leafColor = aLeafColor;
  }
  
  void does(){
    leavesFall= true;}

  void doesNot(){
    leavesFall= false;}
  
  void print() {
  String leavesFall  ="does not";
  if (getLeavesFall() == true){
  leavesFall= "does";
  }
   else {leavesFall= "does not";
  }
  System.out.println("This is a " + treeName + " tree."+ " It is a " + treeType + " and its leaves are currently " + leafColor +"." + " It " + leavesFall + " lose its leaves for the winter.");
  }
}


