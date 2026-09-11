class GarbageDemo {

    GarbageDemo() {
        System.out.println("Object Created");
    }

    @Override
    protected void finalize() {
        System.out.println("Object Destroyed");
    }
}
class q6{
    public static void main(String[] args) {
        GarbageDemo obj1 = new GarbageDemo();
        GarbageDemo obj2 = new GarbageDemo();

        obj1 = null;
        obj2 = null;

        System.gc();

        System.out.println("Garbage Collection Requested");
    }
}