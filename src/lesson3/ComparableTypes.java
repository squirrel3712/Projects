package MyPackage;

public class ComparableTypes {
    byte b = -126;
    short s = -32000;
    int i = 56086743;
    long l = 3L;
    float f = 1.1f;
    double d = 0.2;
    char c = 'a';
    boolean bool = false;

    public void toByte(){
        b = (byte)s;
        b = (byte)i;
        b = (byte)l;
        b = (byte)f;
        b = (byte)d;
        b = (byte)c;
    }

    public void toShort(){
        s = b;
        s = (short)i;
        s = (short)l;
        s = (short)f;
        s = (short)d;
        s = (short)c;
    }

    public void toInt(){
        i = b;
        i = s;
        i = (int)l;
        i = (int)f;
        i = (int)d;
        i = c;
    }

    public void toLong(){
        l = b;
        l = s;
        l = i;
        l = (long)f;
        l = (long)d;
        l = c;
    }

    public void toFloat(){
        f = b;
        f = s;
        f = i;
        f = l;
        f = (float)d;
        f = c;
    }

    public void toDouble(){
        d = b;
        d = s;
        d = i;
        d = l;
        d = f;
        d = c;
    }

    public void toChar(){
        c = (char)b;
        c = (char)s;
        c = (char)i;
        c = (char)l;
        c = (char)f;
        c = (char)d;
    }

    public static void main(String[] args) {
        ComparableTypes types = new ComparableTypes();
        types.toByte();
        types.toShort();;
        types.toInt();
        types.toLong();
        types.toFloat();
        types.toDouble();;
        types.toChar();;
    }
}
