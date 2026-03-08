package arraylist;
		
		import java.util.ArrayList;
		import java.util.Iterator;

		public class ArrayListTask1 {

			//remove hello and world
		    public static void main(String[] args) {

		        ArrayList list = new ArrayList();

		        list.add(100);
		        list.add(100.50);
		        list.add("Hello");
		        list.add(true);
		        list.add("World");

		        Iterator it = list.iterator();

		        while (it.hasNext()) {
		            Object obj = it.next();

		            if (obj.equals("Hello") || obj.equals("World")) {
		                it.remove();
		            }
		        }

		        System.out.println(list);
		    }
	}
