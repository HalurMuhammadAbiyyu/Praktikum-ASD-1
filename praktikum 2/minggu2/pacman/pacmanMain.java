package pacman;

public class pacmanMain {
    public static void main(String[] args) {
        pacman p1 = new pacman();
        p1.x = 3;
        p1.y = 5;
        p1.weidht = 10;
        p1.height = 10;
        p1.moveRigth();
        p1.moveUp();
        p1.printPosition();
    }
}
