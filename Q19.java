import java.util.*;

public class Q19{

public static void main(String[] args){

ArrayList<String> name = new ArrayList<String>(3);
name.add("A");
name.add("B");
name.add("C");
name.add("D");
name.add("E");
name.add("F");
System.out.println("Original Array List : "+name);
name.trimToSize();
System.out.println("After Triming the size of array:"+name);
}
}