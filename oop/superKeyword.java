package oop;

 class superKeyword {
    public int price( int x ) {
        int calcPrice = x + (int)(0.18*x);
        return calcPrice;
    }

}

 class shopkeeper extends superKeyword {
    public int price(int x ) {
        int calcPrice = super.price(x) ; 
        int shopkeeperProfit = (int)(0.10*calcPrice); 
        int totalPrice = calcPrice + shopkeeperProfit ;
        return totalPrice ; 
    }

    

    public static void main(String[] args) {
        shopkeeper newprofit = new shopkeeper();
        int profit = newprofit.price(100);
        System.out.println("Total Price is: " + profit);
    }
}
