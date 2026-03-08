package advancedJava;

class Employee{
	
	int netWorth;
	String name;
	
	public Employee() {
		
	}
	
	public Employee(int netWorth, String name) {
		this.netWorth = netWorth;
		this.name = name;
	}
	
}

public class Solution{
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(1000,"Aman");
		Employee e2=new Employee(10000,"Rohan");
		Employee e3=new Employee(1000,"Rajesh");
		
		
		Employee arr[]= {e1,e2,e3};
		
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j].netWorth > arr[j + 1].netWorth) {
                    swap(arr, j, j + 1);
                }
                
                
                // same netWorth compare names
                else if (arr[j].netWorth == arr[j + 1].netWorth) {
                    if (arr[j].name.compareTo(arr[j + 1].name) > 0) {
                        swap(arr, j, j + 1);
                    }
                }
            }
        }

        for (Employee e : arr) {
            System.out.println(e.netWorth + " " + e.name);
        }
    }

    public static void swap(Employee[] arr, int i, int j) {
        Employee temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
