
public class GenericNodeApplication {
  public static void main(String[] args) {
    GenericNode<Student> s1 = new GenericNode<Student>(new Student("Tom Jones" , "IT") , null); 
		GenericNode<Student> s2 = new GenericNode<Student>(new Student("Sara Dian" , "CS") , null); 
		GenericNode<Student> s3 = new GenericNode<Student>(new Student("Nina Tran" , "CS") , null); 
		GenericNode<Student> s4 = new GenericNode<Student>(new Student("Ye James" , "IT") , null); 
		s1.setNext(s2); 
		s2.setNext(s3); 
		s3.setNext(s4); 
		GenericNode<Student> s = s1;

    do {
      System.out.println(s.getData());
    } while ((s = s.getNext()) != null);
    GenericNode<Student> clone = s1.clone();
		System.out.println("\nClone Object: " + s1.getData());
  }
}