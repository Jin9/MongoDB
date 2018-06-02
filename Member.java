import org.bson.Document;
import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;

import static java.util.Arrays.asList;
import static com.mongodb.client.model.Filters.eq;

public class Member {

	public static void insertOne(MongoDatabase db) {
		// TODO Auto-generated method stub
		try{
			db.createCollection("members");
		} 
		catch (com.mongodb.MongoCommandException e){
			System.out.println("Collection members already exists.");
		}
		
		db.getCollection("members").insertOne(
				new Document("name" , "Del Mare")
				.append("address" , 
						new Document()
							.append("street", "2 Av. del Torro")
							.append("zipcode", 10726))
				.append("grades", asList(
						new Document().append("grade", "good"),
						new Document().append("grade", "very good"))
						)
				.append("id",123456)
				
				);
	}

	public static void showAllMembers(MongoDatabase db){
		FindIterable<Document> iterable = db.getCollection("members").find();
		iterable.forEach(new Block<Document>() {
			@Override
			public void apply(final Document doc){
				System.out.println(doc);
			}
		});
	}
	
	public static void findMembersByName(MongoDatabase db,String name){
		FindIterable<Document> iterable = db.getCollection("members").find(eq("name",name));
		for (Document doc : iterable){
			System.out.println(doc);
		}
	}

	

}
