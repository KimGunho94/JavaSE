package day11.pattern;

/*
 * 디자인패턴
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		Singleton sigleton = Singleton.getInstance();
		Singleton sigleton2 = Singleton.getInstance();
		Singleton sigleton3 = Singleton.getInstance();
		
		Factory factory = Factory.getInstance();
		Factory factory2 = Factory.getInstance();
		Factory factory3 = Factory.getInstance();
		
		System.out.println(System.identityHashCode(sigleton));
		System.out.println(System.identityHashCode(sigleton2));
		System.out.println(System.identityHashCode(sigleton3));
		
		System.out.println(System.identityHashCode(factory));
		System.out.println(System.identityHashCode(factory2));
		System.out.println(System.identityHashCode(factory3));
		
		
		
		
	}

}
