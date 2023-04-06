package interwiew;

public class Recgtale {
    public static void main(String[] args) {
        // Write a program to print the pattern given below (Left Triangle Star Pattern)
        /*

         *

         *

         *

         */

            //x for rows, y for columns, and row denotes the number of rows to print(satırlar için x, sütunlar için y ve
            //satırlar için x, sütunlar için y ve satır yazdırılacak satır sayısını belirtir
            int x, y, row=5;
            //outer loop for rows(satırlar)
            for(x=0; x<row; x++)
            {
                //inner loop for columns(sütunlar)
                for(y=0; y<=x; y++)
                {
                    //To prints stars
                    System.out.print("* ");
                }
                //(Cursor goes to the new line after printing each line.)Her satırı yazdırdıktan sonra imleç yeni satıra gider
                System.out.println();
            }
        }
    }



