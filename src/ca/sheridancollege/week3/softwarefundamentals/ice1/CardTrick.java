/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 * @modifier Jaskaran Singh
 * @student Number 991632348
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int )Math.floor(Math.random()*13+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        
        
        Scanner input = new Scanner (System.in);
        Card randomcard =new Card();
        System.out.println("choose the card between 1 and 13 ");
        int gValue = input.nextInt();
        randomcard.setValue(gValue);
        System.out.println("Enter a suit: 1(Hearts), 2(Diamonds), 3(Spades), 4(Clubs)");
        int gSuits = input.nextInt();
        randomcard.setSuits(Card.SUITS[gSuits]);
        // and search magicHand here
        boolean match =true ;
        for (int i=0;i<magicHand.length ; i++)
        {
            if (randomcard.getValue()==magicHand[i].getValue()&& randomcard.getSuit()== magicHand[i].getSuit()){
                match =true ;
                break;
            }
            else {
                match =false ;
                
            }
            //Then report the result here
            if (match )
            {
                System.out.println("great you won !!");
                
            }
            else {
                System.out.println("ooops!! you loose magic hand ");
                
            }
            
        }
    }
    
}
