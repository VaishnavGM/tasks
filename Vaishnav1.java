import java.util.Scanner;

class Vaishnav {
    static int a;
    static int b;
    int c = 5;
    int d = 10;
}

class Raja {
    static int e = 10;
    int f = 20;
    int z = e+f;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first static value: ");
        Vaishnav.a = sc.nextInt();

        System.out.println("Enter the second static value: ");
        Vaishnav.b = sc.nextInt();

        int j = Vaishnav.a + Vaishnav.b;
        System.out.println("The sum of two static values is "+j);

        int k = j + Raja.e;
        System.out.println("The sum of all static values is " +k);

        Vaishnav obj = new Vaishnav();
        System.out.println("The value of instance variable c is " +obj.c);

        Vaishnav obj1 = new Vaishnav();
        System.out.println("The value of instance variable d is " +obj1.d);

        Raja obj2 = new Raja();
        System.out.println("The value of instance variable f is " +obj2.f);

        int m = obj.c + obj.d + obj2.f;
        System.out.println("The sum of all instance variables is " +m);

        int r = k - m;
        System.out.println("The sum of all static values - instance values is " +r);
    }
}
