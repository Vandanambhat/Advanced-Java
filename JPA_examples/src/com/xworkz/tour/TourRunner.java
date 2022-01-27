package com.xworkz.tour;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.tour.dao.TourDAO;
import com.xworkz.tour.dao.TourDAOImpl;
import com.xworkz.tour.entity.TourEntity;

public class TourRunner {

	public static void main(String[] args) {

		List<TourEntity> tourEntities = new ArrayList<TourEntity>();
		// TourEntity(int id, String location, float sealevel, String famousFor, double
		// entryFees, String season)
		tourEntities.add(new TourEntity(1, "Switzerland", 4000, "mountain", 50000d, "Winter"));
		tourEntities.add(new TourEntity(2, "Singapore", 3000, "Food", 4000d, "Summer"));
		tourEntities.add(new TourEntity(3, "Shimoga", 2000, "Jog Falls", 150d, "Rainy"));
		tourEntities.add(new TourEntity(4, "Mysore", 1000, "Palace", 200d, "Winter"));
		tourEntities.add(new TourEntity(5, "Ballary", 2499, "Fort", 4566d, "Winter"));
		tourEntities.add(new TourEntity(6, "Chitradurga", 560, "Kallina kote", 5770d, "Winter"));
		tourEntities.add(new TourEntity(7, "Dandeli", 3440, "Kalli river", 500d, "Rainy"));
		tourEntities.add(new TourEntity(8, "Gokarna", 450, "Om Beach", 5690d, "Winter"));
		tourEntities.add(new TourEntity(9, "Sirsi", 360, "Marikamba", 234970d, "Summer"));
		tourEntities.add(new TourEntity(10, "Rameshwaram", 2499, "Temple", 0, "Summer"));
		tourEntities.add(new TourEntity(11, "Kanyakumari", 6778, "Vivekananda Statue", 0, "Rainy"));
		tourEntities.add(new TourEntity(12, "Dood Sagar", 1126, "Water Fall", 5690d, "Rainy"));
		tourEntities.add(new TourEntity(13, "Palani", 2611, "Murugan Temple", 175d, "Winter"));
		tourEntities.add(new TourEntity(14, "Ajantha", 1207, "Caves", 745d, "Winter"));
		tourEntities.add(new TourEntity(15, "Ellora", 2499, "Caves", 756d, "Winter"));
		tourEntities.add(new TourEntity(16, "Soneri Mahal", 2161, "Mahal", 896d, "Rainy"));
		tourEntities.add(new TourEntity(17, "Aurangabad-Panchakki", 3421, "temple", 875d, "Summer"));
		tourEntities.add(new TourEntity(18, "Aurangabad-KokanKada", 976, "Fort", 7576d, "Winter"));
		tourEntities.add(new TourEntity(19, "Aurangabad-Devagiri", 2611, "Fort", 5690d, "Winter"));
		tourEntities.add(new TourEntity(20, "Aurangabad-BibiMagBara", 334, "Monument", 200d, "Summer"));
		tourEntities.add(new TourEntity(21, "Aurangabad-Sardhar vallahbhayi Patel", 5690, "Monument", 5690d, "Rainy"));
		tourEntities.add(new TourEntity(22, "Aurangabad-Boudh Caves", 9274, "Caves", 755d, "Rainy"));
		tourEntities.add(new TourEntity(23, "Pune-Simha Gadh", 1126, "Fort", 758d, "Winter"));
		tourEntities.add(new TourEntity(24, "Pune-RayGad", 1323, "Fort", 23247d,"Winter"));
		tourEntities.add(new TourEntity(26, "Rajasthan", 2611, "Hawa Mahal", 9384d, "Rainy"));
		tourEntities.add(new TourEntity(27, "Hydrabad", 2161, "Char Minar", 38847d, "Summer"));
		tourEntities.add(new TourEntity(28, "wayanad", 1207, "camping and trekking trails", 32324d, "Winter"));
		tourEntities.add(new TourEntity(29, "Aurangabad-Gautala Autramghat", 1126, "Buddhist cave temples", 2421d, "Winter"));
		tourEntities.add(new TourEntity(30, "Shiradi", 1133, "Sai Baba Mandir", 2348d, "Winter"));
		tourEntities.add(new TourEntity(31, " Odisha", 2499, "Konark Sun Temple", 2482d, "Winter"));
		tourEntities.add(new TourEntity(32, "Delhi", 3411, "Qutb Minar", 3333d, "Winter"));
		tourEntities.add(new TourEntity(33, "jammu and kashmir", 0, "carpet weaving,shawls, basketry", 4444d, "Winter"));
		tourEntities.add(new TourEntity(34, "Panjab", 1111, "Golden Temple", 5555d, "Summer"));
		tourEntities.add(new TourEntity(35, "Amritsar", 1126, "wagah border", 6660d, "Summer"));
		tourEntities.add(new TourEntity(36, "Amritsar", 9998, "jallianwala bagh", 7770d, "Summer"));
		tourEntities.add(new TourEntity(37, "Mangalore", 1231, "Panambur Beach", 6666d, "Winter"));
		tourEntities.add(new TourEntity(38, "Mysore", 1145, "Chamundi Betta", 8880d, "Rainy"));
		tourEntities.add(new TourEntity(39, "Kundapur", 353, "Maravanthe", 8888d, "Summer"));
		tourEntities.add(new TourEntity(40, "Goa", 113, "Baga Beach and special beer", 9999d, "Summer"));// espescially for om sir and rakesh and ayyappa and thrishul
		tourEntities.add(new TourEntity(41, "Badami", 9998, "caves", 9990d, "Winter"));
		tourEntities.add(new TourEntity(42, "Baali", 1121, "Ice lands", 1111d, "Winter"));
		tourEntities.add(new TourEntity(43, "Thailand", 2611, "Snake spa", 222220, "Rainy"));
		tourEntities.add(new TourEntity(44, "Maldieves", 1122, "Ice lands", 1822876d, "Winter"));
		tourEntities.add(new TourEntity(45, "ukraine chernobyl", 2233, "worst nuclear disaster in history", 1243453d, "Rainy"));
		tourEntities.add(new TourEntity(46, "turkish", 2161, "turkish tea", 83763d, "Winter"));
		tourEntities.add(new TourEntity(47, "Germany", 1431, "Beer", 298738d, "Winter"));
		tourEntities.add(new TourEntity(48, "Greenland", 143, "vast tundra and immense glaciers", 8253746d, "Rainy"));
		tourEntities.add(new TourEntity(49, "afghanistan", 1207, "fine fruits", 234627d, "Winter"));
		tourEntities.add(new TourEntity(50, "venice", 383, "City of Canals", 4327687d, "Winter"));
		tourEntities.add(new TourEntity(51, ""
				+ ""
				+ "Nashik", 945, "Harihar fort ", 37672d, "Rainy"));
		tourEntities.add(new TourEntity(52, "Nashik", 2161, "harishchandragad", 3284478d, "Rainy"));
		tourEntities.add(new TourEntity(53, "coimbatore", 9998, "Adiyogi Shiva statue", 2462376d, "Winter"));
		tourEntities.add(new TourEntity(54, "uttarakhand ", 1207, "Kedarnath", 82468d, "Rainy"));

		TourDAO dao = new TourDAOImpl();
		dao.putAll(tourEntities);
	}
}
