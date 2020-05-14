package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    int EmpID;
    String name, address;
    public Employee(int EmpID, String name, String address) {
            this.EmpID = EmpID;
            this.name = name;
            this.address = address;
    }
    public String toString() {
           return this.EmpID + " " + this.name + " " + this.address;
          }
    }
    class Sortbyroll implements Comparator<Employee> {
         public int compare(Employee a, Employee b){
              return a.EmpID - b.EmpID;
         }
   }
   class Sortbyname implements Comparator<Employee> {
          public int compare(Employee a, Employee b) {
         return a.name.compareTo(b.name);
  }
}

public class ComparatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> Arr = new ArrayList<Employee>();
        Arr.add(new Employee(1011, "Rajesh", "Bangalore"));
        Arr.add(new Employee(1031, "Ralph", "Hyderabad"));
        Arr.add(new Employee(1201, "Karan", "Haryana"));
        System.out.println("Unsorted Data");
        for (int i=0; i<Arr.size(); i++)
              System.out.println(Arr.get(i));
              Collections.sort(Arr, new Sortbyroll());
              System.out.println("nSorted data according to Employee IDs");
              for (int i=0; i<Arr.size(); i++)
                    System.out.println(Arr.get(i));
                    Collections.sort(Arr, new Sortbyname());
                    System.out.println("nSorted data according to Employee name");
                    for (int i=0; i<Arr.size(); i++)
                            System.out.println(Arr.get(i));
  

	}

}
