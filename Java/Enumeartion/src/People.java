public enum People {
    Yash("Nice", "19"),
    Sala("Cute", "18"),
    DuaL("Singer", "23"),
    Zara("Beautiful", "18"),
    Natasha("iWish", "20");

    private final String desc;
    private final String birthday;

    People(String description, String year) {
        desc = description;
        birthday = year;
    }

    public String getDesc() {
        return desc;
    }

    public String getBirthday() {
        return birthday;
    }
}
