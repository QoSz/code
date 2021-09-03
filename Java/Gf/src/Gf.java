public class Gf {
    private String girlName;

    public Gf(String girlName) {
        this.girlName = girlName;
    }

    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }

    public String getGirlName() {
        return girlName;
    }

    public void saying() {
        System.out.printf("Your first gf was %s \n", getGirlName());
    }
}
