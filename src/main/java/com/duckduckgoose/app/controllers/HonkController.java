package com.duckduckgoose.app.controllers;

import com.duckduckgoose.app.models.database.Honk;
import com.duckduckgoose.app.models.database.Member;
import com.duckduckgoose.app.models.request.HonkRequest;
import com.duckduckgoose.app.models.view.HonksViewModel;
import com.duckduckgoose.app.services.HonkService;
import com.duckduckgoose.app.util.AuthHelper;
import com.duckduckgoose.app.util.PaginationHelper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HonkController {

    private final HonkService honkService;

    @Autowired
    public HonkController(HonkService honkService) {
        this.honkService = honkService;
    }

}
