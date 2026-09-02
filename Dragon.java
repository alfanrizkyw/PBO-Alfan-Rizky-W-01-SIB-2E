public class Dragon {
    private int x;
    private int y;
    private int direction;

    public Dragon() {
        this.x = 0;
        this.y = 0;
        this.direction = 1;
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            this.direction = newDirection;
        }
    }

    public void move(int steps) {
        switch (this.direction) {
            case 1:
                this.y += steps;
                break;
            case 2:
                this.x += steps;
                break;
            case 3:
                this.y -= steps;
                break;
            case 4:
                this.x -= steps;
                break;
        }
    }

    public void printStatus() {
        System.out.println("Koordinat: (" + this.x + ", " + this.y + ") | Arah: " + this.direction);
    }
}