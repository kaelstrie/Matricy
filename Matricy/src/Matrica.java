public class Matrica {
    int[][] array;

    public Matrica(int[][] array){
        this.array = array;
    }

    public Matrica Plus(Matrica matrica){
        Matrica result = new Matrica(new int[array.length][array[0].length]);

        for(int i = 0; i < matrica.array.length; i++){
            for(int j = 0; j < matrica.array[0].length; j++){
                result.array[i][j] = array[i][j] + matrica.array[i][j];
            }
        }
        return result;
    }

    public Matrica Multiplication(int factor){
        Matrica result = new Matrica(new int[array.length][array[0].length]);

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                result.array[i][j] = array[i][j] * factor;
            }
        }
        return result;
    }

    public Matrica MultiplicationMatric(Matrica matrica){
        Matrica result = new Matrica(new int[array.length][array[0].length]);

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                for(int k = 0; k < array[0].length; k++){
                    result.array[i][j] = result.array[i][j] + array[i][k] * matrica.array[k][j];
                }
            }
        }

        return result;
    }
}
