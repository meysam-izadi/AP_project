public class Phone {
    private String name;
    private Display display;
    private RAM ram;
    private float price;
    private Processor processor;
    private Camera cameraFront;
    private Camera cameraBack;
    private String backMaterial;
    private boolean IR_Sensor;
    //default constractor
    public Phone() {

    }
    public Phone(String name , Display display , RAM ram , float price , Processor processor ,
                 Camera cameraFront , Camera cameraBack , String backMaterial , boolean IR_Sensor) {
        this.name = name;
        this.display = display;
        this.ram = ram;
        this.price = price;
        this.processor = processor;
        this.cameraFront = cameraFront;
        this.cameraBack = cameraBack;
        this.backMaterial = backMaterial;
        this.IR_Sensor = IR_Sensor;

    }
}
