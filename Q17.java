import java.util.*;


public class Q17{

public static void main(String[] args){

ArrayList<String> rno = new ArrayList<String>();

rno.add("1");
rno.add("2");
rno.add("3");
rno.add("4");
rno.add("5");
System.out.println(rno);
System.out.println("Original ArrayList : "+ rno);
rno.removeAll(rno);
System.out.println("After removing :"+ rno);
}
}