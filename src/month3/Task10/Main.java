package month3.Task10;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        long a = System.currentTimeMillis(); // � 1 ������ 1970 ����
        System.out.println(localDateTime);
    }

}
