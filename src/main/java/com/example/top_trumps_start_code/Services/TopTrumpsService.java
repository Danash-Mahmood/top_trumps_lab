package com.example.top_trumps_start_code.Services;


import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Reply;
import com.example.top_trumps_start_code.models.Suit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;


@Service
public class TopTrumpsService {


    private Card cardPlayer1;
    private Card cardPlayer2;


    private ArrayList<Card> cardList;

    // loop through suite
    //loop through rank
    //make a new card with the suite and rank
    //add the new card to the arrayList;

    public void makeCardList(){
        this.cardList = new ArrayList<>();
        Card temCard;
        for(Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){

                temCard = new Card(rank,suit);
                this.cardList.add(temCard);




            }
        }
    }


    public void getRandomCard(ArrayList<Card> cardList){
        Random randomiser1 =  new Random();
        cardPlayer1 = cardList.get(randomiser1.nextInt(cardList.size()));
        cardList.remove(cardPlayer1);
        Random randomiser2 = new Random();
        cardPlayer2 =  cardList.get(randomiser2.nextInt(cardList.size()));
        cardList.remove(cardPlayer2);



    }

    public Reply checkWinner(Card cardPlayer1,Card cardPlayer2){
        Reply reply;
        if(cardPlayer1.getCardValue() > cardPlayer2.getCardValue()){

            reply = new Reply(String.format("%s of %s wins!",cardPlayer1.getRank(),cardPlayer1.getSuit()));




        }


        if(cardPlayer1.getCardValue() < cardPlayer2.getCardValue()){
            reply = new Reply(String.format("%s of %s wins!",cardPlayer2.getRank(),cardPlayer2.getSuit()));

        }

        else{

            reply =  new Reply("Draw!");



        }

        return reply;







    }



    public TopTrumpsService(){

    }

    public Reply startNewGame(){
        this.makeCardList();
        this.getRandomCard(cardList);

        return this.checkWinner(cardPlayer1,cardPlayer2);








    }








    public Card getCardPlayer1() {
        return cardPlayer1;
    }

    public void setCardPlayer1(Card cardPlayer1) {
        this.cardPlayer1 = cardPlayer1;
    }

    public Card getCardPlayer2() {
        return cardPlayer2;
    }

    public void setCardPlayer2(Card cardPlayer2) {
        this.cardPlayer2 = cardPlayer2;
    }

    public ArrayList<Card> getCardList() {
        return cardList;
    }

    public void setCardList(ArrayList<Card> cardList) {
        this.cardList = cardList;
    }
}
