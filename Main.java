
//Roberto Lagunes Alvarez

public class Main {
    public static void main(String[] args) {
        Integer[] intVector = {101,99,12,19,21,111,345,25,77,81};
        Integer[] resultI = Utils.particion(intVector);
        System.out.println("Metodo Int Ordenado: ");
        for(int r:resultI)

        Float[] floatVector = { 19.1f, 456.6f, 23.45f, 12.34f, 11.11f, 354.55f, 78.45f, 28.33f, 45.99f, 108.88f};
        Float[] resultfl = Utils.particion(floatVector);
        System.out.println("Metodo Float Ordenado: ");
        for(float r:resultfl)

        //String[] strVector = {"zz","aa","cc","hh","bb","ee","ll"};

    }
}

