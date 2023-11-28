public class Display {
    private float size;
    private int rezolution;
    private float PPI;
    private String displayTechnology;
    private int colorDepth; //a number 8, 16, 24
    private int refreshRate; // 60 , 90 , 120
    private boolean HDR_support;
    private int brightness; //range is 400 - 10000
    private boolean curvedDisplay;
    private String screeenProtection;
    public Display(){

    }
    public Display(float size , int rezouloution , float PPI , String displayTechnology , int colorDepth ,
                   int refreshRate , boolean HDR_support , int brightness , boolean curvedDisplay ,
                   String screeenProtection) {
        this.size = size;
        this.rezolution = rezouloution;
        this.PPI = PPI;
        this.displayTechnology = displayTechnology;
        this.colorDepth = colorDepth;
        this.refreshRate = refreshRate;
        this.HDR_support = HDR_support;
        this.brightness = brightness;
        this.curvedDisplay = curvedDisplay;
        this.screeenProtection = screeenProtection;
    }
}
