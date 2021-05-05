import java.util.*;

public class Q16{

public static void main(String[] args)
{
ArrayList<String> rno = new ArrayList<String>();

rno.add("1");
rno.add("2");
rno.add("3");
rno.add("4");
rno.add("5");
System.out.println(rno);
ArrayList<String> rnoclone = (ArrayList<String>)rno.clone();

System.out.println("Cloned Array List :"+rnoclone);
}
}