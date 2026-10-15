public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operator
        int a = 10;
        int b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //Relational Operator
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);



        //TypeCasting
        //Implicit typecasting
        int p = 1000;
        long l = p;
        System.out.println(l);

        //Explicit typecasting
        long i = 20000;
        int j = (int) i;
        System.out.println(j);

        // increment and decrement
        // Prefix Notation
        int r = 5;
        int s = ++r; // 'r' becomes 6, then its value is assigned to 's'
        System.out.println(r); // Output: 6
        System.out.println(s); // Output: 6

        //Postfix Notation (x++, x--)
        int x = 5;
        int y = x++; // 'y' gets the current value (5), then 'x' increments to 6
        System.out.println(x); // Output: 6
        System.out.println(y); // Output: 5

        //Logical Operator
        boolean c = true;
        boolean d = false;

        //NOT
        System.out.println(!c);
        System.out.println(!d);
        //AND
        System.out.println(c && d);
        //OR
        System.out.println(c || d);

        //Ternary Operator
        int e = 5; //20
        String ans = e % 2 == 0? "Even": "Odd";
        System.out.println(ans); //Even








    }
}
