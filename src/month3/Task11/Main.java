package month3.Task11;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // ������� �����!
        BigDecimal bigDecimal = BigDecimal.TEN;
        BigDecimal bigDecimal2 = BigDecimal.ONE;
        BigDecimal result = bigDecimal.add(bigDecimal2); // �����
        System.out.println(result);
        result = bigDecimal.subtract(bigDecimal2); // ��������
        System.out.println(result);
        result = bigDecimal.multiply(bigDecimal2); // ������������
        System.out.println(result);
        result = bigDecimal.divide(bigDecimal2); // �������
        System.out.println(result);
        System.out.println(bigDecimal.compareTo(bigDecimal2)); // -1 / 0 / 1
        long money = 5187535103798727839L;
        BigDecimal myMoney = BigDecimal.valueOf(money);
        System.out.println(myMoney);
        BigDecimal big = myMoney.multiply(BigDecimal.valueOf(99999));
        System.out.println(big);

    }
}
