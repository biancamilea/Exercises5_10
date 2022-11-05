public class Exercise8 {
    public static void main(String[] args) {

        for(int rowNumber=0; rowNumber<10; rowNumber++) {
            for(int colNumber=1; colNumber<10; colNumber++){
                if(rowNumber==0 && colNumber == 5){
                    System.out.print(1);
                }else if(rowNumber==2 && colNumber == 7){
                    System.out.print(1);
                }else if(rowNumber==3 && colNumber == 2){
                    System.out.print(1);
                }else if(rowNumber==8 && colNumber == 7){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println(0);
        }

    }
}