package question.question10.history;

import com.alibaba.fastjson.JSON;

public class SaveHistoryExample {
    public static void main(String[] args) {
        Product potato = new Product("картошка");
        potato.price.setPrice(10.50);
//        potato.price.setPrice(11.50);
//        potato.price.setPrice(13.50);
//        potato.price.setPrice(15.00);
//        potato.price.setPrice(4.99);

        String json = JSON.toJSONString(potato);

        System.out.println(json);

        Product potatoLoaded = JSON.parseObject(json, Product.class);
        potatoLoaded.price.setPrice(50);


        System.out.println(potato);
        System.out.println(potatoLoaded);
    }
}
