package com.genmymodel.shoppingcart;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @generated
 */
@RestController
public class WebUserController {

    /**
     * @generated
     */
    @RequestMapping("/webuser")
    public String index() {
        return "Greetings from WebUserController!";
    }

}
