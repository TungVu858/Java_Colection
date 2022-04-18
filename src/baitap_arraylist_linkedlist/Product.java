package baitap_arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product implements Comparable<Product>{
    List<Product> productList = new ArrayList<>();
    private String name;
    private int id;
    private int price;

    public Product() {
    }

    public Product(String name, int id,int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void add(Product product){
        productList.add(product);
    }
    public int findByID(int id){
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()){
                return i;
            }
        }
        return -1;
    }
    public void delete(int id){
        productList.remove(findByID(id));
    }
    public void edit(int id,Product product){
        productList.set(findByID(id),product);
    }
    public void findByName(String name){
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getName())){
                System.out.println("Tên sản phẩm tìm được : "+productList.get(i).getName() + " ID : "+productList.get(i).getId()+" Giá : " + productList.get(i).getPrice());
            }
        }
    }
    public void sortByUP(){
        Collections.sort(productList);
    }
    public void sortByDecres(){
        Collections.reverse(productList);
    }
    public void displayAll(){
        for (Product product: productList
             ) {
            System.out.println (product);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.price - o.getPrice();
    }

}
