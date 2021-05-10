public class Main{
    public static void main(String[] args){
        Manager m = new Manager();
        Admin a = new Admin();
        Salesman s = new Salesman();
        int yearlysal = m.manager()+a.admin()+s.slaesman();
        System.out.println("Yearly salay: "+yearlysal);
    }
}