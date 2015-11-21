package controller;

import model.Arm;
import model.Cafe;
import model.Tables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.ArmService;
import service.CafeServiceInterface;
import service.TableService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class CafeController {
    @Autowired
    CafeServiceInterface cafeService;

    @Autowired
    ArmService armService;

    @Autowired
    TableService tableService;

    @RequestMapping("/cafe/{id}/add/arm/")
    public String getCafeById(@PathVariable Long id) {
        Arm arm = new Arm();
        arm.setPhone("79656047821");
        arm.setDateStart(new Date(115, 11, 21, 9, 0));
        arm.setDateEnd(new Date(115, 11, 21, 12, 0));
        arm.setCountOfSits(2);

        Cafe cafe = cafeService.getCafeById(id);
        if (tableService.getTablesByCountOfSits(cafe.getTables(), arm.getCountOfSits()).size() > 0) {
            for (Tables tables : cafe.getTables()) {
                if (armService.isEmptyByDate(tables, arm.getDateStart(), arm.getDateEnd())) {
                    arm.setTable(tables);
                    tables.getArmList().add(arm);
                }
            }

        }
        cafeService.editInfo(cafe);

        return "index";
    }

    @RequestMapping("/cafe/{id}/add/table/")
    public String addTable(@PathVariable Long id) {

        Cafe cafe = cafeService.getCafeById(id);
        List<Tables> list = new ArrayList<>();

        Tables tableOne = new Tables();
        tableOne.setIsEmpty(true);
        tableOne.setCafe(cafe);
        tableOne.setNumOfSits(5);

        Tables tableTwo = new Tables();
        tableTwo.setIsEmpty(true);
        tableTwo.setCafe(cafe);
        tableTwo.setNumOfSits(2);

        list.add(tableOne);
        list.add(tableTwo);

        cafe.setTables(list);

        cafeService.editInfo(cafe);


        return "index";
    }
}