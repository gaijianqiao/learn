package learn.t.concurrent.delegating;

import java.util.HashMap;
import java.util.Map;

/*
 * Class: RunUnmodifyObject
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/20 14:13
 * All rights reserved.
 */
public class RunUnmodifyObject {

    public static void main(String[] args) {

        Map<String,Point> maps = new HashMap<String, Point>();
        maps.put("1",new Point(1,1));
        maps.put("2",new Point(2,2));
        maps.put("3",new Point(3,3));

        DelegatingVehicleTracker tracker = new DelegatingVehicleTracker(maps);
        Map unmodifyMap = tracker.getLocations();

        Map unmodifyMap2 = tracker.getLocations2();//浅拷贝的结果不会跟着实时改变

        tracker.setLocation("1",11,11);

        System.out.println("");
    }
}
