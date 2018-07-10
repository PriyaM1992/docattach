package pages;

public class Test {

    static float i;
    int k = 70;
  // Test a = new Test();
            public static void main (String[] args) {
                Test a = new Test();
                System.out.println(Test.i);
                System.out.println(a.i);
                System.out.println(i);
                a.Test1();
            }
        public void Test1 () {
            Test a = new Test();
           int j=10;
        System.out.println("inst" + Test.i);
            System.out.println(a.i);
            System.out.println(j);

            }}

