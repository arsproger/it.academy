package module2.Task9;

import java.util.Scanner;

public class Book {
    private String autor;
    private String title;
    private int pageCount;
    private String giftedBy;
    private String pressmark;
    private boolean needsRepair;

    public Book(String autor, String title, int pageCount, String giftedBy, String pressmark, boolean needsRepair) {
        this.autor = autor;
        this.title = title;
        this.pageCount = pageCount;
        this.giftedBy = giftedBy;
        this.pressmark = pressmark;
        this.needsRepair = needsRepair;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print new pressmark:");
        String a = scanner.nextLine();
        this.pressmark = a;
        this.autor = autor;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print new pressmark:");
        String a = scanner.nextLine();
        this.pressmark = a;
        this.title = title;
    }

    public void setPageCount(int pageCount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print new pressmark:");
        String a = scanner.nextLine();
        this.pressmark = a;
        this.pageCount = pageCount;
    }

    public String getGiftedBy() {
        return giftedBy;
    }

    public void setGiftedBy(String giftedBy) {
        this.giftedBy = giftedBy;
    }

    public boolean getNeedsRepair() {
        return needsRepair;
    }

    public void setNeedsRepair(boolean needsRepair) {
        this.needsRepair = needsRepair;
    }
}
