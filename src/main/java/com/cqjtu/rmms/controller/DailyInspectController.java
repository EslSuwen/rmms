package com.cqjtu.rmms.controller;

import com.cqjtu.rmms.entity.DailyInspect;
import com.cqjtu.rmms.entity.Road;
import com.cqjtu.rmms.service.DailyInspectService;
import com.cqjtu.rmms.service.RoadService;
import com.cqjtu.rmms.service.UserService;
import com.cqjtu.rmms.utils.DamageTypeHelper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/dailyInspect")
public class DailyInspectController {

    @Autowired
    private DailyInspectService dailyInspectService;

    @Autowired
    private RoadService roadService;

    @Autowired
    private UserService userService;

    /**
     * 访问日常巡查输入界面
     */
    @GetMapping("/toInput")
    public String input(Map<String, Object> map) {

        /**
         * 实现编号自增
         */
        List<DailyInspect> dailyInspectList = dailyInspectService.loadAll();
        DailyInspect new_inspect = new DailyInspect(), dailyInspect = dailyInspectList.get(dailyInspectList.size() - 1);
        new_inspect.setDaily_inspect_no("" + (Integer.parseInt(dailyInspect.getDaily_inspect_no()) + 1));

        DamageTypeHelper damageTypeHelper = new DamageTypeHelper();

        if (damageTypeHelper.get() != null)
            map.put("damageTypeList", damageTypeHelper.get());

        map.put("roadNameList", roadService.loadAll());

        map.put("userNameList", userService.loadAll());

        map.put("dailyInspect", new_inspect);

        return "dailyInspect/input_dailyInspect";
    }

    /**
     * 创建新日常巡查
     */
    @PostMapping(value = "/create")
    public String create(DailyInspect dailyInspect) {

        dailyInspectService.addDailyInspect(dailyInspect);

        return "redirect:/dailyInspect/list";

    }

    @GetMapping("/list")
    public String list(Map<String, Object> map, @RequestParam(value = "pageNo", required = false, defaultValue = "1") String pageNoStr) {

        int pageNo = 1;

        //对 pageNo 的校验
        pageNo = Integer.parseInt(pageNoStr);
        if (pageNo < 1) {
            pageNo = 1;
        }

        /*
         * 第一个参数：第几页;
         * 第二个参数：每页获取的条数.
         */
        PageHelper.startPage(pageNo, 20);
//        List<DailyInspect> dailyInspectList = dailyInspectService.loadAll();
        List<DailyInspect> dailyInspectList = dailyInspectService.loadDistinct();
        PageInfo<DailyInspect> page = new PageInfo<>(dailyInspectList);

        map.put("page", page);

        return "dailyInspect/list_dailyInspect";
    }

    @GetMapping(value = "/remove/{dailyInspectNo}")
    public String remove(@PathVariable("dailyInspectNo") Integer dailyInspectNo) {

        dailyInspectService.removeDailyInspect(dailyInspectNo);
        return "redirect:/dailyInspect/list";
    }

    @GetMapping(value = "/removeByRoad/{roadName}")
    public String removeByRoad(@PathVariable("roadName") String roadName) {

        List<DailyInspect> dailyInspectList = dailyInspectService.loadAll();
        for (DailyInspect each : dailyInspectList) {
            if (each.getRoad_name().equals(roadName))
                dailyInspectService.removeDailyInspect(Integer.parseInt(each.getDaily_inspect_no()));
        }
        return "redirect:/dailyInspect/list";
    }

    @GetMapping(value = "/preUpdate/{dailyInspectNo}")
    public String preUpdate(@PathVariable("dailyInspectNo") Integer dailyInspectNo, Map<String, Object> map) {
        System.out.println(dailyInspectService.getDailyInspectById(dailyInspectNo));
        map.put("dailyInspect", dailyInspectService.getDailyInspectById(dailyInspectNo));

        return "dailyInspect/update_dailyInspect";
    }

    @PostMapping(value = "/update")
    public String update(DailyInspect dailyInspect) {

        dailyInspectService.updateDailyInspect(dailyInspect);
        return "redirect:/dailyInspect/list";
    }

    @GetMapping(value = "/info/{dailyInspectNo}")
    public String info(@PathVariable("dailyInspectNo") Integer dailyInspectNo, Map<String, Object> map) {
        System.out.println("info" + dailyInspectService.getDailyInspectById(dailyInspectNo));

        DamageTypeHelper damageTypeHelper = new DamageTypeHelper();

        if (damageTypeHelper.get() != null)
            map.put("damageTypeList", damageTypeHelper.get());

        map.put("roadNameList", roadService.loadAll());

        map.put("userNameList", userService.loadAll());

        map.put("dailyInspect", dailyInspectService.getDailyInspectById(dailyInspectNo));

        return "dailyInspect/info_dailyInspect";
    }

    @GetMapping("/listAll/{dailyInspectNo}")
    public String listAll(@PathVariable("dailyInspectNo") Integer dailyInspectNo, Map<String, Object> map, @RequestParam(value = "pageNo", required = false, defaultValue = "1") String pageNoStr) {

        int pageNo = 1;

        //对 pageNo 的校验
        pageNo = Integer.parseInt(pageNoStr);
        if (pageNo < 1) {
            pageNo = 1;
        }

        /*
         * 第一个参数：第几页;
         * 第二个参数：每页获取的条数.
         */
        PageHelper.startPage(pageNo, 4);
        String key_name = dailyInspectService.getDailyInspectById(dailyInspectNo).getRoad_name();
        DailyInspect dailyInspect = new DailyInspect();
        dailyInspect.setRoad_name(key_name);

//        List<DailyInspect> dailyInspectList = dailyInspectService.loadAll();
        List<DailyInspect> dailyInspectList = dailyInspectService.select(dailyInspect);
        PageInfo<DailyInspect> page = new PageInfo<>(dailyInspectList);

        map.put("page", page);
        map.put("road_name", key_name);

        return "dailyInspect/listAll_dailyInspect";
    }
}
