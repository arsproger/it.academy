package month3.Task7;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(7);
        Drum drum = new Drum(70d);
        Pipe pipe = new Pipe(30d);
        MusicTools[] tools = {guitar, drum, pipe};
        for(MusicTools tool : tools) {
            tool.play();
        }
    }
}
