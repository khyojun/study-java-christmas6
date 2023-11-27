package christmas.domain;

import christmas.service.SeperateService;
import java.util.Map;

public class Menus {

    private final Map<String, Integer> menuInfo;
    private SeperateService seperateService = new SeperateService();

    public Menus(String menus) {
        this.menuInfo = seperateService.convertMenuInputToMenus(menus);
    }

    public Map<String, Integer> getMenuInfo() {
        return menuInfo;
    }
}
