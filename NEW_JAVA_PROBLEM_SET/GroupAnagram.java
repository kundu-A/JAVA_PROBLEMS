/* Problem Statement - Given an array of strings, group the anagrams together..
 * # Example
        print(groupAnagrams(["eat","tea","tan","ate","nat","bat"]))
        [['eat','tea','ate'], ['tan','nat'], ['bat']]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GroupAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter how many elements you'r going to put: ");
        int size=sc.nextInt();
        List<String> list=new ArrayList<>();
        System.out.println("Please enter strings: ");
        for(int i=0;i<size;i++){
            String s=sc.next();
            list.add(s);
        }
        List<List<String>> result=solution(list);
        System.out.println(result);
        sc.close();
    }
    public static List<List<String>> solution(List<String> strList){
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strList){
            char[] words=s.toCharArray();
            Arrays.sort(words);
            String key=new String(words);
            map.computeIfAbsent(key, k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}