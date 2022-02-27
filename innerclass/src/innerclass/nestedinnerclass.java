package innerclass;

class outer_demo{
	int num;

private class Inner_demo {
	public void print() {
		System.out.println("This is an inner class");
	}
}
void display_inner() {
	Inner_demo inner = new Inner_demo();
	inner.print();}
}
public class nestedinnerclass{
	public static void main(String args[]) {
		outer_demo outer = new outer_demo();
		outer.display_inner();
	}
}
