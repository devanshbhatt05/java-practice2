public class Calculator{
    public static void main(String[] args) {
        
        int n1= 10;
        int n2 =5;
        int n3= 15;

        calci cal = new calci();
        int a =cal.add(n1, n2);
        int b = cal.sub(n1, n2);
        int c =cal.mul(n1, n2);
        int d = cal.div(n1, n2);
        int e = cal.add(n1, n2, n3);

        System.out.println(e);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}