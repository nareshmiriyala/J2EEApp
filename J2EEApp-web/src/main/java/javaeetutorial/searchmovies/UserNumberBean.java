/**
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package javaeetutorial.searchmovies;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Random;
import javaeetutorial.searchmovies.ejb.SearchBean;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named
@SessionScoped
public class UserNumberBean implements Serializable {
    
    private static final long serialVersionUID = 4089690593342390499L;
     @EJB
    private SearchBean searchBean;
    Integer randomInt = null;
    private String userNumber = null;
    String response = null;
    private long maximum = 10;
    private long minimum = 0;

    public UserNumberBean() {
        Random randomGR = new Random();
        randomInt = new Integer(randomGR.nextInt(10));
        System.out.println("Duke's number: " + randomInt);
    }

    public void setUserNumber(String user_number) {
        userNumber = user_number;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public HashMap<String,String> getResponse() {
        if ((userNumber != null) && (!userNumber.isEmpty())) {
            return searchBean.getMoviesMap(userNumber);
        }
       return null;
    }

    public long getMaximum() {
        return (this.maximum);
    }

    public void setMaximum(long maximum) {
        this.maximum = maximum;
    }

    public long getMinimum() {
        return (this.minimum);
    }

    public void setMinimum(long minimum) {
        this.minimum = minimum;
    }
}
