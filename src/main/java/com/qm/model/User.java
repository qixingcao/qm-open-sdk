package com.qm.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by yudi on 16/4/7.
 */
public class User implements Serializable{
    private static final long serialVersionUID = -8676720689275544394L;
    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
   private String userName;
    @Getter
    @Setter
    private String passWord;

}
