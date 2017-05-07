public class Trees
{ 
 Node tree;//Constructor for Trees 
 public Trees() 
 {
  this.tree = null; }  // sets tree to null
 public boolean empty()
 {
  return this.tree == null;// returns the tree to null
 }
 //this adds a method
 public void insert(String a)
 {
  a = a.toLowerCase(); // sets ll a to lowecase
  Node newNode = new Node(a); // makes te node a a new node
  this.insert(this.tree, newNode); // insert function for this tree into the node
 }

 public void print()  
 { print(this.tree); // prints out this tree
 }
 public void print(Node n) 
 {
  if(n != null) // if n isnot null
  { this.print(n.left); // prints left
   System.out.println(n.word + " " + n.count);
   this.print(n.right); // prints right
  }
 }
 public void insert(Node a, Node n)
 {
  if(empty()) // if it's empty
  {
   this.tree = n; // the tree equals n
  }
  else if(n.word.compareTo(a.word) == 0)
  {
   a.count++;
  }
  else if(n.word.compareTo(a.word) < 0)
  {
   if(a.left == null)
   {
    a.left = n; // a left is n
    n.parent = a; // n's parent is a
   }
   else
   {  this.insert(a.left, n); // insert funcion n into a.left
   }
  }
  else
  {
   if(a.right == null) // is a/right is null
   {  a.right = n; // a right is equal to n
    n.parent = a; // the parent is a
   }
   else
   {
    this.insert(a.right, n); // or else, insert function n into a.right
   }
  }
 }
 
 //Method to find a node
 public String search(String a) // searches for a string
 {
  Node f = tree; // the node f is "tree"
  while(f != null) // while f doesn't equal null
  {
   if(f.word.compareTo(a) == 0) //if f is there
   {
    return f.word + " was found"; // return the word and if it was found
   }
   else if(f.word.compareTo(a) > 0) // if the word is greater than 1
   {
    f = f.left; // f is the left
   }
   else
   {
    f = f.right; // or else, f is the righ
   } }
  return "null"; // return nulll if it isn't
 }
}
