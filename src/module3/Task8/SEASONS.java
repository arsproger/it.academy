package module3.Task8;

public enum SEASONS {
    ����(-30, "�������� ����� ����"), �����(15, "������ ����� ����"),
    ����(35, "������ ����� ����"), �����(10, "���������� ����� ����");

    double avgTemperature;
    String info;
    SEASONS(double avgTemperature, String info) {
        this.avgTemperature = avgTemperature;
        this.info = info;
    }
}
