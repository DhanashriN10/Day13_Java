package Generics;

public class Max_generic<E>
{
	E e1;
	E e2;
	E e3;
	
	public<T extends Comparable<T>> void findmaximum(T t1,T t2, T t3) {
		
		if(t1.compareTo(t2)>0 && t1.compareTo(t3)>0) {
			System.out.println("T1 is Maximum = "+t1);
		}else if(t2.compareTo(t1)>0 && t2.compareTo(t3)>0) {
			System.out.println("T2 is Maximum ="+t2);
		}
		else{
		System.out.println("T3 is Maximum = "+t3);
		}	
	}
	
	public static void main(String[] args) {
		
		Max_generic genericsClass= new Max_generic();
		genericsClass.findmaximum("Atharva","Dhanashri","Babita");
		genericsClass.findmaximum(19,910,60);
		genericsClass.findmaximum(10.2,80.2,219.10);
	}
}


