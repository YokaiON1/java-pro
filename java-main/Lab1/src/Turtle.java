import java.util.Scanner;

public class Turtle {
    private int x;
    private int y;
    private int width;
    private int height;
    private char[][] field;

    public Turtle(int width, int height) {
        this.width = width;
        this.height = height;
        this.x = 0; 
        this.y = 0; 
        this.field = new char[height][width];

      
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                field[i][j] = '.'; 
            }
        }
        field[y][x] = 'T'; 
    }

    public void moveUp(int steps) {
        for (int i = 0; i < steps; i++) {
            if (y > 0) {
                field[y][x] = '*'; 
                y--;
                field[y][x] = 'T'; 
            }
        }
    }

    public void moveDown(int steps) {
        for (int i = 0; i < steps; i++) {
            if (y < height - 1) {
                field[y][x] = '*'; 
                y++;
                field[y][x] = 'T'; 
            }
        }
    }

    public void moveLeft(int steps) {
        for (int i = 0; i < steps; i++) {
            if (x > 0) {
                field[y][x] = '*';
                x--;
                field[y][x] = 'T'; 
            }
        }
    }

    public void moveRight(int steps) {
        for (int i = 0; i < steps; i++) {
            if (x < width - 1) {
                field[y][x] = '*'; 
                x++;
                field[y][x] = 'T'; 
            }
        }
    }

    public void printField() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Turtle turtle = new Turtle(10, 10);
        Scanner scanner = new Scanner(System.in);

        String command;
        while (true) {
            turtle.printField(); 
            System.out.print("Введите команду (up, down, left, right, exit): ");
            command = scanner.nextLine().trim().toLowerCase();

           
            String[] parts = command.split(" ");
            if (parts.length == 2) {
                String direction = parts[0];
                int steps;

                try {
                    steps = Integer.parseInt(parts[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Неверное количество шагов. Попробуйте снова.");
                    continue;
                }

                switch (direction) {
                    case "up":
                        turtle.moveUp(steps);
                        break;
                    case "down":
                        turtle.moveDown(steps);
                        break;
                    case "left":
                        turtle.moveLeft(steps);
                        break;
                    case "right":
                        turtle.moveRight(steps);
                        break;
                    case "exit":
                        System.out.println("Выход из программы.");
                        scanner.close();
                        return; 
                    default:
                        System.out.println("Неверная команда. Попробуйте снова.");
                }
            } else {
                System.out.println("Неверный формат команды. Используйте: direction steps.");
            }
        }
    }
}
