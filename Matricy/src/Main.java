public class Main {
    public static void main(String[] args) {
        Matrica a = new Matrica(new int[][] {{2,4}, {5,1}});
        Matrica b = new Matrica(new int[][] {{8,3}, {4,5}});


        Matrica plus = a.Plus(b);
        Matrica multiplication = a.Multiplication(3);
        Matrica multiplicationMatric = a.MultiplicationMatric(b);

        for(int i = 0; i < plus.array.length; i++){
            for(int j = 0; j < plus.array[0].length; j++){
                System.out.print(" " + plus.array[i][j]);
            }
            System.out.println();
        }

        for(int i = 0; i < multiplication.array.length; i++){
            for(int j = 0; j < multiplication.array[0].length; j++){
                System.out.print(" " + multiplication.array[i][j]);
            }
            System.out.println();
        }

        for(int i = 0; i < multiplicationMatric.array.length; i++){
            for(int j = 0; j < multiplicationMatric.array[0].length; j++){
                System.out.print(" " + multiplicationMatric.array[i][j]);
            }
            System.out.println();
        }

    }
}