/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaeetutorial.searchmovies.ejb;

import java.util.HashMap;
import javaeetutorial.common.Search;
import javax.ejb.Stateless;

/**
 *
 * @author nareshm
 */
@Stateless
public class SearchBean  {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private static final  HashMap<String,String> moviesMap = null;

    public HashMap<String,String>  getMoviesMap(String searchString) {
        return Search.getMovies(searchString);
    }
}
