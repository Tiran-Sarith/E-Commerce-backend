package com.e_commerce.e_commerce.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Role {

    @Id
    private String rolename;
    private String roleDescription;

}
