package projectEuler50to60.PokerHands;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
	static int MAX_HANDS_CARD = 5;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		while(T >= 0){
			List<String> hands = new ArrayList<>();
			for(int i = 0; i < MAX_HANDS_CARD*2; i++){
				hands.add(scanner.next());
			}
			System.out.println(getSolution(hands));
			T--;
		}
		
	}
	
	public static String getSolution(List<String> hands){
		String[] player = new String[MAX_HANDS_CARD];
		int fisrtPlayer = 0;
		int secondPlayer = 0;
		for(int i = 0; i < MAX_HANDS_CARD; i++){
			player[i] = hands.get(i);
		}
		fisrtPlayer = checkLargestScore(player);
		for(int j = MAX_HANDS_CARD; j < hands.size(); j++){
			player[j-5] = hands.get(j);
		}
		secondPlayer = checkLargestScore(player);
		if(fisrtPlayer > secondPlayer){
			return "Player 1";
		}else{
			return "Player 2";
		}
	}
	/*
	 * High Card : Highest value card. 0
	One Pair : Two cards of the same value. 100
	Two Pairs : Two different pairs. 200
	Three of a Kind : Three cards of the same value. 300
	Straight : All cards are consecutive values. 400
	Flush : All cards of the same suit. 500
	Full House : Three of a kind and a pair. 600
	Four of a Kind : Four cards of the same value. 700
	Straight Flush : All cards are consecutive values of same suit. 800
	Royal Flush : Ten, Jack, Queen, King, Ace, in same suit. 900
	
	*/
	
	public static int checkLargestScore(String[] player){
		int score = 0;
		if(checkFlush(player)){
			if(checkRoyalFlush(player)){
				score += 400;
			}
		}
		
		/*if(checkFlush(player)){
			score += 500;
			if(checkStarightFlush(player)){
				score += 300;
			}else if(checkRoyalFlush(player)){
				score += 400;
			}
		}else if(checkStraight(player) > 0){
			
		}else if(checkThreeple(player) > 0){
			
		}else if(checkPair(player) > 0){
			
		}
		score += checkHigh(player);*/
		
		return 0;
	}
	
	public static boolean checkFlush(String[] player){
		String suit = player[0].substring(1);
		for(int i = 1; i < MAX_HANDS_CARD; i++){
			System.out.println(player[i].substring(1));
			if(!suit.equals(player[i].substring(1))){
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkRoyalFlush(String[] player){
		String value = "";
		SortedSet<String> set = new TreeSet<>();
		for(int i = 0; i < MAX_HANDS_CARD; i++){
			set.add(player[i].substring(0, 1));
		}
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			value += iter.next();
		}
		if( value.equals("AJKQT")){
			return true;
		}else{
			return false;
		}
	}
}
