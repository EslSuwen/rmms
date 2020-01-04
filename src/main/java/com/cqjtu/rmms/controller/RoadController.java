package com.cqjtu.rmms.controller;

import com.cqjtu.rmms.entity.Road;
import com.cqjtu.rmms.service.RoadService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/road")
public class RoadController {

    @Autowired
    private RoadService roadService;

    /**
     * 访问用户输入界面
     */
    @GetMapping("/toInput")
    public String input(Map<String, Object> map) {

        /**
         * 实现编号自增
         */
        List<Road> roadList = roadService.loadAll();
        Road road = roadList.get(roadList.size() - 1);
        road.setRoad_id("" + (Integer.parseInt(road.getRoad_id()) + 1));

        map.put("road", road);

        return "road/input_road";
    }

    /**
     * 创建新用户
     */
    @PostMapping(value = "/create")
    public String create(Road road) {

        roadService.addRoad(road);

        return "redirect:/road/list";

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
        List<Road> roadList = roadService.loadAll();

        PageInfo<Road> page = new PageInfo<>(roadList);

        map.put("page", page);

        return "road/list_road";
    }

    @GetMapping(value = "/remove/{road_id}")
    public String remove(@PathVariable("road_id") Integer road_id) {

        roadService.removeRoad(road_id);
        return "redirect:/road/list";
    }

    @GetMapping(value = "/preUpdate/{road_id}")
    public String preUpdate(@PathVariable("road_id") Integer road_id, Map<String, Object> map) {
        System.out.println(roadService.getRoadById(road_id));
        map.put("road", roadService.getRoadById(road_id));

        return "road/update_road";
    }

    @GetMapping(value = "/info/{road_id}")
    public String info(@PathVariable("road_id") Integer road_id, Map<String, Object> map) {
        System.out.println("info" + roadService.getRoadById(road_id));
        map.put("road", roadService.getRoadById(road_id));

        return "road/info_road";
    }

    @GetMapping(value = "/map/{road_id}")
    public String map(@PathVariable("road_id") Integer road_id, Map<String, Object> map) {
        System.out.println(roadService.getRoadById(road_id));
        map.put("road", roadService.getRoadById(road_id));

        return "road/map_road";
    }

    @PostMapping(value = "/update")
    public String update(Road road) {

        roadService.updateRoad(road);
        return "redirect:/road/list";
    }
}
