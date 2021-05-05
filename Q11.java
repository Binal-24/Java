import java.util.*;

public class Q11{
public static void main(String[] args){

ArrayList<String> months = new ArrayList<String>();

months.add("Jan");
months.add("Feb");
months.add("Mar");
months.add("Apr");

System.out.println("Original List : "+ months);
Collections.reverse(months);
System.out.println("Reversed List : "+ months);
}
}