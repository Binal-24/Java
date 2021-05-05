import java.util.*;

public class Q21{

public static void main(String[] args){
ArrayList<String> name = new ArrayList<String>(3);
name.add("A");
name.add("B");
name.add("D");

System.out.println("Original Array List : "+ name);
String newname="C";
name.set(2, newname);

int num=name.size();
System.out.println("After Replacing the element : "+ name);

}
}