public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello, world!";
        System.out.println(s);
        System.out.println("charAt(0): " + s.charAt(0));
        System.out.println("charAt(7): " + s.charAt(7));
        System.out.println("compareTo(\"Hello, world!\"): " + s.compareTo("Hello, world!"));
        System.out.println("compareToIgnoreCase(\"HELLO, WORLD!\"): " + s.compareToIgnoreCase("HELLO, WORLD!"));
        System.out.println("contains(\"world\"): " + s.contains("world"));
        System.out.println("endsWith(\"world!\"): " + s.endsWith("world!"));
        System.out.println("equals(\"Hello, world!\"): " + s.equals("Hello, world!"));
        System.out.println("equalsIgnoreCase(\"HELLO, WORLD!\"): " + s.equalsIgnoreCase("HELLO, WORLD!"));
        System.out.println("indexOf('o'): " + s.indexOf('o'));
        System.out.println("indexOf('o', 5): " + s.indexOf('o', 5));
        System.out.println("indexOf(\"lo\"): " + s.indexOf("lo"));
        System.out.println("indexOf(\"lo\", 5): " + s.indexOf("lo", 5));
        System.out.println("isBlank(): " + s.isBlank());
        System.out.println("isEmpty(): " + s.isEmpty());
        System.out.println("lastIndexOf('o'): " + s.lastIndexOf('o'));
        System.out.println("lastIndexOf('o', 5): " + s.lastIndexOf('o', 5));
        System.out.println("lastIndexOf(\"or\"): " + s.lastIndexOf("or"));
        System.out.println("lastIndexOf(\"or\", 5): " + s.lastIndexOf("or", 5));
        System.out.println("length(): " + s.length());
        System.out.println("repeat(2): " + s.repeat(2));
        System.out.println("replace('o', 'x'): " + s.replace('o', 'x'));
        System.out.println("replaceAll(\"\\\\s+\", \"-\"): " + s.replaceAll("\\s+", "-"));
        System.out.println("replaceFirst('o', 'x'): " + s.replaceFirst("o", "x"));
        System.out.println("split(\",\")[0]: " + s.split(",")[0]);
        System.out.println("startsWith(\"Hello\"): " + s.startsWith("Hello"));
        System.out.println("startsWith(\"Hello\", 5): " + s.startsWith("Hello", 5));
        System.out.println("strip(): " + s.strip());
        System.out.println("stripLeading(): " + s.stripLeading());
        System.out.println("stripTrailing(): " + s.stripTrailing());
        System.out.println("substring(7): " + s.substring(7));
        System.out.println("substring(7, 12): " + s.substring(7, 12));
        System.out.println("toCharArray()[0]: " + s.toCharArray()[0]);
        System.out.println("toLowerCase(): " + s.toLowerCase());
        System.out.println("toString(): " + s.toString());
        System.out.println("toUpperCase(): " + s.toUpperCase());
        System.out.println("trim(): " + s.trim());
        System.out.println("valueOf(123): " + String.valueOf(123));
    }
}


