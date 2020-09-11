package student.hackthon.team15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import student.hackthon.team15.entity.IncomeEntity;
import student.hackthon.team15.service.IncomeService;

import java.util.List;

@Controller
@RequestMapping("/income")
public class IncomeController {
    @Autowired
    IncomeService incomeService;

    @GetMapping(value="/details", produces={"application/json","application/xml"})
    public List<IncomeEntity> getAllIncomes() {
        return incomeService.getIncomesList();
    }
}
