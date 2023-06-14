package com.premkumar.DSA.LeetCodeSolution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Chara implements Comparable {
    char c;
    Chara(char a) {
        c = a;
    }
    @Override
    public int compareTo(Object o) {
        if (o instanceof Chara) {
            Chara chara = (Chara) o;
            return Character.compare(this.c, chara.c);
        }
        return -1;
    }
}

public class SubstringsofSizeThreewithDistinctCharacters {
        public int countGoodSubstrings(String s) {
            List<Chara> list = new ArrayList<>();
            for (char c : s.toCharArray()) list.add(new Chara(c));
            int count = 0;
            for (int i = 0; i < list.size() - 2; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) != 0 && list.get(i).compareTo(list.get(i + 2)) != 0 && list.get(i + 1).compareTo(list.get(i + 2)) != 0)
                    count++;
            }
            return count;
        }
}
