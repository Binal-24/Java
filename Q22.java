import java.util.*;

public class Q22{
public static void main(String[] args){
ArrayList<String> name = new ArrayList<String>();
name.add("A");
name.add("B");
name.add("C");
name.add("D");
name.add("E");

System.out.println("Original Array List : "+ name);
int indexno= name.size();
System.out.println("Accessing element using index : ");
for(int i=0; i<indexno;i++){
System.out.println(name.get(i));
}

}
}

