package company.exawizards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        String source = "love";
        String target = "velo low vole lovee volvell lowly lower lover levo loved love lovee lowe lowes lovey lowan lowa evolve loves volvelle lowed love";
        char[] sourceArr = source.toCharArray();
        Map<Character, Boolean> sourceMap = new HashMap<>();
        for (int i = 0; i < sourceArr.length; i++) {
            sourceMap.put(sourceArr[i], true);
        }
        String[] targetArr = target.split(" ");

        List<String> tempList = new ArrayList<>();
        Map<String, Boolean> resultMap = new HashMap<>();
        for (int i = 0; i < targetArr.length; i++) {
            String temp = targetArr[i];
            char[] tempArr = temp.toCharArray();
            for (int j = 0; j < tempArr.length; j++) {
                if (sourceMap.containsKey(tempArr[j])) {
                    if (j == tempArr.length - 1) {
                        tempList.add(temp);
                    }
                }
            }
        }

        for (int i = 0; i < tempList.size(); i++) {
            String temp = tempList.get(i);
            char[] tempArr = temp.toCharArray();
            Map<Character, Boolean> targetMap = new HashMap<>();
            for (int k = 0; k < tempArr.length; k++) {
                targetMap.put(tempArr[k], true);
            }
            if (targetMap.size() == sourceMap.size()) {
                for (int a = 0; a < sourceArr.length; a++) {
                    if (targetMap.containsKey(sourceArr[a])) {
                        if (a == sourceArr.length - 1) {
                            if (!resultMap.containsKey(temp)) {
                                resultMap.put(temp, true);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(resultMap.size());
    }

}
