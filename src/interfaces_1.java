public class interfaces_1{
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
        Rook r = new Rook();
        r.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(moves in all direction)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right(moves in 4 direction)");
    }
}