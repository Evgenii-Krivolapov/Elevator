public class Elevator {
    int currentFloor = 1; // Текущий этаж
    int minFloor = -3;
    int maxFloor = 26;

    public Elevator(int minFloor, int maxFloor ) {
    }
    public void getCurrentFloor() {
        return;
    }
    public void moveUp() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }
    public void moveDown() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }
    public void move(int floor) {
        if (floor <= maxFloor || floor >= minFloor) {
            while (currentFloor != floor){
                if (currentFloor < floor){
                    moveDown();
                } else if (currentFloor > floor){
                    moveUp();
                }
                System.out.println("Этаж " + currentFloor);

            }
        } else if (floor > maxFloor || floor < minFloor) {
            System.out.println("Такого этажа нет");
        }
    }
}