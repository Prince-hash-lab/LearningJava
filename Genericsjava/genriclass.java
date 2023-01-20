package Genericsjava;

// We use < > to specify Parameter type
class Test<T> {
    // An object of type T is declared
    T obj;
    Test(T obj) {
        this.obj = obj;
    } // constructor
    public T getObject() {
        return this.obj;
    }
}

public class genriclass {
    public static void main(String[] args) {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Test<String> sObj = new Test<String>("Prince_at_MSB");
        System.out.println(sObj.getObject());
    }
}
