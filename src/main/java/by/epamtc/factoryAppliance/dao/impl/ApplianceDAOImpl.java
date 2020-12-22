package by.epamtc.factoryAppliance.dao.impl;

import by.epamtc.factoryAppliance.dao.ApplianceDAO;
import by.epamtc.factoryAppliance.dao.ApplianceParser;
import by.epamtc.factoryAppliance.dao.ApplianceReader;
import by.epamtc.factoryAppliance.entity.Appliance;
import by.epamtc.factoryAppliance.entity.criteria.Criteria;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public List<Appliance> find(Criteria criteria) throws IOException {
        ApplianceReader applianceReader = new ApplianceReader();
        List<String> listAppliance = applianceReader.getData("appliances_db");

        Iterator<String> listApplianceIterator = listAppliance.iterator();
        String dataAboutAppliance;
        List<String> parsedData;
        List<String> parseParameterAppliance;
        ApplianceParser applianceParser = new ApplianceParser();
        Appliance appliance = new Appliance();
        List<Appliance> createdAppliance = new ArrayList<Appliance>();

        while (listApplianceIterator.hasNext()) {
            dataAboutAppliance = listApplianceIterator.next();
            parsedData = applianceParser.parse(dataAboutAppliance);
            parseParameterAppliance = applianceParser.parseParameter(dataAboutAppliance);
            appliance.create(parseParameterAppliance);
            if (appliance != null) {
                createdAppliance.add(appliance);
            }

        }
        return createdAppliance;
    }
}
