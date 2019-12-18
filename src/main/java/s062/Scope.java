package s062;

public class Scope {
    private static int staticMember = 5;
    private long member = 5;

    public void f() {
        int local = 7;
        if (staticMember == 2) {
            short inner = 12;
            staticMember = 1 + inner;
            member = 3 + local;
        }
    }

    public void g() {
        System.out.println(member);
    }
    
    public static void main(String[] args) {
        double local = 5;
        System.out.println(local);
        staticMember = 12;// può vedere static member perchè sia main, sia staticmember sono privati
      //non potrebbe vedermi il member perchè è d'istanza ma...
        Scope scope = new Scope (); //creo oggetto scope nella classe
        System.out.println(scope.member);// possiamo creare un oggetto d'istanza a cui passargli il ns metodo member
        scope.f(); // stessa cosa vale per richiamare un metodo. serve creare una reference d'istanza
    }   
}
