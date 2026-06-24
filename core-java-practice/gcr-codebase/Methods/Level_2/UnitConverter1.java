public class UnitConverter1 {

    static double kmToMiles(double km){
        return km * 0.621371;
    }

    static double milesToKm(double miles){
        return miles * 1.60934;
    }



    public static void main(String[] args){

        System.out.println(kmToMiles(10));
        System.out.println(milesToKm(10));
    }
}
