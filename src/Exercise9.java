public class Exercise9 {
    public static void main(String[] args) {
        int rowsWithAll0 = 0;
        int columnsWithAll0 = 0;

        for(int rowNumber=0; rowNumber<10; rowNumber++) {
            boolean isRowAllZero = true;

            for(int colNumber=1; colNumber<10; colNumber++){
                if(rowNumber == 0 && colNumber == 5){
                    System.out.print(1);
                    isRowAllZero = false;
                }else if((rowNumber == 2 || rowNumber == 8) && colNumber == 7){
                    System.out.print(1);
                    isRowAllZero = false;
                }else if(rowNumber == 3 && colNumber == 2){
                    System.out.print(1);
                    isRowAllZero = false;
                }else{
                    System.out.print(0);
                }
            }
            if(isRowAllZero){
                rowsWithAll0++;
            }
            System.out.println(0);
        }
        System.out.println("Rows 0 = " + rowsWithAll0);
        System.out.println("Columns 0 = " + columnsWithAll0);

    }
}