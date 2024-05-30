package com.example.top_trumps_start_code.models;






public class Reply {

    private String gameMessage;
//    private Suit suit;
//    private Rank rank;
//


    public Reply(String gameMessage){
        this.gameMessage = gameMessage;
//        this.rank = rank;
//        this.suit = suit;
    }


    public Reply(){

    }




    public String getGameMessage() {
        return gameMessage;
    }

    public void setGameMessage(String gameMessage) {
        this.gameMessage = gameMessage;
    }

//    public Suit getSuit() {
//        return suit;
//    }
//
//    public void setSuit(Suit suit) {
//        this.suit = suit;
//    }
//
//    public Rank getRank() {
//        return rank;
//    }
//
//    public void setRank(Rank rank) {
//        this.rank = rank;
//    }
}
