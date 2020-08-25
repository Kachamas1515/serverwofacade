/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverwofacade;

/**
 *
 * @author sarun
 */
public class ScheduleServer {

    private static ScheduleServer Serverobj = null;

    private ScheduleServer() {
    }

    public static ScheduleServer getScheduleServerObject() {
        if (Serverobj == null) {
            Serverobj = new ScheduleServer();
        }
        return Serverobj;
    }

    public void startBooting() {
        startBooting obj = new startBooting();
        obj.startBootingFunc();
    }

    public void readSystemConfigFile() {
        readSystemConfigFile obj = new readSystemConfigFile();
        obj.readSystemConfigFileFunc();
    }

    public void init() {
        init obj = new init();
        obj.initFunc();
    }

    public void initializeContext() {
        initializeContext obj = new initializeContext();
        obj.initializeContextFunc();
    }

    public void initializeListeners() {
        initializeListeners obj = new initializeListeners();
        obj.initializeListenersFunc();
    }

    public void createSystemObjects() {
        createSystemObjects obj = new createSystemObjects();
        obj.createSystemObjectsFunc();
    }

    public void releaseProcesses() {
        releaseProcesses obj = new releaseProcesses();
        obj.releaseProcessesFunc();
    }

    public void destory() {
        destory obj = new destory();
        obj.destoryFunc();
    }

    public void destroySystemObjects() {
        destroySystemObjects obj = new destroySystemObjects();
        obj.destroySystemObjectsFunc();
    }

    public void destoryListeners() {
        destoryListeners obj = new destoryListeners();
        obj.destoryListenersFunc();
    }

    public void destoryContext() {
        destoryContext obj = new destoryContext();
        obj.destoryContextFunc();
    }

    public void shutdown() {
        shutdown obj = new shutdown();
        obj.shutdownFunc();
    }
}
