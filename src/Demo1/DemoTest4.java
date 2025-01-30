package Demo1;

public class DemoTest4 {

	public static void main (String args []) {
	
	char group = 'I';
	String team1 = "";
	String team2 = "";
	String team3 = "";
	String team4 = "";
	boolean isGroupExist = true;
	
	if(group == 'A' ) {
	 team1 = "Netherland";
	 team2 = "Senegal";
	 team3 = "Ecuador";
	 team4 = "Qatar";
	}else if (group == 'B') {
	 team1 = "England"; 
	 team2 = "UnitedStates";
	 team3 = "Iran";
	 team4 = "Wales"; 
} else if (group == 'C') {
     team1 = "Argentina"; 
	 team2 = "Poland"; 
	 team3 = "Mexico"; 
	 team4 = "SaudiArabia";
} else if (group == 'D') {
	 team1 = "France"; 
	 team2 = "Australia";
	 team3 = "Tunisia";
	 team4 = "Denmark";
}else if (group == 'E') {		
	 team1 = "Japan";
	 team2 = "Spain";
	 team3 = "Germany";
	 team4 = "CostaRica";
}else if (group == 'F') {
	 team1 = "Moroco";
	 team2 = "Croatia";
	 team3 = "Belguim";
	 team4 = "Canada";
}else if (group == 'G') {
	 team1 = "Brazil";
	 team2 = "Switzerland";
	 team3 = "Cameroon";
	 team4 = "Serbia";
}else if (group == 'H') {
	 team1 = "Portugal";
	 team2= "SouthKorea";
	 team3 = "Uruguay";
	 team4 = "Ghana";
	 
}
	
	// we need to write a condition
	if (isGroupExist == true) {
	System.out.println("************GROUP***********");
	System.out.println(team1);
	System.out.println(team2);
	System.out.println(team3);
	System.out.println(team4);
	
	}else {
		System.out.println("GROUP " + group + "is not part of world Cup Table. " );
		System.out.println("Is Group" + group + "Exits:" + isGroupExist);
	} 	

             int x = 10;
	     int y = 40;

		if(x > y){
			System.out.println("Greater");
		}else{
			System.out.println("Less");

		}

}
	
}
