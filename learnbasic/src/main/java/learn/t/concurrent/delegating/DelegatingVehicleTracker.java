package learn.t.concurrent.delegating;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Class: DelegatingVehicleTracker
 * Description: TODO
 * Version: 0.0.1
 * author: gaichao || Creation date: 2019/6/20 14:02
 * All rights reserved.
 */
public class DelegatingVehicleTracker {
    private final ConcurrentHashMap<String, Point> locations;
    private final Map<String, Point> unmodifiableMap;

    public DelegatingVehicleTracker(Map<String, Point> points) {
        this.locations = new ConcurrentHashMap<String, Point>(points);
        //不可变性的了解，不可变性，只是针对于这个unmodifiableMap而言，如果locations改变了，这个unmodifiableMap会跟着改变。
        this.unmodifiableMap = Collections.unmodifiableMap(locations);
    }

    public Map getLocations()
    {
        return unmodifiableMap;
    }
    //通过一个新的对象赋值给不便的对象从而，实现了不随着location的改变。
    public Map getLocations2()
    {
        return Collections.unmodifiableMap(new HashMap(locations));
    }

    public Point getPoint(String id)
    {
        return locations.get(id);
    }

    public void setLocation(String id,int x,int y)
    {
        if(locations.replace(id,new Point(x,y))==null)
        {
            throw new IllegalArgumentException("id:"+id+" is invalid");
        }
    }
}
