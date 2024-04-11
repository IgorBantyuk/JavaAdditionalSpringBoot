package edu.ntu.sau.javasb.controllers;


import edu.ntu.sau.javasb.services.ModelModifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
    @Autowired
    ModelModifier modelModifier;

    @GetMapping("/welcome")
    String getWelcome(Model model){
        String someData = modelModifier.getSomeData();
        model.addAttribute("someData",someData);
        return "welc";
    }

    @GetMapping("/getResult")
    String getResult(Model model){
        model.addAttribute("result",modelModifier.getModifiedStorage());
        return "result";
    }

    @GetMapping ("/getUpgradePage")
    String postStorage(){
        return "upgradePage";
    }

    @PostMapping ("/postStorageValue")
    String postStorageValue(@RequestParam String storageValue){
        modelModifier.updateStorage(Integer.parseInt(storageValue));
        return "upgradePage";
    }
}
