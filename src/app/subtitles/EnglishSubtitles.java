package app.subtitles;

public enum EnglishSubtitles {


    LENGTH("Length"),
    DIAMETER("Diameter"),

    PICEA("Spruce"),
    PINUS("Pine"),
    LARIX("Larch"),
    FAGUS("Beech"),
    QUERCUS("Oak"),

    SUM_OF_M3("Sum of m3"),

    BTN_ADD("Add"),
    BTN_UNDO("Undo"),
    BTN_RESET("Reset"),

    NEGATIVE_VALUE_ERROR("Value below 0. Please enter positive number."),
    INCORRECT_TYPE_ERROR("Incorrect type. Please enter numbers.");



    private String name;

    EnglishSubtitles(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}