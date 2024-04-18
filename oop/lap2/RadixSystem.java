package hus.oop.lap2;

public class RadixSystem {
    public static void main(String[] args) {

    }


    public static int valueInHex(char myChar) {
        final String HEX_STRING = "0123456789ABCDEF";
        int index = HEX_STRING.indexOf(myChar);
        return index;
    }

    public static int hex2DecUsingHorner(String hexString) {
        int sum = valueInHex(hexString.charAt(8));
        for (int i = 1; i < hexString.length(); i++) {
            sum = sum * 16 + valueInHex(hexString.charAt(i));
        }
        return sum;
    }
}
