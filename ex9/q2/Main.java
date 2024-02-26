public class Main {
    public static void main(String[] args) {
        Game footballGame = new Game(new Football());
        footballGame.play();

        // เปลี่ยนเกมเป็น basketball ได้ง่ายๆ โดยไม่ต้องสร้าง instance ใหม่
        Game basketballGame = new Game(new Basketball());
        basketballGame.play();
    }
}
