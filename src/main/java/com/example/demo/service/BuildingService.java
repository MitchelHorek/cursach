package com.example.demo.service;

import com.example.demo.*;
import com.example.demo.model.Building;
import com.example.demo.repository.BuildingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;
//to doo аннотация транзакция
@Service
@Transactional
@Slf4j
public class BuildingService implements IBuildingService {
    @Autowired
    private EmailService emailService;
    @Autowired
    private BuildingRepository buildingRepository;
    @PersistenceContext
    private EntityManager entityManager;

    public Iterable<Building> findAll() {
        log.info("findAll");
        return buildingRepository.findAll();
    }

    public void save(Building building) {
        emailService.send("oulina@mail.ru","popitka1","Я сделала 21 практику");
        log.info("save");
        buildingRepository.save(building);
    }

    public void buildingDelete(Building building) {
        try {
            for (Building building1 : buildingRepository.findAll()) {
                if (building.getCreationDate().equals(building1.getCreationDate()) && building.getType() == building1.getType()) {
                    buildingRepository.delete(building1);
                    break;
                }
            }
        }catch(Exception exc){
            log.error("delete error");
        }
    }



    public List<Building> filterCreationDate(String creationDate) {
        log.info("filterCreationDate");
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Building> buildingCriteriaQuery = builder.createQuery(Building.class);
        Root<Building> root = buildingCriteriaQuery.from(Building.class);
        buildingCriteriaQuery.select(root).where(builder.equal(root.get("creationDate"),creationDate));
        TypedQuery<Building> query = entityManager.createQuery(buildingCriteriaQuery);
        return query.getResultList();
    }

    public List<Building> filterType(String type) {
        log.info("filterType");
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Building> buildingCriteriaQuery = builder.createQuery(Building.class);
        Root<Building> root = buildingCriteriaQuery.from(Building.class);
        buildingCriteriaQuery.select(root).where(builder.equal(root.get("type"), TypeRole.valueOf(type)));
        TypedQuery<Building> query = entityManager.createQuery(buildingCriteriaQuery);
        return query.getResultList();
    }
}
