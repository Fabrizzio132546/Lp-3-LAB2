package Auto_Motor;

public class TestAgregacion {
    public static void main(String[] args) {
        Motor motorCamaro = new Motor(67890, 7000); 
        Automovil camaro = new Automovil("CAM123", 2, "Chevrolet", "Camaro", motorCamaro);
        
        System.out.println(camaro);
    }
}
