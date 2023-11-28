public class RAM {
    private String type;
    private String manufacturingCompany;
    private float capacity;
    private float clockSpeed;
    public RAM(){}
    public RAM(String type , float capacity , float clockSpeed , String manufacturingCompany) {
        this.type = type;
        this . capacity = capacity;
        this.clockSpeed = clockSpeed;
        this.manufacturingCompany = manufacturingCompany;
    }
}
