import java.util.*;

public class RemoveThirdElement{

public static void main(String[] args)
{
ArrayList<String> name = new ArrayList<String>();

name.add("abc");
name.add("xyz");
name.add("mno");
name.add("asdf");
name.add("lhjg");
name.add("qwert");

System.out.println(name);

name.remove(2);
System.out.println("After removing : ");
System.out.println(name);
}
}