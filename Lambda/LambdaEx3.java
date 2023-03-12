@FunctionalInterface
interface MyFunction{
    void myMethod();
}

class LambdaEx2{
    public static void main(String[] args){
        MyFunction f = () -> {}; // Myfunction f = (Myfunction) (()->{}); 과같음
        Object obj = (MyFunction)(() -> {});
        String str = ((Object)(MyFunction)(() -> {})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        //System.out.println(() -> {}); 람다는 오브젝트타입으로 형변환되지않음
        System.out.println((MyFunction)(() -> {}));
        System.out.println(((Object)(MyFunction)(() -> {})).toString());
    }
}