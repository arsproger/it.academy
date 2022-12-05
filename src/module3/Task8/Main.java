package module3.Task8;

public class Main {
    public static void main(String[] args) {
        Season season = new Season();
        SEASONS likeSeason = SEASONS.ВЕСНА;

        Season.enums(likeSeason);

        SEASONS[] seasons = {SEASONS.ВЕСНА, SEASONS.ЗИМА, SEASONS.ЛЕТО, SEASONS.ОСЕНЬ};
        for(SEASONS seasonsss : seasons) {
            System.out.println(seasonsss + ": средняя температура: " + seasonsss.avgTemperature + " это: " + seasonsss.info);
        }
    }
}
