import java.util.*;

public class Q15{

public static void main(String[] args){

ArrayList<String> name = new ArrayList<String>();

name.add("A");
name.add("B");
name.add("C");
name.add("D");
name.add("E");

System.out.println(name);

ArrayList<String> rno = new ArrayList<String>();

rno.add("1");
rno.add("2");
rno.add("3");
rno.add("4");
rno.add("5");
System.out.println(rno);

ArrayList<String> newlist = new ArrayList<String>();

newlist.addAll(name);
newlist.addAll(rno);

System.out.println(newlist);


}
}