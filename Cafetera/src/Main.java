public class Main {
    public static void main(String[] args) {
        Cafetera cafe = new Cafetera(2000, 1000, 1500, 50);
        System.out.println("Total de ingredientes: " + cafe);
        cafe.servirAmerican();
        System.out.println("Total de ingredientes: " + cafe);
        cafe.servirCapuccino();
        cafe.servirExpresso();
        cafe.servirExpresso();
        cafe.servirExpresso();
        System.out.println("Total de ingredientes :" + cafe);
        cafe.servirCapuccino();
        cafe.servirAmerican();
        cafe.servirAmerican();
        cafe.servirExpresso();
        cafe.servirExpresso();
        cafe.servirExpresso();
        System.out.println("Total de ingredientes :" + cafe);
        cafe.servirCapuccino();
        cafe.servirAmerican();
        cafe.servirAmerican();
        cafe.servirExpresso();
        System.out.println(cafe);
        cafe.servirAmerican();
        cafe.servirCapuccino();

    }
}