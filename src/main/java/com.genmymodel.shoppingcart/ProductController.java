package com.genmymodel.shoppingcart;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @generated
 */
@RestController
public class ProductController {

    /**
     * @generated
     */
    @RequestMapping("/product")
    public String index() {
        return "Greetings from ProductController!";
    }

}
