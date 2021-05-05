import java.util.*;

public class UpdateElementArrayList{

public static void main(String[] args){

ArrayList<String> months = new ArrayList<String>();

months.add("Jan");
months.add("Feb");
months.add("Mar");
months.add("Apr");
months.add("Dec");

System.out.println(months);
months.set(4, "May");
System.out.println("Updated Element : ");

System.out.println(months);
}

}