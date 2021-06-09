package P1;


import  
java.util.*; public  
class BonBon {  

public static void main(String[] args) {  

Scanner sc = new Scanner(System.in);  

System.out.print("Enter the advertisement id");   int id = sc.nextInt();  

System.out.print("Enter the priority(high, medium, low)");   String priority = sc.next();  

System.out.print("Enter the no of days advertisement is published");   int num = sc.nextInt();  


System.out.print("Enter the client name:");   String name = sc.nextLine();  
sc.nextLine();  

System.out.print("Enter the type of Advertisement  (video/image/text)");  
String type = sc.next();  

if(type.equalsIgnoreCase("video")) {  
System.out.println("Enter the duration in minutes");   int min = sc.nextInt();  
VideoAdvertisement obj = new VideoAdvertisement(id,  priority, num, name, min);  
System.out.print("Enter the base cost");   float base = sc.nextFloat();  
System.out.print
("The Advertisement cost is " +  obj.calculateAdvertisementCharge(base));  
}  
else if(type.equalsIgnoreCase("image")) {  
System.out.println("Enter the number of inches");   int inc = sc.nextInt();  
VideoAdvertisement obj = new VideoAdvertisement(id,  priority, num, name, inc);  
System.out.println("Enter the base cost");   float base1 = sc.nextFloat();  
System.out.println("The Advertisement cost is " +  obj.calculateAdvertisementCharge(base1)); 
}  
else if(type.equalsIgnoreCase("text")) {  
System.out.println("Enter the number of characters");   int text = sc.nextInt();  
VideoAdvertisement obj = new VideoAdvertisement(id,  priority, num, name, text);  
System.out.println("Enter the base cost");   float base2 = sc.nextFloat();  
System.out.println("The Advertisement cost is " +  obj.calculateAdvertisementCharge(base2));  
}  
}  
}  

