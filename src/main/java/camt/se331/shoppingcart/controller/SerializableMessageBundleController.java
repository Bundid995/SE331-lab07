package camt.se331.shoppingcart.controller;


import camt.se331.shoppingcart.common.SerializableResourceBundleMessageSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;
import java.util.Properties;

<<<<<<< HEAD

=======
>>>>>>> 912705ac298734058f2772c85827bb6083fa70ba
@CrossOrigin
@Controller
@RequestMapping("/messageBundle")
public class SerializableMessageBundleController {
    @Autowired
    SerializableResourceBundleMessageSource messageBundle;
    /**
     * ReadAll
     */
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Properties list(@RequestParam String lang)
    {
        return messageBundle.getAllProperties(new Locale(lang));
    }

}
