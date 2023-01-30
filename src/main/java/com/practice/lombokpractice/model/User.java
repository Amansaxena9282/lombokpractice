package com.practice.lombokpractice.model;

import com.fasterxml.jackson.core.sym.Name1;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
//    private String name;
private String name;
    private String name1;
private String setName1;
    public String getName1() {
        String Name1;
        return name1;
    }
    public void setName1(String name1) {
        this.name1 =name1;
    }

    public void setName(String neerajSirIsOurManager) {
    }
}
