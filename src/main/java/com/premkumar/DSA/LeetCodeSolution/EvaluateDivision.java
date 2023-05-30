package com.premkumar.DSA.LeetCodeSolution;


import java.util.*;

class Edge {

        String v;
        double value;

        public Edge (String v, double value) {

            this.v = v;
            this.value = value;
        }
    }

public class EvaluateDivision {
    public static void main(String[] args) {
        List<List<String>> quies=new ArrayList<>();
        quies.add(new ArrayList<>(Arrays.asList("a","b")));
        quies.add(new ArrayList<>(Arrays.asList("b","c")));
        List<List<String>> equation=new ArrayList<>();
        equation.add(new ArrayList<>(List.of("a","c")));
        equation.add(new ArrayList<>(List.of("b","a")));
        equation.add(new ArrayList<>(List.of("a","e")));
        equation.add(new ArrayList<>(List.of("a","x")));
        equation.add(new ArrayList<>(List.of("x","x")));
        double[] d=new double[]{2.0,3.0};
        System.out.println(Arrays.toString(calcEquation(equation,d,quies)));
    }

        static public void addEdge (Map<String, List<Edge>> map, String u, String v, double value) {

            if (!map.containsKey (u)) {
                map.put (u, new ArrayList<>());
            }

            map.get (u).add (new Edge (v, value));
        }

      static   public double dfs (Map<String, List<Edge>> map, Set<String> set, String u, String v) {

            if (!map.containsKey (u) || !map.containsKey (v)) {
                return -1;
            }
            else if (u.equals (v)) {
                return 1;
            }

            for (Edge edge : map.get (u)) {
                if (set.contains (edge.v)) {
                    continue;
                }
                else if (edge.v.equals (v)) {
                    return edge.value;
                }

                set.add (u);
                double val = dfs (map, set, edge.v, v);
                if (val != -1) {
                    return val * edge.value;
                }
            }

            return -1;
        }

        static public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

            double[] answer = new double[queries.size ()];
            Map<String, List<Edge>> map = new HashMap<>();
            System.out.println(values.length);
            System.out.println(equations.size());
            for (int i = 0; i <values.length; i++) {
                List<String> equation = equations.get(i);
                addEdge (map, equation.get (0), equation.get (1), values[i]);
                addEdge (map, equation.get (1), equation.get (0), 1 / values[i]);
            }

            for (int i = 0; i < answer.length; i++) {
                List<String> query = queries.get (i);
                answer[i] = dfs (map, new HashSet<>(), query.get (0), query.get (1));
            }

            return answer;
        }
    }

