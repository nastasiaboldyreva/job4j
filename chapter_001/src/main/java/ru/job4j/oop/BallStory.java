package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        WolfBall wolfball = new WolfBall();
        Fox fox = new Fox();

        ball.run(hare);
        hare.tryEat(ball);
        wolfball.tryEat(ball);
        fox.tryEat(ball);

    }
}
