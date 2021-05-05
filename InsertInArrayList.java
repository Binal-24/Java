import java.util.*;

public class InsertInArrayList{

public static void main(String[] args){
ArrayList<String> name = new ArrayList<String>();

name.add("abc");
name.add("xyz");
name.add("mno");
System.out.println("Before Inserting Element");
System.out.println(name);
name.add(0, "qwert");
System.out.println("After Inserting Element");
System.out.println(name);
}
}
