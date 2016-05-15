package module_3.lesson_3_3.step_12;

import com.sun.javafx.scene.traversal.Direction;

class Robot {
    private int x = 0;
    private int y = 0;
    private Direction direction = Direction.UP;

    Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    Direction getDirection() {
        return direction;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void turnLeft() {
        switch (getDirection()) {
            default:
            case DOWN:
                direction = Direction.LEFT;
                break;
            case UP:
                direction = Direction.LEFT;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
            case LEFT:
                direction = Direction.DOWN;
        }
    }

    void turnRight() {
        switch (getDirection()) {
            default:
            case DOWN:
                direction = Direction.LEFT;
                break;
            case UP:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
            case LEFT:
                direction = Direction.UP;
        }
    }

    void stepForward() {
        switch (getDirection()) {
            default:
            case RIGHT:
                x++;
                break;
            case LEFT:
                x--;
                break;
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
        }
    }
}