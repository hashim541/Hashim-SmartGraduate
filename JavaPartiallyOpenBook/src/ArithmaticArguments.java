package javapartialyopenbook2;

public class ArithmaticArguments {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		char c=args[2].charAt(0);
		switch(c) {
		case '+':
			System.out.println("tne addition is :"+(a+b));
			break;
		case '-':
			System.out.println("tne addition is :"+(a-b));
			break;
		case '*':
			System.out.println("tne addition is :"+(a*b));
			break;
		case '/':
			System.out.println("tne addition is :"+(a/b));
			break;
		default:
			System.out.println("error:enter valid operator");
		}

	}

}
