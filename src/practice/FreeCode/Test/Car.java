package practice.FreeCode.Test;

public class Car {
    private int year;
    private String color, model;

           public int getYear() {
                return year;
            }
            public void setYear(int year) {
                 this.year = year;
            }
            public String getColor() {
                 return color;
            }
            public void setColor(String color) {
                this.color = color;
            }
            public String getModel() {
                 return model;
            }
            public void setModel(String model) {
                this.model = model;
            }

            public void info() {
                System.out.println("��� ����������!");
            }
            public int yearDifference(int yearAuto) {
               int res = yearAuto - year;
               return res;
            }
    }
