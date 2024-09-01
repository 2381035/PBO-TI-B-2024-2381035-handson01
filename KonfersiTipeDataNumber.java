public class KonfersiTipeDataNumber {
    public static void main(String[] args) {
        {
            byte tipeDataByte = 10;
            short tipeDataShort = tipeDataByte;
            int tipeDataInt = tipeDataShort;
            long tipeDataLong = tipeDataInt;
            float tipeDataFloat = tipeDataLong;
            double tipeDataDoble = tipeDataFloat;

            int tipeDataInteger = 128;
            byte tipeDataByte2 = (byte) tipeDataInteger;
            System.out.println(tipeDataByte2);
        }
        String firsName, lastName;
        firsName = "Ryo";
        lastName = "Yuangga";
        System.out.printf("%s %s", firsName, lastName);
    }
}