package com.cqjtu.rmms.controller;

import com.cqjtu.rmms.entity.RegularSmooth;
import com.cqjtu.rmms.service.RegularSmoothService;
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

    /**
     * 访问用户输入界面
     */
    @GetMapping("/toInput")
    public String input(Map<String, Object> map) {
        map.put("regularSmooth", new RegularSmooth());

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
        PageHelper.startPage(pageNo, 4);
        List<RegularSmooth> regularSmoothList=regularSmoothService.loadAll();

        PageInfo<RegularSmooth> page = new PageInfo<>(regularSmoothList);

        map.put("page", page);

        return "regularSmooth/list_regularSmooth";
    }

    @GetMapping(value = "/remove/{regularSmoothNo}")
    public String remove(@PathVariable("regularSmoothNo") Integer regularSmoothNo) {

        regularSmoothService.removeRegularSmooth(regularSmoothNo);
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
}
