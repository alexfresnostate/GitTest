import java.util.ArrayList;


public class Print {

	Print() {};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello hello = new Hello();
		World world = new World();
		ArrayList<IPrint> array = new ArrayList<IPrint>();
		array.add(hello);
		array.add(world);
		
		for (IPrint a : array) {
            a.test();
        }
	}

}
