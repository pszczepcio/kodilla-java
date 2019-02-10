package nought.and.crosses.play;

public class Players {
    private String name;
    private String sign;
    public Players(String name, String sign) {
        this.name = name;
        this.sign = sign;
    }

    public String getName() {
        return name;
    }

    public String getSign() {
        return sign;
    }
}
