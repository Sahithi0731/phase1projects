package innerclass;
class outer{
	void outerMethod() {
		System.out.println("inside outerMethod");
		class inner{
			void innerMethod() {
				System.out.println("inside innerMethod");
			}
		}
		inner y = new inner();
		y.innerMethod();
	}
}
public class methodlocalinnerclass {
	public static void main(String[] args) {
		outer x = new outer();
		x.outerMethod();
	}

}
