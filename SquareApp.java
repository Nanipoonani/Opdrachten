package Hoofdstuk8.Opdracht1;

public class SquareApp {
    public int height;
    public int width;
    public int x;
    public int y;


    public static void main(String[] args) {



        Square sq = new Square();
                System.out.println(sq.calculateOmtrek(121212, 121212 ));
                System.out.println(sq.getArea(20));
                System.out.println(sq.position(14, 41));



        }
    public String vraagMethod()
    {
        Square sq = new Square();

        int width = sq.width;
        int height = sq.height;
        int x = sq.x;
        int y = sq.y;

        String vraag = String.format("This square has %d width, %d height \n This square is positioned in %d x and %d y", width, height, x, y);
        return vraag;



        }
    public int setPosition(){
        Square sq = new Square();

        int position = sq.position(12, 17);
        return position;
    }
    public String setSide(){
        Square sq = new Square();

        int Side = sq.width;
        String Sidesq = String.format("The width is " + Side);
        return Sidesq;
    }

}








