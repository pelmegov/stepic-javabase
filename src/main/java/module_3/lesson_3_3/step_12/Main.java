package module_3.lesson_3_3.step_12;

import com.sun.javafx.scene.traversal.Direction;

//    На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y. Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)
//
//    В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
//
//    Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
//
//    public class Robot {
//
//        public Direction getDirection() {
//            // текущее направление взгляда
//        }
//
//        public int getX() {
//            // текущая координата X
//        }
//
//        public int getY() {
//            // текущая координата Y
//        }
//
//        public void turnLeft() {
//            // повернуться на 90 градусов против часовой стрелки
//        }
//
//        public void turnRight() {
//            // повернуться на 90 градусов по часовой стрелке
//        }
//
//        public void stepForward() {
//            // шаг в направлении взгляда
//            // за один шаг робот изменяет одну свою координату на единицу
//        }
//    }
//
//    Direction, направление взгляда робота,  — это перечисление:
//
//    public enum Direction {
//        UP,
//        DOWN,
//        LEFT,
//        RIGHT
//    }
//
//    Пример
//
//    В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0, robot.getDirection() == Direction.UP
//
//    Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:
//
//    robot.turnRight();
//    robot.stepForward();
//    robot.stepForward();
//    robot.stepForward();
//
//    P.S. Если вам понравилось это задание, то вам может прийтись по душе игра Robocode, в которой надо написать алгоритм управления танком. Алгоритмы, написанные разными людьми, соревнуются между собой.

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
