package service;

import model.Tables;

import java.util.Date;

/**
 * Created by mikl on 21.11.2015.
 */
public interface ArmService {
    boolean isEmptyByDate(Tables table,Date dateStart, Date dateEnd);
}
