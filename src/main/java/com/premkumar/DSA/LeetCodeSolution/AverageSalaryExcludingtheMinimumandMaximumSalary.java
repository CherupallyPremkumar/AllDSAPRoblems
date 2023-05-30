package com.premkumar.DSA.LeetCodeSolution;

import java.util.Arrays;

public class AverageSalaryExcludingtheMinimumandMaximumSalary {

    public static void main(String[] args) {

    }

        public double average(int[] salary) {
            int n=salary.length-1;
            Arrays.sort(salary);
            salary[0]=0; salary[n]=0;
           return   Arrays.stream(salary).sum()/(double)n-1;

        }

}
