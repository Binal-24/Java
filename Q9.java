import java.util.*;

public class Q9{

public static void main(String[] args){

ArrayList<String> months = new ArrayList<String>();
ArrayList<String> copymonths = new ArrayList<String>();
months.add("Jan");
months.add("Feb");
months.add("Mar");
months.add("Apr");

copymonths.add("May");
copymonths.add("Jun");
copymonths.add("Jul");
copymonths.add("Aug");
Collections.copy(copymonths, months);
System.out.println(months);
System.out.println("Copied Array List:");
System.out.println(copymonths);
}
}