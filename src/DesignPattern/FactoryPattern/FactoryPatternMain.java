package DesignPattern.FactoryPattern;

import DesignPattern.FactoryPattern.Factory.StringCreator;
import DesignPattern.FactoryPattern.Model.Transport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

public class FactoryPatternMain {
    public static void main(String[] args) {
        String s = "truck \n ship \n truck \n";
        try (BufferedReader stringReader = new BufferedReader(new StringReader(s))) {
            String line = stringReader.readLine();
            ArrayList<Transport> list = new ArrayList<>();
            StringCreator creator = new StringCreator();
            while (line != null) {
                Transport transport = creator.createTransport(line.trim());
                list.add(transport);
                line = stringReader.readLine();

            }
            list.forEach(Transport::deliver);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
