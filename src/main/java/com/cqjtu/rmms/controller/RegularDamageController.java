package com.cqjtu.rmms.controller;

import com.cqjtu.rmms.entity.RegularDamage;
import com.cqjtu.rmms.service.RegularDamageService;
import com.cqjtu.rmms.service.RoadService;
import com.cqjtu.rmms.service.UserService;
import com.cqjtu.rmms.utils.DamageTypeHelper;
import com.cqjtu.rmms.utils.EvalHelper;
import com.cqjtu.rmms.utils.PointHelper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/regularDamage")
public class RegularDamageController {

    @Autowired
    private RegularDamageService regularDamageService;

    @Autowired
    private RoadService roadService;

    @Autowired
    private UserService userService;

    /**
     * 访问用户输入界面
     */
    @GetMapping("/toInput")
    public String input(Map<String, Object> map) {

        map.put("roadNameList", roadService.loadAll());

        map.put("userNameList", userService.loadAll());

        map.put("regularDamage", new RegularDamage());

        DamageTypeHelper damageTypeHelper = new DamageTypeHelper();

        if (damageTypeHelper.get() != null)
            map.put("damageTypeList", damageTypeHelper.get());

        return "regularDamage/input_regularDamage";
    }

    /**
     * 创建新用户
     */
    @PostMapping(value = "/create")
    public String create(RegularDamage regularDamage) {

        regularDamageService.addRegularDamage(regularDamage);

        return "redirect:/regularDamage/list";

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
        List<RegularDamage> regularDamageList = regularDamageService.loadDistinct();

        PageInfo<RegularDamage> page = new PageInfo<>(regularDamageList);

        map.put("page", page);

        return "regularDamage/list_regularDamage";
    }

    @GetMapping(value = "/remove/{regularDamageNo}")
    public String remove(@PathVariable("regularDamageNo") Integer regularDamageNo) {

        regularDamageService.removeRegularDamage(regularDamageNo);
        return "redirect:/regularDamage/list";
    }

    @GetMapping(value = "/preUpdate/{regularDamageNo}")
    public String preUpdate(@PathVariable("regularDamageNo") Integer regularDamageNo, Map<String, Object> map) {
        System.out.println(regularDamageService.getRegularDamageById(regularDamageNo));
        map.put("regularDamage", regularDamageService.getRegularDamageById(regularDamageNo));

        return "regularDamage/update_regularDamage";
    }

    @RequestMapping(value = "/update")
    public String update(RegularDamage regularDamage) {

        regularDamageService.updateRegularDamage(regularDamage);
        return "redirect:/regularDamage/list";
    }

    @GetMapping(value = "/info/{regularDamageNo}")
    public String info(@PathVariable("regularDamageNo") Integer regularDamageNo, Map<String, Object> map) {
        System.out.println("info" + regularDamageService.getRegularDamageById(regularDamageNo));

        DamageTypeHelper damageTypeHelper = new DamageTypeHelper();

        if (damageTypeHelper.get() != null)
            map.put("damageTypeList", damageTypeHelper.get());

        map.put("roadNameList", roadService.loadAll());

        map.put("userNameList", userService.loadAll());

        map.put("regularDamage", regularDamageService.getRegularDamageById(regularDamageNo));

        return "regularDamage/info_regularDamage";
    }

    @GetMapping("/listAll/{regularDamageNo}")
    public String listAll(@PathVariable("regularDamageNo") Integer regularDamageNo, Map<String, Object> map, @RequestParam(value = "pageNo", required = false, defaultValue = "1") String pageNoStr) {

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
        String key_name = regularDamageService.getRegularDamageById(regularDamageNo).getRoad_name();
        RegularDamage regularDamage = new RegularDamage();
        regularDamage.setRoad_name(key_name);

//        List<DailyInspect> dailyInspectList = dailyInspectService.loadAll();
        List<RegularDamage> regularDamageList = regularDamageService.select(regularDamage);
        PageInfo<RegularDamage> page = new PageInfo<>(regularDamageList);

        map.put("page", page);
        map.put("road_name", key_name);

        return "regularDamage/listAll_regularDamage";
    }

    @GetMapping("/listEval")
    public String listEval(Map<String, Object> map, @RequestParam(value = "pageNo", required = false, defaultValue = "1") String pageNoStr) {

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
        List<RegularDamage> regularDamageList = regularDamageService.loadDistinct();

        PageInfo<RegularDamage> page = new PageInfo<>(regularDamageList);

        map.put("page", page);

        return "eval/list_eval";
    }

    @GetMapping("/pointEval/{regularDamageNo}")
    public String pointEval(@PathVariable("regularDamageNo") Integer regularDamageNo, Map<String, Object> map, @RequestParam(value = "pageNo", required = false, defaultValue = "1") String pageNoStr) {

        //获得该 road 的信息集合
        String key_name = regularDamageService.getRegularDamageById(regularDamageNo).getRoad_name();
        RegularDamage regularDamage = new RegularDamage();
        regularDamage.setRoad_name(key_name);
        List<RegularDamage> regularDamageList = regularDamageService.select(regularDamage);


        PointHelper xian_lie = new PointHelper();
        PointHelper wang_lie = new PointHelper();
        PointHelper fan_you = new PointHelper();
        PointHelper che_zhe = new PointHelper();
        PointHelper cheng_xian = new PointHelper();
        PointHelper keng_dong = new PointHelper();
        for (RegularDamage each : regularDamageList) {
            if (each.getDamage_type().equals("线裂"))
                xian_lie = new PointHelper(each);
            if (each.getDamage_type().equals("网裂"))
                wang_lie = new PointHelper(each);
            if (each.getDamage_type().equals("车辙"))
                che_zhe = new PointHelper(each);
            if (each.getDamage_type().equals("沉陷"))
                cheng_xian = new PointHelper(each);
            if (each.getDamage_type().equals("坑洞"))
                keng_dong = new PointHelper(each);
            if (each.getDamage_type().equals("泛油"))
                fan_you = new PointHelper(each);
        }


        map.put("xian_lie", xian_lie);
        map.put("wang_lie", wang_lie);
        map.put("fan_you", fan_you);
        map.put("che_zhe", che_zhe);
        map.put("cheng_xian", cheng_xian);
        map.put("keng_dong", keng_dong);


        map.put("road_name", key_name);

        return "eval/point_eval";
    }

    @GetMapping("/evalEval/{regularDamageNo}")
    public String evalEval(@PathVariable("regularDamageNo") Integer regularDamageNo, Map<String, Object> map, @RequestParam(value = "pageNo", required = false, defaultValue = "1") String pageNoStr) {

        //获得该 road 的信息集合
        String key_name = regularDamageService.getRegularDamageById(regularDamageNo).getRoad_name();
        RegularDamage regularDamage = new RegularDamage();
        regularDamage.setRoad_name(key_name);
        List<RegularDamage> regularDamageList = regularDamageService.select(regularDamage);


        EvalHelper evalHelper1 = new EvalHelper(regularDamageList.get(0));
        EvalHelper evalHelper2 = new EvalHelper(regularDamageList.get(0));
        EvalHelper evalHelper3 = new EvalHelper(regularDamageList.get(0));
        if (regularDamageList.size() > 1)
            evalHelper2 = new EvalHelper(regularDamageList.get(1));
        if (regularDamageList.size() > 2)
            evalHelper3 = new EvalHelper(regularDamageList.get(2));


        map.put("evalHelper1", evalHelper1);
        map.put("evalHelper2", evalHelper2);
        map.put("evalHelper3", evalHelper3);


        map.put("road_name", key_name);

        return "eval/eval_eval";
    }

}
