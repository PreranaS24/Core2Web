//Program to plan vacation at Tour Planner ,plan as per Budget.
//
//

class VacationPlan{

	public static void main(String[] args){

	int Budget = 45000;
	String Destination = "Thailand";
	String Location = "Onsite";
	String Option = "Beach";

	if (Budget < 50000 ) {
		if(((Budget <= 50000) && (Budget >= 45000)) && ((Location == "Within India") && (Option == "Hill Station")))

			        System.out.println("Vacation can be planned at Jammu Kashmir which costs Rs 48000/person for 3N/4D");

		else if(((Budget >= 40000) && (Budget <= 45000)) && ((Location == "Within India") && (Option == "Hill Station")))

			        System.out.println("Vacation can be planned at Kullu Valley which costs Rs 42000/person for 3N/4D");

		else if(((Budget >= 35000) && (Budget <= 40000)) && ((Location == "Within India") && (Option == "Hill Station")))

			        System.out.println("Vacation can be planned at Darjiling which costs Rs 39500/person for 3N/4D");
           

		else if((Budget <= 50000) && (Budget >= 45000) && (Location == "Within India") && (Option == "Beach"))

			        System.out.println("Vacation can be planned at Kerala which costs Rs 47500/person for 5N/6D");

		else if((Budget >= 40000) && (Budget <= 45000) && (Location == "Within India") && (Option == "Beach"))

			        System.out.println("Vacation can be planned at Gokarn and Goa which costs Rs 41000/person for 6N/7D");

		else if((Budget >= 35000) && (Budget <= 40000) && (Location == "Within India") && (Option == "Beach"))

			        System.out.println("Vacation can be planned at Konkan (Alibaug to Tarkarli) which costs Rs 37000/person for 8N/9D");
           

		else if((Budget <= 50000) && (Budget >= 45000) && (Location == "Onsite") && (Option == "Beach"))

			        System.out.println("Vacation can be planned at Thailand which costs Rs 45000/person for 3N/4D");

		else if((Budget >= 40000) && (Budget <= 45000) && (Location == "Onsite") && (Option == "Beach"))

			        System.out.println("Vacation can be planned at Pataya which costs Rs 41000/person for 3N/4D");

		else if((Budget <= 30000) && (Budget >= 20000) && (Location == "Onsite") && (Option == "HillStation"))

			        System.out.println("Vacation can be planned at Bhutan which costs Rs 28000/person for 5N/6D");

		else if((Budget >= 10000) && (Budget <= 20000) && (Location == "Onsite") && (Option == "Hill Station"))

			        System.out.println("Vacation can be planned at Nepal which costs Rs 18000/person for 2N/3D");


	}
	}

      }
