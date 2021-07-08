public class Exercise3 {

    @interface cardNumberTest{
        String value();
        String owner();
    }
    @cardNumberTest(value = "Return true when the sum of all digits in the id is even and false if not",
            owner = "Anh Vo")

    public boolean cardNumber(String card){
        boolean isEven = false;
        int sum = 0;
        try{
            for(int i=0; i<card.length();i++){
                int digit = Integer.parseInt(String.valueOf(card.charAt(i)));
                sum+=digit;
            }
        }catch (Exception e){
            System.out.println("Error: " + e);
        }

        if(sum%2==0){
            isEven = true;
        }
        return isEven;
    }

    public static void main(String[] args) {
        Exercise3 e3 = new Exercise3();
        System.out.println(e3.cardNumber("246"));
    }
}
