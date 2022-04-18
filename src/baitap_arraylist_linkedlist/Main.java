package baitap_arraylist_linkedlist;


public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.add(new Product("Sting",1,8000));
        product.add(new Product("Cocacola",2,7000));
        product.add(new Product("Monster",3,30000));
        product.delete(1);
        product.displayAll();
        product.add(new Product("Sting",1,8000));
        product.edit(1,new Product("Pepsi",4,8000));
        product.displayAll();
        product.findByName("Monster");
        product.sortByUP();
        product.displayAll();
        product.sortByDecres();
        product.displayAll();
    }
}
