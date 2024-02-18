public class StringBuilderMethods {
    public static void main(String[] args) {
        String s = "Hello, world!";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s);
        System.out.println("append(\"!\"): " + sb.append("!"));
        System.out.println("capacity(): " + sb.capacity());
        System.out.println("charAt(0): " + sb.charAt(0));
        System.out.println("delete(7, 13): " + sb.delete(7, 13));
        System.out.println("deleteCharAt(5): " + sb.deleteCharAt(5));
        System.out.println("indexOf(\"world\"): " + sb.indexOf("world"));
        System.out.println("insert(5, \"world\"): " + sb.insert(5, "world"));
        System.out.println("lastIndexOf(\"or\"): " + sb.lastIndexOf("or"));
        System.out.println("length(): " + sb.length());
        System.out.println("replace(0, 5, \"Hi\"): " + sb.replace(0, 5, "Hi"));
        System.out.println("reverse(): " + sb.reverse());
        System.out.println("substring(7): " + sb.substring(7));
        System.out.println("substring(7, 12): " + sb.substring(3, 6));
        System.out.println("toString(): " + sb.toString());
    }
}
