package com.ruoyi.web.controller.locker.controller;

import com.ruoyi.common.core.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/locker/receive")
public class LocReceiveController extends BaseController {
    private String prefix = "locker/index";

    @GetMapping()
    public String index(){ return prefix + "/receive"; }
}
