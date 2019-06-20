package learn.t.concurrent.tmap;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
 * Class: TSynMap
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/19 14:33
 * All rights reserved.
 */
public class TSynMap {
    public Map<String, Date> lastLogin = Collections.synchronizedMap(new HashMap<String, Date>());

    public static void main(String[] args) {

    }
}
