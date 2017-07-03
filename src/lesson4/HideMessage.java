package lesson4;

public class HideMessage {
    public static byte[] incode(String message, String key) {
        byte[] shifr = message.getBytes();
        byte[] shifrKey = key.getBytes();
        byte[] res = new byte[message.length()];
        for (int i = 0; i < res.length; i++) {
            res[i] = (byte) (shifr[i] ^ shifrKey[i%shifrKey.length]);
        }
        return res;
    }

    public static String decode(byte[] shifr, String key) {
        byte res[] = new byte[shifr.length];
        byte[] keyShifr = key.getBytes();
        for (int i = 0; i < res.length; i++) {
            res[i] = (byte) (shifr[i] ^ keyShifr[i%keyShifr.length]);
        }
        return new String(res);
    }

    public static void main(String[] args) {
        String message = "I love you!!!";
        String key = "123";
        byte res[] = incode(message, key);
        System.out.println(res);
        System.out.println(decode(res, key));
    }
}
