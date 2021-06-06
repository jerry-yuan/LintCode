package lintcode.q280;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    /**
     * @param x: an array of integers, the x coordinates of each city[i]
     * @param y: an array of integers, the y coordinates of each city[i]
     * @param c: an array of strings that represent the names of each city[i]
     * @param q: an array of strings that represent the names of query locations
     * @return: the closest city for each query
     */
    public String[] NearestNeighbor(int[] x, int[] y, String[] c, String[] q) {
        // write your code here
        Map<Object, List<City>> xMap = new HashMap<>();
        Map<Integer, List<City>> yMap = new HashMap<>();

        for (int i = 0; i < x.length; i++) {
            xMap.putIfAbsent(x[i], new LinkedList<>());
            List<City> cityList = xMap.get(x[i]);
            cityList.add(new City(y[i], c[i]));
        }
        for (int i = 0; i < y.length; i++) {
            yMap.putIfAbsent(y[i], new LinkedList<>());
            List<City> cityList = yMap.get(y[i]);
            cityList.add(new City(x[i], c[i]));
        }
        Map<String, Integer> cityIndex = new HashMap<>();
        for (int i = 0; i < c.length; i++) {
            cityIndex.put(c[i], i);
        }

        String[] result = new String[q.length];
        for (int i = 0; i < q.length; i++) {
            Integer cIndex = cityIndex.get(q[i]);
            List<City> xDirection = yMap.getOrDefault(y[i], null);
            List<City> yDirection = xMap.getOrDefault(x[i], null);
            City nearest = new City(Integer.MAX_VALUE, "NONE");
            if (xDirection != null) {
                for (City city : xDirection) {
                    if (city.name.equals(q[i])) {
                        continue;
                    }
                    int oldDistance=Math.abs(nearest.position - x[cIndex]);
                    int newDistance=(Math.abs(city.position - x[cIndex]));
                    if ((newDistance < oldDistance) || (oldDistance==newDistance && nearest.name.compareTo(city.name)>0)){
                        nearest = city;
                    }
                }
            }
            if (yDirection != null) {
                for (City city : yDirection) {
                    if (city.name.equals(q[i])) {
                        continue;
                    }
                    int oldDistance=Math.abs(nearest.position - y[cIndex]);
                    int newDistance=(Math.abs(city.position - y[cIndex]));
                    if ((newDistance < oldDistance) || (oldDistance==newDistance && nearest.name.compareTo(city.name)>0)){
                        nearest = city;
                    }
                }
            }

            result[i] = nearest.name;

        }

        return result;

    }

    public static class City {
        int position;
        String name;

        public City(int position, String name) {
            this.position = position;
            this.name = name;
        }
    }
}