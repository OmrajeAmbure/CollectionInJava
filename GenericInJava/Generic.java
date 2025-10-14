package GenericInJava;

public class Generic<T> {
    T ob;
    Generic(T o){
        this.ob = o;
    }
    T getOb(){
        return this.ob;
    }
    void showType() {
        System.out.println("Type of T is " +
                ob.getClass().getName());
    }
    public static void main(String[] args) {
        Generic<Integer> obj1 = new Generic<Integer>(35);
        Generic<String> obj2 = new Generic<String>("omraje Ambure");
        Generic<Float> obj3 = new Generic<Float>(34.453f);
        obj1.showType();
        System.out.println(obj1.getOb());
        obj2.showType();
        System.out.println(obj2.getOb());
        obj3.showType();
        System.out.println(obj3.getOb());
    }
}
