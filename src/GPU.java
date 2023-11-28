public class GPU {
    private int archtecture;
    private float frequency;
    private int executionUnits;
    private int totalShaders;
    //default constractor
    public GPU(){

    }
    public GPU(int archtecture , float frequency , int executionUnits , int totalShaders) {
        this.archtecture = archtecture;
        this.frequency = frequency;
        this.executionUnits = executionUnits;
        this.totalShaders = totalShaders;
    }
}
