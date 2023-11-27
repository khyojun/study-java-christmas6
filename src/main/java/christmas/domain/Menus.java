package christmas.domain;

import christmas.constant.Menu;
import christmas.service.SeperateService;
import java.util.Map;
import java.util.Map.Entry;

public class Menus {

    private final Map<String, Integer> menuInfo;
    private SeperateService seperateService = new SeperateService();

    public Menus(String menus) {
        this.menuInfo = seperateService.convertMenuInputToMenus(menus);
    }

    public Map<String, Integer> getMenuInfo() {
        return menuInfo;
    }

    public int calculateBeforeSale() {
        int totalMoney=0;
        for (Entry<String, Integer> nowMenu : menuInfo.entrySet()) {
            totalMoney += nowMenu.getValue() * Menu.nowMenuPrice(nowMenu.getKey());
        }
        return totalMoney;
    }
}
