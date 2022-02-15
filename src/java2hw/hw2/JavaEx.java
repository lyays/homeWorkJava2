package java2hw.hw2;

public class JavaEx {
    public void printArray(String arr[][]) {
        if (arr.length != 4 || checkColumnSize(arr)) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {  //идём по строкам
            for (int j = 0; j < arr[i].length; j++) {   //идем по столбцам
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("в ячейке с индексом [" + i + "] [" + j + "] данные неправильного формата: " + arr[i][j]);

                }
            }
        }
        System.out.println("сумма элементов массива = " + sum);
    }
    public boolean checkColumnSize (String [][] fff) {
        for (String[] str : fff) {
            if (str.length != 4) {
                return true;
            }

        }
        return false;
    }

}



