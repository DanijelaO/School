/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

/**
 *
 * @author logos
 */
public class Computer {
    private String operatingSystem;
    private float processTact;
    private float memory;
    private int hardDrive;
    
    
    public void setOperatingSystem(String os) {
        this.operatingSystem = os;
    }
    
    public void setProcessTact(float tact) {
        this.processTact = tact;
    }
    
    public void setMemory(float mem) {
        this.memory = mem;
    }
    
    public void setHardDrive(int hdd) {
        this.hardDrive = hdd;
    }
    
    
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    
    public float getProcessTact() {
        return this.processTact;
    }
    
    public float getMemory() {
        return this.memory;
    }
    
    public int getHardDrive() {
        return this.hardDrive;
    }
    
    public Computer() {
        this.hardDrive = 0;
        this.memory = 0;
        this.operatingSystem = "";
        this.processTact = 0;
    }
    
    public Computer(String os, float mem, int hdd, float tact) {
        this.hardDrive = hdd;
        this.memory = mem;
        this.operatingSystem = os;
        this.processTact = tact;
    }
    
}
