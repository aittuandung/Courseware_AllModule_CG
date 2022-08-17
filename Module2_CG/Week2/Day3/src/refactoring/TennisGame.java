package refactoring;

public class TennisGame {
    private String player1Name;
    private String player2Name;
    private int score1;
    private int score2;

    public TennisGame(){}

    public TennisGame(String player1Name,String player2Name,int score1,int score2){
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.score1 = score1;
        this.score2 = score2;
    }

    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public int getScore1() {
        return score1;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public int getScore2() {
        return score2;
    }

    public static String getScore(String player1Name, String player2Name, int score1, int score2) {
        String score = "";
        int tempScore=0;
        if (score1==score2) {
            switch (score1)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (score1>=4 || score2>=4) {
            int minusResult = score1-score2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = score1;
                else { score+="-"; tempScore = score2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }
}