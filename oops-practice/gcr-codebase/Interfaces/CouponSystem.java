interface CouponValidator {

    boolean validateCoupon(String code);

    static boolean isLengthValid(
            String code) {

        return code.length() >= 5;
    }
}

class ShoppingCart
implements CouponValidator {

    @Override
    public boolean validateCoupon(
            String code) {

        return code.startsWith("SAVE")
                &&
                CouponValidator
                .isLengthValid(code);
    }
}

public class CouponSystem {

    public static void main(String[] args) {

        String coupons[] = {
                "SAVE10",
                "AB12",
                "SAVE50"
        };

        ShoppingCart s =
        new ShoppingCart();

        for(String c : coupons) {

            if(s.validateCoupon(c))
                System.out.println(
                c + " Valid");

            else
                System.out.println(
                c + " Invalid");
        }
    }
}