package Training;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class collect {
	@SuppressWarnings("rawtypes")
	HashSet myhash = new HashSet();
	LinkedHashSet lin = new LinkedHashSet();
	TreeSet mytree = new TreeSet();
	ArrayList arr = new ArrayList();
	LinkedList link1 = new 	LinkedList();
	@SuppressWarnings("rawtypes")
	Set myset = myhash;
	Set myset2 = lin;
	Set myset3 = mytree;
	Integer myint = new Integer(100);
	    
	@SuppressWarnings("unchecked")
	public collect()
	{
		
	
		 myhash.add("chrome");
		 myhash.add("fb");
		 myhash.add("chro");
		 myhash.add("chr");
		 System.out.println(String.format("Hashset has %s", myhash.size()));
		 for(Object a : myhash)
		 {
			 System.out.println(a);
		 }
	  System.out.println(myhash.getClass().getTypeName());
	  System.out.println(lin.getClass().getTypeName());
	  System.out.println(mytree.getClass().getTypeName());
	  System.out.println(arr.getClass().getTypeName());
	  System.out.println(link1.getClass().getTypeName());
	}
}
