public class SimpleArray {
    public static void main(String[] args) {

        String [] animals = new  String [5];
        animals [0] = "Burek";
        animals [1] = "Mruczek";
        animals [2] = "Azor";
        animals [3] = "Tom";
        animals [4] = "Jerry";

        String imieCzwartegoZwierzaka = animals [3];
        System.out.println(imieCzwartegoZwierzaka);
        int numberOfElements = animals.length;
        System.out.println("Moja tablica zawiera " + numberOfElements +  " elementów");

    }

}
