package problem6;

import java.util.Hashtable;
import java.util.Scanner;
public class Car {
public static void main(String[]args) {
Scanner sc=new Scanner(System.in);
Hashtable <String,String> hm=new Hashtable<String,String>();
System.out.println("enter the product id and name:");
for(int i=0;i<3;i++)
{hm.put(sc.next(),sc.next());
System.out.println("the product list is:");
System.out.println(hm);
System.out.println("enter the product id to be removed:");
String Stringid=sc.next();
Object id = 1;
hm.remove(id);
System.out.println("item removed");
System.out.println("the product list is:");
System.out.println(hm.toString());
System.out.println("enter the product id to be searched:");
Stringid=sc.next();
Object sid = 1;
if(hm.containsKey(sid))
System.out.println(hm.get(sid));
else
System.out.println("do not exist");
}
}


}