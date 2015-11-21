package service.impl;

import model.Arm;
import model.Tables;
import org.springframework.stereotype.Service;
import service.ArmService;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class ArmServiceImpl implements ArmService {
    @Override
    public boolean isEmptyByDate(Tables table, Date dateStart, Date dateEnd) {
        for (Arm arm : table.getArmList()) {
            if (arm.getDateEnd() != null) {
                if (dateStart.getTime() >= arm.getDateStart().getTime() &&
                        dateStart.getTime() <= arm.getDateEnd().getTime()) {
                    return false;
                }
                if (dateEnd.getTime() >= arm.getDateStart().getTime() &&
                        dateEnd.getTime() <= arm.getDateEnd().getTime()) {
                    return false;
                }
                if (dateStart.getTime() <= arm.getDateStart().getTime() &&
                        dateEnd.getTime() >= arm.getDateEnd().getTime()) {
                    return false;
                }
            } else {
                if (dateStart.getTime() >= arm.getDateStart().getTime()) {
                    return false;
                }
                if (dateEnd.getTime() >= arm.getDateStart().getTime()) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }
}
