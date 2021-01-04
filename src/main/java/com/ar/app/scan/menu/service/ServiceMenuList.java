package com.ar.app.scan.menu.service;

import com.ar.app.scan.menu.domain.Menu;
import com.ar.app.scan.menu.model.MenuRestoResponse;
import com.ar.app.scan.menu.model.MenuRestoRequest;
import com.ar.app.scan.menu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceMenuList {
    @Autowired
    private MenuRepository menuRepository;

    public List<MenuRestoResponse> getListMenu(MenuRestoRequest request){
        List<Menu> menuList = menuRepository.findByIdResto(request.getIdResto());
        return mapperMenu(menuList);
    }

    private List<MenuRestoResponse> mapperMenu(List<Menu> menuList){
        List<MenuRestoResponse> list = new ArrayList<>();

        menuList.forEach(menu -> {
            MenuRestoResponse menuRestoResponse = new MenuRestoResponse();
            menuRestoResponse.setName(menu.getMenuName());
            menuRestoResponse.setDescription(menu.getMenuDescription());
            list.add(menuRestoResponse);
        });
        return list;
    }
}
