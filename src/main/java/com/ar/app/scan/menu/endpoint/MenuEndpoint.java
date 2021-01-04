package com.ar.app.scan.menu.endpoint;

import com.ar.app.scan.menu.model.MenuRestoResponse;
import com.ar.app.scan.menu.model.MenuRestoRequest;
import com.ar.app.scan.menu.service.ServiceMenuList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuEndpoint {

    @Autowired
    private ServiceMenuList serviceMenuList;

    @GetMapping("/services/test")
    @ResponseBody
    public String test(){
        return "Hello word";
    }

    @GetMapping("/services/menuResto")
    @ResponseBody
    public List<MenuRestoResponse> getMenuResto(@RequestBody MenuRestoRequest request){
        return serviceMenuList.getListMenu(request);
    }



}
