package com.ar.app.scan.menu.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Data
@Entity
@Table(name = "MENU")
public class Menu {

    @Id
    @Column(name = "ID_MENU")
    private int idMenu;

    @Column(name = "ID_RESTO")
    private int idResto;

    @Column(name = "MENU_NAME")
    private String menuName;

    @Column(name = "MENU_DESCRIPTION")
    private String menuDescription;

}
