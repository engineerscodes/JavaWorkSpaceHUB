package org.engineerscodes.app;

sealed interface allowed permits Car,Bike{ }

public interface DataLake {


    void sendMsg(allowed obj);

}