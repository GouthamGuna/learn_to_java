package oracle_java_eighth;

class Product{
    double price;
}
public class Question_one {

    public void updatePrice(Product pro, double price){

        price = price*2;
        pro.price = pro.price + price;

    }

    public static void main(String[] args) {

        Product product=new Product();

        product.price=200;
        double newPrice=100;

        Question_one questionOne=new Question_one();

        questionOne.updatePrice(product,newPrice);

        System.out.println(product.price +" : "+newPrice);
    }
}
