package Collectionspackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class Checklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list = new ArrayList();
ArrayList list2 = new ArrayList();
list.add("a");
list.add("b");
list.add("b");
list.add("c");
list.add("c");
list.add("c");
System.out.println(list);

//list2.add(1);
Set<String> set=new HashSet<String>();
Set set2=new HashSet();
set.add("a");
set.add("a");
set2.add(1);
System.out.println(set);
System.out.println(set2);
System.out.println(set+""+set2);//both the variables to be printed together
//Map<key,value>
//Student1:Roll1,Student2:Roll2....(unique value)
Map<String, Integer> 
hm=new HashMap<String, Integer>();
//name cannot be duplicate
//inserting pairs in above Map
//using put()method
hm.put("a",10);
hm.put("b",20);
hm.put("c", 30);
hm.put("d", 40);
hm.put("e", 20);
hm.put("a", 20);//duplicate values not accepted
hm.get("a");//get method helps to get the value from a key
System.out.println(hm);//duplicate keys are allowed but duplicate values are not allowed.

	}
	}


