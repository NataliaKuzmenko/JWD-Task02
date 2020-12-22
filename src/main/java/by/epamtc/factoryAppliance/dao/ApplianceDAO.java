package by.epamtc.factoryAppliance.dao;

import by.epamtc.factoryAppliance.entity.Appliance;
import by.epamtc.factoryAppliance.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceDAO {
    List<Appliance> find(Criteria criteria) throws IOException;
}
