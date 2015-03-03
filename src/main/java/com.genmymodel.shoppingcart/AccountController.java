package com.genmymodel.shoppingcart;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @generated
 */
@RestController
public class AccountController {

    /**
     * @generated
     */
    @RequestMapping("/account")
    public String index() {
        return "Greetings from AccountController!";
    }

}
