package by.epamtc.factoryAppliance.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ApplianceParser {
    public List<String> parse(String data) {
        List<String> parsedData = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(data, " :,\t=");
        while (tokenizer.hasMoreTokens()) {
            parsedData.add(tokenizer.nextToken());
        }
        return parsedData;
    }
    public List<String> parseParameter(String data) {
        List<String> parseParameter = new ArrayList<>();
        List<String> tmp = parse(data);
        for (int i = 0; i < tmp.size(); i++) {
            if (i % 2 == 0) {
                parseParameter.add(tmp.get(i));
            }
        }
        return parseParameter;
    }

}
