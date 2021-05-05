import java.util.*;

public class RetrieveElement{

public static void main(String[] args){

ArrayList<String> name = new ArrayList<String>();

name.add("binal");
name.add("patel");
name.add("qwert");
name.add("mno");

System.out.println(name);

String element = name.get(0);
System.out.println("At 0 index :" + element);
}
}