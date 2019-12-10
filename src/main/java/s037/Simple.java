package s037;

public class Simple {
    public static void main(String[] args) {
        int alpha = 12;
        int beta = 21;
        int gamma = 12;

        System.out.println("alpha < beta? " + (alpha < beta)); 
        System.out.println("alpha < gamma? " + (alpha < gamma)); 
        System.out.println("alpha <= gamma? " + (alpha <= gamma)); 

        System.out.println("alpha > beta? " + (alpha > beta)); 
        System.out.println("alpha > gamma? " + (alpha > gamma)); 
        System.out.println("alpha >= gamma? " + (alpha >= gamma)); 

        System.out.println("alpha == beta? " + (alpha == beta)); 
        System.out.println("alpha == gamma? " + (alpha == gamma)); 

        System.out.println("alpha != beta? " + (alpha != beta)); 
        System.out.println("alpha != gamma? " + (alpha != gamma)); 
    }
}
