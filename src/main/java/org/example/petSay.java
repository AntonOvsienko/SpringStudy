package org.example;

public enum petSay {
    DOG("Гав-гав"),
    CAT("Мяу-мяу"),
    BIRD("Чик-чирик");

    private String say;

    petSay(String say) {
        this.say=say;
    }

    public String getSay() {
        return say;
    }
}
