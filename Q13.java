import java.util.*;
public class Q13{
public static void main(String[] args) {
ArrayList<String> months= new ArrayList<String>();
months.add("Jan");
months.add("Feb");
months.add("Mar");
months.add("Apr");
months.add("May");
System.out.println(months);

ArrayList<String> months1= new ArrayList<String>();
months1.add("Jan");
months1.add("Feb");
months1.add("March");
months1.add("April");
System.out.println(months1);
ArrayList<String> check = new ArrayList<String>();
for (String e : months)
  check.add(months1.contains(e) ? "Yes" : "No");
System.out.println(check);
         
     }
}