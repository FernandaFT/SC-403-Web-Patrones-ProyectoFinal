package com.asadosdelirium.controller;

import com.asadosdelirium.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MenuController {
    
    @Autowired
    private MenuService menuService;
    
    @GetMapping("/listado")
    public String listado(Model model){
        var lista = menuService.getMenus(false);
        model.addAttribute("menus", lista);
        
        return "/menu/listado";
    }
}
