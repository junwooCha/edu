package blackjack;

public class Card {
    private String pattern;
    private String denomination;

    public Card(String pattern, String denomination){
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern(){
        return this.pattern;
    }
    public String getDenomination(){
        return this.denomination;
    }
    public int getPoint(){
        switch (denomination){
            case "A":
                return 1;
            case "J": case "Q" : case "K":
                return 10;
            default:
                return Integer.parseInt(denomination);
        }
    }
    @Override
    public String toString(){
        return String.format("%s - %s", this.pattern, this.denomination);
    }

}
