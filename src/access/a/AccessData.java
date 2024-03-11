package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출 " + publicField);
    }   // publicMethod

    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defaultField);
    }   // defaultMethod

    private void privateMethod() {
        System.out.println("privateMethod 호출 " + privateField);
    }   // privateMethod

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;

        publicMethod();
        defaultMethod();
        privateMethod();
    }   // innerAccess
}   // class