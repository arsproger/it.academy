package practice.OOP.Task5;

public enum Season {
    AUTUMN(10), SPRING(20), SUMMER(35), WINTER(-20);
    int tempereture;
    Season(int tempereture) {
        this.tempereture = tempereture;
    }
}
