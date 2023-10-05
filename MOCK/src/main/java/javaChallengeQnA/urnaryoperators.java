package testing;

public class urnaryoperators {
	    public static void main(String[] args) {
	        int expr = 10;
	        
	        // Postfix increment and decrement operators
	        System.out.println("Postfix Increment: expr++ = " + (expr++)); // Print and then increment
	        System.out.println("expr after postfix increment: " + expr);

	        expr = 10; // Reset expr to 10
	        
	        System.out.println("Postfix Decrement: expr-- = " + (expr--)); // Print and then decrement
	        System.out.println("expr after postfix decrement: " + expr);

	        expr = 10; // Reset expr to 10

	        // Prefix increment and decrement operators
	        System.out.println("Prefix Increment: ++expr = " + (++expr)); // Increment and then print
	        System.out.println("expr after prefix increment: " + expr);

	        expr = 10; // Reset expr to 10

	        System.out.println("Prefix Decrement: --expr = " + (--expr)); // Decrement and then print
	        System.out.println("expr after prefix decrement: " + expr);

	        expr = 10; // Reset expr to 10

	        // Other unary operators
	        System.out.println("Unary Plus: +expr = " + (+expr)); // Unary plus, no change in value
	        System.out.println("Unary Minus: -expr = " + (-expr)); // Unary minus, negation

	        // Bitwise NOT (~)
	        int bitwiseExpr = 5; // Binary representation: 0000 0101
	        System.out.println("Bitwise NOT: ~bitwiseExpr = " + (~bitwiseExpr)); // Binary representation: 1111 1010

	        // Logical NOT (!)
	        boolean boolExpr = true;
	        System.out.println("Logical NOT: !boolExpr = " + (!boolExpr)); // Negation of boolean value

	    }
}
