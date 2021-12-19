package com.shuati;
import org.junit.Test;
import org.junit.Before;    
    
public class BuyAndSellStockTest {

    @Before
    public void setup(){

    }
     
    @Test
    public void test() {
        int [] prices = {7,1,5,3,6,4};
        BuyAndSellStock b = new BuyAndSellStock();
        System.out.println(b.maxProfit(prices));
    }

    // @Test
    // public void test1() {
    //     int [] prices = {7,6,4,3,1};
    //     BuyAndSellStock b = new BuyAndSellStock();
    //     System.out.println(b.maxProfit(prices));
    // }

    // @Test
    // public void test2() {
    //     int [] prices = {1,2};
    //     BuyAndSellStock b = new BuyAndSellStock();
    //     System.out.println(b.maxProfit(prices));
    // }
}
    