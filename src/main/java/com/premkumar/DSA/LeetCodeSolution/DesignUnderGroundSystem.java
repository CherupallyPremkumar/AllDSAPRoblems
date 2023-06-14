package com.premkumar.DSA.LeetCodeSolution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Person
{
    int id;
    String station;
    int time;
    public Person(int id,String station,int time)
    {
        this.id=id;
        this.station=station;
        this.time=time;
    }
}
public class DesignUnderGroundSystem {


        Map<Integer,Person> hash;
        Map<String, List<Double>> average;

        public DesignUnderGroundSystem() {
            hash=new HashMap<>();
            average=new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            Person p=new Person(id,stationName,t);
            hash.put(id,p);
        }

        public void checkOut(int id, String stationName, int t) {
            if(hash.containsKey(id))
            {
                Double total=(double)t-hash.get(id).time;
              String s=hash.get(id).station+","+stationName;
                if(average.containsKey(s))
                {
                    List<Double>  l= average.get(s);
                    l.add(total);
                    average.put(s,l);
                }else
                {
                    List<Double> a=new ArrayList<>();
                    a.add(total);
                    average.put(s,a);
                }
            }
        }

        public double getAverageTime(String startStation, String endStation) {
            String ss=startStation+","+endStation;
            if(average.containsKey(ss))
            {
                List<Double> ll= average.get(ss);
                Double average=0.0;
                for(Double f: ll)
                {
                    average+=f;
                }
                return average/ll.size();
            }
            return 0.000;
        }
    }

