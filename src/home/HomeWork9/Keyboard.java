package home.HomeWork9;

public class Keyboard {
    private String[] layoutKeyboard = {"Qwerty", "Azerty", "Colemak"};
    private boolean backlight;
    private boolean additionalDigits;

    public Keyboard(boolean backlight, boolean additionalDigits) {
        this.backlight = backlight;
        this.additionalDigits = additionalDigits;
    }

    public String[] getLayoutKeyboard() {
        return layoutKeyboard;
    }

    public void setLayoutKeyboard(String[] layoutKeyboard) {
        this.layoutKeyboard = layoutKeyboard;
    }

    public boolean isBacklight() {
        return backlight;
    }

    public void setBacklight(boolean backlight) {
        this.backlight = backlight;
    }

    public boolean isAdditionalDigits() {
        return additionalDigits;
    }

    public void setAdditionalDigits(boolean additionalDigits) {
        this.additionalDigits = additionalDigits;
    }
}
