package guipoject;

import java.util.Date ;
public class Ticket 
{
   
    private long entryId;
    private String plateNumber;
    private Date Timedate;

    public Ticket(long entryId, String plateNumber, Date Timedate) {
        this.entryId = entryId;
        this.plateNumber = plateNumber;
        this.Timedate = Timedate;
    }
    
    public void setEntryId(long  entryId)
    {
        this.entryId = entryId ;
    }
    
    public void setplateNumber(String plateNumber)
    {
        this.plateNumber = plateNumber  ;
    }
    
    public void setTimeDate(Date Timedate)
    {
        this.Timedate = Timedate;
    }
    

    public long getEntryId() 
    { 
        return entryId;
    }
    public String getPlateNumber() 
    { 
        return plateNumber;
    }
    public Date getDateTime() 
    { 
        return Timedate;
    }
}
