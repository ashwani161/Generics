package GenericsProblems;

public class GenericsTestcases {
	public static void main(String[] args) {
		new GenericsTestcases().display("Test your code is working or not with Test cases");
	}
	public <E> void display(E element) {
		System.out.println(element);
	}

}
