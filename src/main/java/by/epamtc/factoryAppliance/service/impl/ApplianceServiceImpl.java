package by.epamtc.factoryAppliance.service.impl;

import by.epamtc.factoryAppliance.dao.ApplianceDAO;
import by.epamtc.factoryAppliance.dao.DAOFactory;
import by.epamtc.factoryAppliance.entity.Appliance;
import by.epamtc.factoryAppliance.entity.criteria.Criteria;
import by.epamtc.factoryAppliance.service.ApplianceService;
import by.epamtc.factoryAppliance.service.validation.Validator;

import java.io.IOException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{

    @Override
    public List<Appliance> find(Criteria criteria) throws IOException {
        if (!Validator.criteriaValidator(criteria)) {
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        List<Appliance> appliance = applianceDAO.find(criteria);

        // you may add your own code here

        return appliance;
    }

}

//you may add your own new classes
