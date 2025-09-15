package Decorator;

public class Main {
    public static void main(String[] args) {
        // Creamos un plan básico
        Plan planBasico = new PlanBasico();
        System.out.println("=== Plan Básico ===");
        System.out.println("Calidad: " + planBasico.calidad());
        System.out.println("Descargas: " + planBasico.descargas());

        // Decoramos el plan con HD
        Plan planHD = new HD(planBasico);
        System.out.println("\n=== Plan Básico + HD ===");
        System.out.println("Calidad: " + planHD.calidad());
        System.out.println("Descargas: " + planHD.descargas());

        // Decoramos el plan con UltraHD
        Plan planUltraHD = new UltraHD(planHD);
        System.out.println("\n=== Plan Básico + HD + UltraHD ===");
        System.out.println("Calidad: " + planUltraHD.calidad());
        System.out.println("Descargas: " + planUltraHD.descargas());

        // Decoramos el plan con DescargasOffline
        Plan planOffline = new DescargasOffline(planUltraHD);
        System.out.println("\n=== Plan Básico + HD + UltraHD + Descargas Offline ===");
        System.out.println("Calidad: " + planOffline.calidad());
        System.out.println("Descargas: " + planOffline.descargas());
    }
}
