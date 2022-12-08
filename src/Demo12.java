
public class Demo12 {

	public static void main(String[] args) {
		String name="sumit";
		String temp=" ";
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
			temp= temp+name.charAt(i);
		}

	}

}
