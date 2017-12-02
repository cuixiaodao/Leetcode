package hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * Created by cuixiaodao on 12/02/2017
 * for leetCode problem:
 * https://leetcode.com/problems/find-duplicate-file-in-system/description/
 */

public class FindDuplicateFile{
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String,List<String>> contPahtMap = new HashMap<>();
        for(String p : paths){
            String[] pathSegs = p.split(" ");
            String dir = pathSegs[0];

            // String[][] fileContentPairs = new String[pathSegs.length-1][2];
            for(int i=1; i<pathSegs.length; i++){
                String[] fcPair = getfileContentPairs(pathSegs[i]);
                String filePath = dir + "/" + fcPair[0];
                if(!contPahtMap.containsKey(fcPair[1]))
                    contPahtMap.put(fcPair[1], new ArrayList<String>());

                contPahtMap.get(fcPair[1]).add(filePath);
            }            
        }

        List<List<String>> ans = new ArrayList<List<String>>();
        for(Entry<String,List<String>> e : contPahtMap.entrySet()){
            List<String> depubPaths = e.getValue();
            if(depubPaths.size()>1) ans.add(depubPaths);
        }

        return ans;
    }

    private String[] getfileContentPairs(String path){
        String[] pSegs = path.split("\\(");
        return new String[]{pSegs[0], pSegs[1].substring(0, pSegs[1].length()-1)};
    }
}    