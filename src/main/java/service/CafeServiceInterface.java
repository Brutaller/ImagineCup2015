package service;

import model.Cafe;

public interface CafeServiceInterface {
    public Object getCafeById(Long id);

    public void editInfo(Cafe cafe);
}
