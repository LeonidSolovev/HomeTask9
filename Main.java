package HomeTask9;

public class Main {

    public static void main(String[] args) {


        String[][] array = new String[4][4];
        array[0][0] = "13";
        array[0][1] = "924";
        array[0][2] = "25423";
        array[0][3] = "342";
        array[1][0] = "3412";
        array[1][1] = "13";
        array[1][2] = "ы23";
        array[1][3] = "1324";
        array[2][0] = "4213";
        array[2][1] = "3";
        array[2][2] = "23";
        array[2][3] = "1225";
        array[3][0] = "123а";
        array[3][1] = "243";
        array[3][2] = "78";
        array[3][3] = "13";


        if (array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4)
            throw new MyArraySizeException();

        int q;
        int summ = 0;
        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 4; b++) {
                try {
                    q = Integer.parseInt(array[a][b]);
                    summ = summ + q;
                } catch (NumberFormatException | MyArrayDataException e) {
                    System.out.println("Ошибка в ячейке " + a +"; " + b);

                }
                finally {
                    System.out.println(summ);
                }

            }
        }
    }
}