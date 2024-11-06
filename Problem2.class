public class Problem2 {

    public static String findCheapestCar(String[] carsArr, int[] pricesArr) {

        int cheapestCarPos = 0;
        for (int i = 1; i < pricesArr.length; i++) {
            if (pricesArr[i] < pricesArr[cheapestCarPos]) {
                cheapestCarPos = i;
            }
        }
        return "The cheapest car is: " + carsArr[cheapestCarPos] + ". Cost: $" + pricesArr[cheapestCarPos];
    }

    public static void main(String[] args) {
        String[] carsArr = {"Honda Accord", "Chevrolet Suburban", "Dodge Charger", "Kia Optima", "Acura TLX"};
        int[] pricesArr = {17000, 48000, 24000, 22500, 17999};

        String cheapestCar = findCheapestCar(carsArr, pricesArr);
        System.out.println(cheapestCar);
    }
}
