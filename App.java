import java.lang.reflect.Method; 
import java.lang.reflect.Field; 

public class App {
	private int y, x, z;
	
	public static void main(String[] args) {
		printBaseTypes("Ola");
		printBaseTypes(19);
		printBaseTypes('M');
		
		printMembers(new App());
		printMethods(new App());
		printFields(new App());
	}
    
    public static void printMembers(Object obj) {
		System.out.println("Members: ");
		printMethods(obj);
		printFields(obj);
		System.out.println();
	}
	
    public static void printMethods(Object obj) {
		System.out.print("Methods: ");
		for(Method m : obj.getClass().getDeclaredMethods()) System.out.print(m.getName() + " ");
		System.out.println();
	}
	
    public static void printFields(Object obj) {
		System.out.print("Fields: ");
		for(Field f : obj.getClass().getDeclaredFields()) System.out.print(f.getName() + " ");
		System.out.println();
	}
	
    public static void printBaseTypes(Object obj){
		
		Class c = obj.getClass();
		
		do{
			System.out.print(c.getName() + " ");
			printInterfaces(c);
			c = c.getSuperclass();
		}while( !(c instanceof Object) );
		System.out.println();
	}
	
    public static void printInterfaces(Class c) {
		for(Class i : c.getInterfaces()) System.out.print("(" + i.getName() + ") ");
		System.out.println(); 
	}
}