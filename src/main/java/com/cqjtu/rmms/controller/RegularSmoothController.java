package com.cqjtu.rmms.controller;

import com.cqjtu.rmms.entity.RegularSmooth;
import com.cqjtu.rmms.service.RegularSmoothService;
import com.cqjtu.rmms.service.RoadService;
import com.cqjtu.rmms.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/regularSmooth")
public class RegularSmoothController {

    @Autowired
    private RegularSmoothService regularSmoothService;

    @Autowired
    private RoadService roadService;

    @Autowired
    private UserService userService;

    /**
     * 访问用户输入界面
     */
    @GetMapping("/toInput")
    public String input(Map<String, Object> map) {

        /**
         * 实现编号自增
         */
        List<RegularSmooth> regularSmoothList = regularSmoothService.loadAll();
        RegularSmooth new_smooth = new RegularSmooth(), regularSmooth = regularSmoothList.get(regularSmoothList.size() - 1);
        new_smooth.setSmooth_no("" + (Integer.parseInt(regularSmooth.getSmooth_no()) + 1));

        map.put("roadNameList", roadService.loadAll());

        map.put("userNameList", userService.loadAll());

        map.put("regularSmooth", new_smooth);

        return "regularSmooth/input_regularSmooth";
    }

    /**
     * 创建新用户
     */
    @PostMapping(value = "/create")
    public String create(RegularSmooth regularSmooth) {

        regularSmoothService.addRegularSmooth(regularSmooth);

        return "redirect:/regularSmooth/list";

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
        List<RegularSmooth> regularSmoothList = regularSmoothService.loadDistinct();

        PageInfo<RegularSmooth> page = new PageInfo<>(regularSmoothList);

        map.put("page", page);

        return "regularSmooth/list_regularSmooth";
    }

    @GetMapping(value = "/remove/{regularSmoothNo}")
    public String remove(@PathVariable("regularSmoothNo") Integer regularSmoothNo) {

        regularSmoothService.removeRegularSmooth(regularSmoothNo);
        return "redirect:/regularSmooth/list";
    }

    @GetMapping(value = "/removeByRoad/{roadName}")
    public String remove(@PathVariable("roadName") String roadName) {

        List<RegularSmooth> regularSmoothList = regularSmoothService.loadAll();
        for (RegularSmooth each : regularSmoothList) {
            if (each.getRoad_name().equals(roadName))
                regularSmoothService.removeRegularSmooth(Integer.parseInt(each.getSmooth_no()));
        }
        return "redirect:/regularSmooth/list";
    }

    @GetMapping(value = "/preUpdate/{regularSmoothNo}")
    public String preUpdate(@PathVariable("regularSmoothNo") Integer regularSmoothNo, Map<String, Object> map) {
        System.out.println(regularSmoothService.getRegularSmoothById(regularSmoothNo));
        map.put("regularSmooth", regularSmoothService.getRegularSmoothById(regularSmoothNo));

        return "regularSmooth/update_regularSmooth";
    }

    @RequestMapping(value = "/update")
    public String update(RegularSmooth regularSmooth) {

        regularSmoothService.updateRegularSmooth(regularSmooth);
        return "redirect:/regularSmooth/list";
    }

    @GetMapping(value = "/info/{regularSmoothNo}")
    public String info(@PathVariable("regularSmoothNo") Integer regularSmoothNo, Map<String, Object> map) {
        System.out.println("info" + regularSmoothService.getRegularSmoothById(regularSmoothNo));


        map.put("roadNameList", roadService.loadAll());

        map.put("userNameList", userService.loadAll());

        map.put("regularSmooth", regularSmoothService.getRegularSmoothById(regularSmoothNo));

        return "regularSmooth/info_regularSmooth";
    }

    @GetMapping("/listAll/{regularSmoothNo}")
    public String listAll(@PathVariable("regularSmoothNo") Integer regularSmoothNo, Map<String, Object> map, @RequestParam(value = "pageNo", required = false, defaultValue = "1") String pageNoStr) {

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
        String key_name = regularSmoothService.getRegularSmoothById(regularSmoothNo).getRoad_name();
        RegularSmooth regularSmooth = new RegularSmooth();
        regularSmooth.setRoad_name(key_name);

        List<RegularSmooth> regularSmoothList = regularSmoothService.select(regularSmooth);
        PageInfo<RegularSmooth> page = new PageInfo<>(regularSmoothList);

        map.put("page", page);
        map.put("road_name", key_name);

        return "regularSmooth/listAll_regularSmooth";
    }

}
