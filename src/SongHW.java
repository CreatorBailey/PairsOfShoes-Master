public class SongHW {

    public static void main(String[] args) {
        int ShoeNum = 99;
        String word = "Pairs";

        while (ShoeNum > 0) {

            if (ShoeNum == 1) {
                word = "Pairs";
            }


            if (ShoeNum > 0) {
                System.out.println(ShoeNum + " " + word + " Pairs Of Shoes On The Wall");
             
                System.out.println(ShoeNum + " " + word + " Of Shoes");
                System.out.println("You Take One Down");
                System.out.println("Throw Her Around");
                ShoeNum = ShoeNum - 1;
            } else {
                System.out.println("No More Pairs Of Shoes On The Wall");
            }
        }
            }
        }


