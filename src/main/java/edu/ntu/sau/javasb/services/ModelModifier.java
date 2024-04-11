package edu.ntu.sau.javasb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelModifier {

    static public int storage = 1;

    @Autowired
    ModelCreator modelCreator;

    public String getSomeData() {
        return  "pi = 3.14";
    }

    public void updateStorage(int storageValue){
        storage = storageValue;
    }

    public int getModifiedStorage(){
        return storage * 2;
    }
}
