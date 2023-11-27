package christmas.service;

import christmas.constant.Menu;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SeperateService {

    private static final String COMMA = ",";
    private static final String HYPHEN= "-";

    private static final String MENU_EXCEPTION = "[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.";

    public Map<String,Integer> convertMenuInput(String menus) {
        Map<String, Integer> menuInfo = new HashMap<>();
        return seperate(menus, menuInfo);
    }

    private Map<String, Integer> seperate(String menus, Map<String, Integer> menuInfo) {
        List<String> splitByComma = List.of(menus.split(COMMA));
        isRightSeperateComma(menus,splitByComma.size());
        validateNoDuplicatie(splitByComma);
        seperateHyphen(menuInfo, splitByComma);
        isRightSeperateHyphen(menus, menuInfo);
        return menuInfo;
    }

    private void validateNoDuplicatie(List<String> splitByComma) {
        Set<String> nonDuplicateSplitByComma = new HashSet<>(splitByComma);
        if(nonDuplicateSplitByComma.size() != splitByComma.size())
            throw new IllegalArgumentException(MENU_EXCEPTION);
    }

    private void seperateHyphen(Map<String, Integer> menuInfo, List<String> splitByComma) {
        for(String splited : splitByComma)
        {
            List<String> splitByHyphen =  List.of(splited.split(HYPHEN));
            String menuName = splitByHyphen.get(0);
            String menuCount = splitByHyphen.get(1);
            validateSplitByHyphen(menuName, menuCount);
            menuInfo.put(menuName, Integer.parseInt(menuCount));
        }
    }

    private void validateSplitByHyphen(String name, String count) {
        Menu.validateName(name);
        Menu.validateCount(count);
    }

    private void isRightSeperateComma(String menus, int commaCount) {
        if(menus.chars().filter(c -> c == COMMA.charAt(0)).count() != commaCount)
            throw new IllegalArgumentException(MENU_EXCEPTION);
    }
}
