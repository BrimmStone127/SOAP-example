import service.*;

public class Test{
   public static void main(String[] args){
      LAMService serve = new LAMService();
      
      String init = serve.initialize();
      System.out.println(init);
      
      String allAppts = serve.getAllAppointments();
      System.out.println(allAppts);
      
      String appt = serve.getAppointment("720");
      System.out.println(appt);
      
      String inputXML =  "<?xml version='1.0' encoding='utf-8' standalone='no'?><appointment><date>2018-12-28</date><time>10:00:00</time><patientId>220</patientId><physicianId>20</physicianId><pscId>520</pscId><phlebotomistId>110</phlebotomistId><labTests><test id='86900' dxcode='292.9' /><test id='86609' dxcode='307.3' /></labTests></appointment>";
      String newAppt = serve.addAppointment(inputXML);
      System.out.println(newAppt);

   }
}
<?xml version='1.0' encoding='utf-8' standalone='no'?><appointment><date>2018-12-28</date><time>10:00:00</time><patientId>220</patientId><physicianId>20</physicianId><pscId>520</pscId><phlebotomistId>110</phlebotomistId><labTests><test id='86900' dxcode='292.9' /><test id='86609' dxcode='307.3' /></labTests></appointment>
