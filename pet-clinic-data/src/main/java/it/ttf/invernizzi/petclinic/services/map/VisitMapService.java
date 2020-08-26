package it.ttf.invernizzi.petclinic.services.map;

import it.ttf.invernizzi.petclinic.model.Visit;
import it.ttf.invernizzi.petclinic.services.VisitService;

import java.util.Set;

public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findall() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteByID(aLong);
    }

    @Override
    public void delete(Visit obj) {
        super.delete(obj);
    }

    @Override
    public Visit save(Visit visit) {

        if(visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null)
            throw new RuntimeException("Invalid visit");

        return super.save(visit);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}