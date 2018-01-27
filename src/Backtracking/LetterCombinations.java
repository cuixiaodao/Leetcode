package Backtracking;

import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class LetterCombinations{
    public List<String> letterCombinations(String digits) {
        List<String> oldRet = new ArrayList();
        List<String>  newRet = new ArrayList();
        String[] num2letter = new String[]{"abc","def","ghi","jkl","mno",
            "pqrs","tuv","wxyz"};

        oldRet.add("");
        for(char c : digits.toCharArray()){
            newRet = new ArrayList();
            if(c < '2' || c > '9') return newRet;

            for(String s : oldRet)
                for(char letter : num2letter[c-'2'].toCharArray())
                    newRet.add(s+letter);
            oldRet = newRet;

        }
        return newRet;
    }
}