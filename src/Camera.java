public class Camera {
    private int megaPixel;
    private float apertureSize;
    private float sensorSize; //in micro meter$
    private boolean OIS;
    public Camera() {

    }
    public Camera(int megaPixel , float apertureSize , float sensorSize , boolean OIS) {
        this.megaPixel = megaPixel;
        this.apertureSize = apertureSize;
        this.sensorSize = sensorSize;
        this.OIS = OIS;
    }

}
