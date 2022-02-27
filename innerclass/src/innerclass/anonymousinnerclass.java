package innerclass;
import java.util.*;
class demo{
	void show() {
		System.out.println("i'm in show method pf super class");
	}
}
public class anonymousinnerclass {
	static demo d = new demo() {
		void show() {
			super.show();
			System.out.println("iam in anonymous class");
		}
	};
	public static void main(String[] args) {
		d.show();
	}
	}
