package controller;

import model.Arm;
import model.Cafe;
import model.Tables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ArmService;
import service.CafeServiceInterface;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class CafeController {
    @Autowired
    CafeServiceInterface cafeService;

    @Autowired
    ArmService armService;

    @RequestMapping("/cafe/get/{id}")
    public String getCafeById(@PathVariable Long id) {
        Cafe cafe = cafeService.getCafeById(id);
        Tables tables = new Tables();
        tables.setNumOfSits(1);
        tables.setIsEmpty(false);

        Arm arm = new Arm();
        arm.setDateStart(new Date(2015, 11, 21, 10, 0));
        arm.setDateEnd(new Date(2015, 11, 21, 12, 0));
        arm.setPhone("+79656047821");
        List<Arm> listArm = new ArrayList<>();
        listArm.add(arm);

        tables.setArmList(listArm);
        cafe.getTables().add(tables);
        cafeService.editInfo(cafe);

        Boolean bol = armService.isEmptyByDate(
                cafe.getTables().get(0),
                new Date(2015, 11, 21, 10, 0),
                new Date(2015, 11, 21, 12, 0)
        );
        return "index";
    }
}
