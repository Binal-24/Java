import java.util.*;

public class Q14{

public static void main(String[] args)
{

ArrayList<String> name = new ArrayList<String>();

name.add("A");
name.add("B");
name.add("C");
name.add("D");

System.out.println("Before Swapping : "+ name);

Collections.swap(name,1,2);
System.out.println("After Swapping :"+ name);

}
}