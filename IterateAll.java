import java.util.*;

public class IterateAll{

public static void main(String[] args){

ArrayList<String> name = new ArrayList<String>();

name.add("A");
name.add("B");
name.add("C");
name.add("D");

for(String element : name){
System.out.println(element);
}
}
}