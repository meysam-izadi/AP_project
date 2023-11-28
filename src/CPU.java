public class CPU {
    private int cores;
    private float frequency; // GHz
    private String architecture; // معماری
    private int clockSpeed;
    private float tdp; //abriviation of thermal design power and it's unit is watt
    public CPU(){

    }
    public CPU(int cores , float frequency , String architecture , int clockSpeed , float tdp) {
        this.cores = cores;
        this.frequency = frequency;
        this.architecture = architecture;
        this.clockSpeed = clockSpeed;
        this.tdp = tdp;
    }
}
