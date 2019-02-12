package nought.and.crosses.play;

public class Player {
    private String name;
    private String sign;
    public Player(String name, String sign) {
        this.name = name;
        this.sign = sign;
    }

    public String getName() {
        return name;
    }

    public String getSign() {
        return sign;
    }

    public void setName(String name) {
        this.name = name;
    }
}
