import java.util.*;

public class Q12{
public static void main(String[] args){

ArrayList<String> months = new ArrayList<String>();

months.add("Jan");
months.add("Feb");
months.add("Mar");
months.add("Apr");

System.out.println("Original List : "+ months);
List<String> newmonths = months.subList(1,3);
System.out.println("Extracted Portion of original list :"+ newmonths);
}
}