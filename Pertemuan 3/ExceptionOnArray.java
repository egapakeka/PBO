/**
 * File : ExceptionOnArray.java
 * deskripsi : Program penggunaan eksepsi meggunakan class library java
 * nama : Ega Aryabima
 * tanggal : 4 Maret 2025
 */

public class ExceptionOnArray {
    public static void main(String[] args){
        int[] arr = new int[5];
        try {
            arr[2] = 11;
            arr[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("Clean up code...");
        }
    }
}
