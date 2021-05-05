import java.util.*;

public class Q10{

public static void main(String[] args)
{
ArrayList<String> months = new ArrayList<String>();

months.add("Jan");
months.add("Feb");
months.add("Mar");
months.add("Apr");
System.out.println("Before Shuffling : "+months);
Collections.shuffle(months);
System.out.println("After Shuffling : "+months);

}
}