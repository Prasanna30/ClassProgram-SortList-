package CollectionsPrograms;



import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

class Kids
{
	int Id, rank ;
	String name, activity ,address;
	public Kids() {
		
	}
	
	public Kids(int Id, String name ,String activity,int rank, String address) 
	{
		this.name=name;
		this.Id=Id;
		this.activity=activity;
		this.rank=rank;
		this.address= address;
	}
	
	public String toString()
	{
       return this.Id + " " + this.name + " " + this.activity + " " +this.rank + " " + this.address;
    }
	

	class Sortbyroll implements Comparator<Kids>{
		public int compare(Kids a, Kids b) {
				return a.Id - b.Id ;
		}
	}
	
	class Sortbyname implements Comparator<Kids>{
		public int compare(Kids a, Kids b) {
			return a.name.compareTo(b.name); // in Comparator we can use more compareTo() to convert int to string
		}
		
	}
	
	class Sortbyactivity implements Comparator<Kids>{
		public int compare(Kids a, Kids b) {
			return a.activity.compareTo(b.activity);// using another compareTo() to convert int to string
		}
		
	}
	
	class Sortbyrank implements Comparator<Kids>{
		public int compare(Kids a,Kids b) {
			return a.rank - b.rank ;
		}
	}
		
	/**class Sortbyaddress implements Comparator<Kids>{
		public int compare(Kids a, Kids b) {
			return a.address.compareTo(b.address);// using another compareTo() to convert int to string
		}
		
	}**/
	
}


public class KidsComparator {

	public static void main(String args[])
	{
		
		ArrayList<Kids> Arr = new ArrayList<Kids>();
		
		Arr.add(new Kids(203,"Mary", "Singing", 5 ,"MaryLand"));
		Arr.add(new Kids(498,"Cici", "Cricket", 3, "Washington"));
		Arr.add(new Kids(387,"Pinky", "Tennis", 2, "virginia"));
		Arr.add(new Kids(123,"John", "Chess", 4,"California"));
		Arr.add(new Kids(102,"Sania", "Dancing", 1, "New Mexico"));
		
		System.out.println("Unsorted Data");
		
		for(int i=0; i<Arr.size(); i++)
		{
			System.out.println(Arr.get(i));
			Collections.sort(Arr, new Kids().new Sortbyroll());
			
			System.out.println("The Sorted data according to Ids");
		}

		for(int i=0; i<Arr.size(); i++)
		{
			System.out.println(Arr.get(i));
			Collections.sort(Arr,new Kids().new Sortbyname());
			
			System.out.println("The Sorted data according to Names");
		}
		/**for(int i=0; i<Arr.size(); i++)
		{
			System.out.println(Arr.get(i));
			Collections.sort(Arr, new Sortbyactivity());
			
			System.out.println("The Sorted data according to Activitys");
		}
		
		for(int i=0; i<Arr.size(); i++)
		{
			System.out.println(Arr.get(i));
			Collections.sort(Arr, new Sortbyrank());
			
			System.out.println("The Sorted data according to Ranks");
		}**/
		
		for(int i=0; i<Arr.size(); i++)
		{
			System.out.println(Arr.get(i));
		}
			
	}
}