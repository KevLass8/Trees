 class Node
 {Node left;  // defines left as a node
  Node parent; // defines parent as a node
  int count; // defines count as a int
  Node right; // defines right as a node
String word; // defines string as a word  
  Node(String a) // in string a
  {
       this.left = null; // this/l is null
   this.word = a; // this word is equal to a
     this.count = 1; // counts by 1
   this.parent = null; // this parent is null
   this.right = null; //  this.right is null
  } }
 