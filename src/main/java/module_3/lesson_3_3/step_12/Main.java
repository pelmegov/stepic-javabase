package module_3.lesson_3_3.step_12;

import com.sun.javafx.scene.traversal.Direction;

/**
 * @author modkomi
 * @since 15.05.16
 */

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot(-10, -2, Direction.UP);

        moveRobot(robot, 3, 5);

    }

    private static void moveRobot(Robot robot, int toX, int toY) {

        int tX = robot.getX();
        int tY = robot.getY();

        System.out.println("Начальная позиция " + robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());


        if (tX >= toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (tX != toX) {
                robot.stepForward();
                System.out.println("tX >= toX " + robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
                tX--;
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (tX != toX) {
                robot.stepForward();
                System.out.println("tX <= toX " + robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
                tX++;
            }
        }

        if (tY >= toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (tY != toY) {
                robot.stepForward();
                System.out.println("tY >= toY " + robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
                tY--;
            }

        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (tY != toY) {
                robot.stepForward();
                System.out.println("tY <= toY " + robot.getX() + " " + robot.getY() + ". Направление взгляда: " + robot.getDirection());
                tY++;
            }

        }

    }

}
