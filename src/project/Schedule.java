package project;

import java.util.HashMap;

public class Schedule{
    HashMap<String,Boolean> monday=new HashMap<String,Boolean>();
    HashMap<String,Boolean> tuesday=new HashMap<String,Boolean>();
    HashMap<String,Boolean> wednesday=new HashMap<String,Boolean>();
    HashMap<String,Boolean> thursday=new HashMap<String,Boolean>();
    HashMap<String,Boolean> friday=new HashMap<String,Boolean>();
    HashMap<String,Boolean> saturday=new HashMap<String,Boolean>();
    public HashMap<String,Boolean> createMSchedule()
    {	
 	   	monday.put("ds",null);
    		monday.put("java",null);
    		return monday;
    }
    public HashMap<String,Boolean> createTUSchedule()
    {	tuesday.put("ds",null);
    		tuesday.put("python",null);
    		return tuesday;
    }
    public HashMap<String,Boolean> createWSchedule()
    {	wednesday.put("java",null);
    		wednesday.put("ds",null);
    		return wednesday;
    }	
    public HashMap<String,Boolean> createTHSchedule()
    {	thursday.put("java",null );
    		thursday.put("python",null);
    		return thursday;
    }
    public HashMap<String,Boolean> createFSchedule()
    {	friday.put("python",null);
    		friday.put("ds",null);
    		return friday;
    }
    public HashMap<String,Boolean> createSSchedule()
    {	saturday.put("python",null);
    		saturday.put("java",null);
    		return saturday;
    }	
}