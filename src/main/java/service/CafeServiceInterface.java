package service;

import model.Cafe;

/**
 * Created by mikl on 21.11.2015.
 */
public interface CafeServiceInterface {
    public Cafe getCafeById(Long id);

    public void editInfo(Cafe cafe);
}
