/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverwofacade;

/**
 *
 * @author amam
 */
public class ScheduleServerFacade {
    private static ScheduleServerFacade FacadeObj = null;
    private ScheduleServerFacade(){}
    private ScheduleServer obj = new ScheduleServer();
    public static ScheduleServerFacade getScheduleServerFacadeObject(){
        if(FacadeObj == null){
            FacadeObj = new ScheduleServerFacade();
        }
        return FacadeObj;
    }
    public void startServer(){
        obj.startBooting();
        obj.readSystemConfigFile();
        obj.init();
        obj.initializeContext();
        obj.initializeListeners();
        obj.createSystemObjects();
    }
    public void stopServer(){
        obj.releaseProcesses();
        obj.destory();
        obj.destroySystemObjects();
        obj.destoryListeners();
        obj.destoryContext();
        obj.shutdown();
    }
}
