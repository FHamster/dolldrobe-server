package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.model.ShoppingCart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopingCartServiceTest {
    @Autowired
    ShopingCartService service;

    @Test
    public void getSkudao() {
        service.addSC("01PWQSYWR6KX7ATQBPC2YCCBY4H9B2BY", "07TV4J0NCDHY1YXNJ7K04TJ5Q 6IR OH0DESJP0Y", 1);
        System.out.println("成功");
    }

    @Test
    public void deletesc() {
        ShoppingCart cart = new ShoppingCart();
        cart.setuAccountnumber(" ");
        cart.setSkuId(" ");
        service.deletSC(cart);
    }

    @Test
    public void modify() {
        ShoppingCart cart1 = new ShoppingCart();
        cart1.setuAccountnumber("RSYA30ADLFCYIMI 59LUVBG1 6WVMPTC4WPF QCF");
        cart1.setSkuId("3C60MP300IJHF6V5WE0UWUCG02K09VVL");
        ShoppingCart cart2 = new ShoppingCart();
        cart2.setuAccountnumber("RSYA30ADLFCYIMI 59LUVBG1 6WVMPTC4WPF QCF");
        cart2.setSkuId("24PBQG3PFDMIELRP6K230O9UCIVTBFKC");
        cart2.setScNum(100);
        service.modifySCSelective(cart1);
    }
}