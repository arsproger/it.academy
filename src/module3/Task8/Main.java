package module3.Task8;

public class Main {
    public static void main(String[] args) {
        Season season = new Season();
        SEASONS likeSeason = SEASONS.�����;

        Season.enums(likeSeason);

        SEASONS[] seasons = {SEASONS.�����, SEASONS.����, SEASONS.����, SEASONS.�����};
        for(SEASONS seasonsss : seasons) {
            System.out.println(seasonsss + ": ������� �����������: " + seasonsss.avgTemperature + " ���: " + seasonsss.info);
        }
    }
}
