/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication103;

/**
 *
 * @author anzoh
 */
public class JavaApplication103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("--- Java Strings: More Methods ---");
    
    String greeting = "  Hello Java!  ";
    String name = "Anas";
    String sentence = "Learning Java is fun and rewarding.";
    
    //1. length()
    System.out.println("\n1. length():");
    System.out.println("length of greeting variable: " + greeting.length());
    
    //2. charAt(index)
    System.out.println("\n2. charAt():");
    System.out.println("Character at index 1 of 'Java': " + "Java".charAt(1));
    
    // 3. substring(startIndex) / substring(startIndex, endIndex)
    System.out.println("\n3. subsstring();");
    System.out.println("Substring from index 9: " + sentence.substring(9));
    System.out.println("Substring from 9 to 20: " + sentence.substring(9, 20));
    
    //4. indexOf() / lastIndexOf()
    System.out.println("\n3. indexOf() / lastIndexOf");
    System.out.println("Index of Java in sentence: " + sentence.indexOf("Java"));
    System.out.println("Last index of 'e' in sentence: " + sentence.lastIndexOf('a'));
    
    //5. startsWith() / endsWith()
    System.out.println("\n4. startsWith() / endsWith()");
    System.out.println("Sentence starts with Learning?: " + sentence.startsWith("Learning"));
    System.out.println("Sentence ends with rewarding.?: " + sentence.endsWith("rewarding."));
    
    //equals() / equalIgnoreCase()
    System.out.println("\n6. equals() / equalIgnoreCase()");
    String s1 = "Java";
    String s2 = "java";
    System.out.println("Java = java?: " + s1.equals(s2));
    System.out.println("Java = java ignoring lowercase?: " + s1.equalsIgnoreCase(s2));
        
     // 7. toLowerCase() / toUpperCase()
        System.out.println("\n7. toLowerCase() / toUpperCase():");
        System.out.println("Lowercase: " + greeting.toLowerCase());
        System.out.println("Uppercase: " + name.toUpperCase());
        
   
     //8. replace()
      System.out.println("\n8. replace():");
      System.out.println("replace: " + sentence.replace("fun", "great"));
      
      //9. trim()
      System.out.println("\n9. trim():");
      System.out.println("Greeting with no trim: '" + greeting +  "'");
      System.out.println("Trimmed greeting (no spaces): '" + greeting.trim() + "'");
    
      
      // 10. Method Chaining (since methods return new String objects)
      System.out.println("\n10. Method Chaining:");
      String chainedResult = greeting.trim().toUpperCase().replace("JAVA", "PYTHON");
      System.out.println("New greeting: " + chainedResult);
    
    }
    
    
}
