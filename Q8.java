import java.util.*;
public class Q8{

public static void main(String[] args)
{

ArrayList<String> months = new ArrayList<String>();
months.add("Jan");
months.add("Feb");
months.add("Mar");
months.add("Apr");

Collections.sort(months);
System.out.println("Sorted ArrayList : "+ months);

}
}