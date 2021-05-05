import java.util.*;

public class Q20{

public static void main(String[] args){

ArrayList<String> name = new ArrayList<String>(3);
name.add("A");
name.add("B");
name.add("C");

System.out.println("Original Array List : "+ name);
name.ensureCapacity(5);
name.add("D");
name.add("E");
System.out.println("After increasing size of array :"+ name);

}
}