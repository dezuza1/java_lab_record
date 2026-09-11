class FinalizeDemo {

    FinalizeDemo() {
        System.out.println("Object Created");
    }

    @Override
    protected void finalize() {
        System.out.println("finalize() method called");
    }
}
class q7{
    public static void main(String[] args) {
        FinalizeDemo obj = new FinalizeDemo();

        obj = null;

        System.gc();
    }
}