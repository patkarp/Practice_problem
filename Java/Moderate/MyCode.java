// Sample Data:
import java.util.*;

  class MyCode {

      /**
        * ---------- Compliance Framework Assessment ------------
        *
        * A IT Compliance Framework is a set of rules imposed by a regulatory
        * body. These frameworks ensure companies uphold certain standards of
        * data privacy and information security. (Think encrypting personal
        * health data, financial information, etc) Within a framework there are
        * hundreds of Framework Requirements. If a company complies with, for
        * example, 200 of 500 total Framework Requirements of a particular
        * framework, we can say they are 40% compliant.
        *
        * Implement a function assessCompliance(framework,
        * allCompliantRequirementIds)
        *
        * @param {Object} framework - A specific framework, containing a list
        * of all requirements within that framework.
        * @param {Array.<string>} allCompliantRequirementIds - A list of IDs
        * for all the requirements that the company is compliant to.
        * @returns {number} - a point value (eg 0.25) representing the
        * percentage of the framework requirements met by
        * allCompliantRequirementIds
        *
        */
      static class Framework {

          String name;
          List<Requirement> requirements;

          public Framework(String name, List<Requirement> requirements) {
              this.name = name;
              this.requirements = requirements;
          }

          public String getName() {
              return name;
          }

          public List<Requirement> getRequirements() {
              return requirements;
          }

          @Override
          public String toString() {
              return "Framework {"
                      + " name = " + name
                      + ", requirements = " + requirements
                      + " }";
          }
      }

      static class Requirement {

          String id;
          String description;

          public Requirement(String id, String description) {
              this.id = id;
              this.description = description;
          }

          public String getId() {
              return id;
          }

          public String getDescription() {
              return description;
          }

          @Override
          public String toString() {
              return "Requirement {"
                      + " id = " + id 
                      + ", description = " + description
                      + " }";
          }
      }
      public void assessCompliance(Framework framework,  List<String> allCompliantRequirementIds){
        HashMap<String,String> requirements = new HashMap<String, String>();
        
        int complaintCounter=0; //This flag will increment every time we find complaince matching requirement
        //System.out.println(framework);

        /* We are going to avoid List conversion to Hashmap, as it is not neccessary, We can directly iterate over the list.
        for(Map.Entry <String, String> me:framework.getRequirements());
        {
          requirements.put(me.getKey(),me.getValue());
        }*/
        for(Requirement req : framework.getRequirements()) {
            if (allCompliantRequirementIds.contains(req.getId())) {
                complaintCounter++;
            }
        }
        
        // //Check if it is compliants
        // //flag=2 length of requirement is 4
        int requirement=framework.getRequirements().size();
        float percentage= complaintCounter*100/requirement;
        System.out.println("The Company is "+ percentage+ " Complaint");
        
        
        
      }
      public static void main(String[] args) {
          List<Requirement> requirements = List.of(
                  new Requirement("pci-1", "CVV numbers are not stored"),
                  new Requirement("pci-2", "CC numbers are salted and hashed"),
                  new Requirement("pci-3", "Databases are only accessed by explicitly authorized users"),
                  new Requirement("pci-4", "Messages containing card info are always encrypted")
          );

          Framework framework = new Framework("Payment Card Industry Data Security Standard", requirements);
          List<String> allCompliantRequirementIds = List.of("pci-1", "gdpr-1", "soc-2", "hipaa-1", "pci-3");
          MyCode m1 =new MyCode();//initializing object for MyCode Class to call assesscompliance functions
          // You can call the assessCompliance method here with the sample data
          m1.assessCompliance(framework, allCompliantRequirementIds);
          
          //System.out.println(framework);
          //System.out.println(allCompliantRequirementIds);
      }
  }