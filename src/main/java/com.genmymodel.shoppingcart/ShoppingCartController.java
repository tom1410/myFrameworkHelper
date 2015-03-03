package com.genmymodel.shoppingcart;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @generated
 */
@RestController
public class ShoppingCartController {

    /**
     * @generated
     */
    @RequestMapping("/shoppingcart")
    public String index() {
        return "Greetings from ShoppingCartController!";
    }

}
