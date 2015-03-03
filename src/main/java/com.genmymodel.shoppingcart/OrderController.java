package com.genmymodel.shoppingcart;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @generated
 */
@RestController
public class OrderController {

    /**
     * @generated
     */
    @RequestMapping("/order")
    public String index() {
        return "Greetings from OrderController!";
    }

}
