package a;
public class Entity {
    /**
     * Example for Logical and Communicational Cohesion
     */

    // Kommunikationsbindung: Die Datenstruktur, auf der alle Methoden operieren
    private int x_position = 0;
    private int y_position = 0;

    // Getters for the private fields
    public int getX() {
        return x_position;
    }

    public int getY() {
        return y_position;
    }

    // Move entity to a new position, modifying both coordinates
    public void moveTo(int x, int y) {
        this.x_position = x;
        this.y_position = y;
    }

    // Increase single coordinate by 1
    public void increaseX() {
        this.x_position++;
    }

    public void increaseY() {
        this.y_position++;
    }

    // Check if coordinates are at origin, different functionality but same data
    public boolean isAtOrigin() {
        return this.x_position == 0 && this.y_position == 0;
    }

    public static void main(String[] args) {
        Entity player = new Entity();
        player.moveTo(10, 20);
        player.increaseX();
        System.out.println("New X: " + player.getX());
        System.out.println("Is at origin: " + player.isAtOrigin());
    }
}