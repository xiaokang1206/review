package anonymity;

public class JumpDemo {
    public static void main(String[] args) {

        new Jumping(){
            public void jump() {
                System.out.println("跳高");
            }
        }.jump();



    }
}
