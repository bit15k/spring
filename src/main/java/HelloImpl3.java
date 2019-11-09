public class HelloImpl3 implements HelloAPI {
    private String message;
    private int index;
    public HelloImpl3(String message,int index){
        this.message = message;
        this.index = index;
    }
    public void sayHello() {
        System.out.println(index + ":" + message);
    }
}
