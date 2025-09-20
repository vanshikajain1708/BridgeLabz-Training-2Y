public class Game {
    static char[][] board = new har[3][3];
    static char playerLetter , computerLetter;
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();


    private static void createBoard(){
        for (int i=1;i<board.length;i++){
            board[i]=' ';
        }
    }
    static void chooseLetter(){
        System.out.println("choose your letter(X/O):");
        PlayerLetter = Scanner.next().toUpperCase().charAT(0);
        ComputerLetter=(PlayerLetter == 'X')? '0':'X';
        
    }
}