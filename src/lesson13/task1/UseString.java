package lesson13.task1;
public class UseString {
    public void useChatAt(String s){

        System.out.println("The last symbol of " + s + " = " +s.charAt(s.length()-1));
    }

    public void useEndsWith(String s, String end){
        System.out.println("The end of " + s + " is " + end + " "+ s.endsWith(end));
    }

    public void useStartsWith(String s, String start){
        System.out.println("The start of " + s + " is " + start + " " +s.startsWith(start));
    }

    public static void main(String[] args) {
        UseString s = new UseString();
        String s1 = "I love Java!!!";
        s.useChatAt(s1);
        s.useEndsWith(s1, "!!!");
        s.useStartsWith(s1, "I love");

        System.out.println("I love Java!!!.indexOf(\"Java\") = " +s1.lastIndexOf("Java"));
        System.out.println(s1.replace('a', 'o'));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(7));

        int i1 = 3, i2 = 56;
        StringBuilder builder = new StringBuilder();
        builder.append(i1).append(" + ").append(i2).append(" = ").append(i1+i2);
        int temp = builder.indexOf("=");
        builder.deleteCharAt(temp).insert(temp, " равно ");
        System.out.println(builder);
        builder = new StringBuilder();

        builder.append(i1).append(" - ").append(i2).append(" = ").append(i1-i2);
        builder.replace(temp , temp+1, " равно ");
        System.out.println(builder);
        builder = new StringBuilder();

        builder.append(i1).append(" * ").append(i2).append(" = ").append(i1*i2);
        builder.replace(temp , temp+1, " равно ");
        System.out.println(builder);
    }

}
