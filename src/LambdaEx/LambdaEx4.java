package LambdaEx;

@FunctionalInterface
interface MyFunction2{
    void myMethod();
}

class Outer{
    int val = 10; //LambdaEx.Outer.this.val

    class Inner{
        int val = 20; //this.val

        void method(int i){
            int val = 30; //final int val = 30;

            MyFunction2 f = () -> {
                System.out.println("            i:" + i);
                System.out.println("          val:" + val);
                System.out.println("     this.val:" + ++this.val);
                System.out.println("LambdaEx.Outer.this.val:" + ++Outer.this.val);
            };

            f.myMethod();
        }
    }
}

class LambdaEx4{
    public static void main(String args[]){
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method(100);
    }
}