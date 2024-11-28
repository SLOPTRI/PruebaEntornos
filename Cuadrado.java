public class Cuadrado {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }
    public String toString() {
        StringBuilder cuadrado = new StringBuilder();
        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {
                if (j == 1 || j == lado || i == lado || i == 1) {
                    cuadrado.append(" * ");
                } else{
                    cuadrado.append("   ");
                }
            }
            cuadrado.append("\n");
        }
        return cuadrado.toString();
    }
    public static void main(String[] args){
        Cuadrado cuadradito = new Cuadrado(4);
        Cuadrado cuadradazo = new Cuadrado(8);
        System.out.println("Cuadradito: ");
        System.out.println(cuadradito);
        System.out.println("Cuadradazo");
        System.out.println(cuadradazo);
    }
}


