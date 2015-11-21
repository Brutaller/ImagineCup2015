package service;

import model.Cafe;

public interface CafeServiceInterface {
    public Cafe getCafeById(Long id);

    public void editInfo(Cafe cafe);
}
