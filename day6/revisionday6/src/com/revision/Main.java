package com.revision;
import java.util.*;
public class Main {
	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

	public static void main(String[] args) {
		HashMap<String, Student> hm = new HashMap<>();
		
		hm.put("Andhra pradesh", new Student(3, "Mayuri", 940));
		hm.put("Andhra pradesh", new Student(2, "Chakri", 950));
		hm.put("Maharastra",new Student(10,"Ganesh",950));
		hm.put("Tamilnadu",new Student(12,"Surya",850));
		hm.put("Telangana",new Student(15,"Venkat",920));
		hm.put("Haryana",new Student(16,"Dinesh",910));
		hm.put("Kerala",new Student(18,"Srinu",880));
		
		
		
		Set<Map.Entry<String, Student>> set =  hm.entrySet();
		List<Integer> li1 = new ArrayList<Integer>();
		for(Map.Entry<String, Student> me: set) {
			li1.add(me.getValue().getMarks());
			Collections.sort(li1);
			
		}
		System.out.println(li1);
				
	}
}
